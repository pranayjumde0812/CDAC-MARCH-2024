package com.voting.dao.dao_impl;

import com.voting.dao.UserDao;
import com.voting.model.User;

import java.sql.*;
import java.util.Scanner;

import static com.voting.database.DatabaseConnectivity.*;

public class UserDaoImpl implements UserDao {
    private Connection connection;
    private PreparedStatement preStm1;
    private PreparedStatement preStm2;
    private PreparedStatement preStm3;
    private PreparedStatement preStm4;
    private Statement stm1;

    public UserDaoImpl() throws SQLException, ClassNotFoundException {
        //open connection
        connection = openConnection();

        //prepare statement login
        preStm1 = connection.prepareStatement("select * from users where email=? and password=?");

        //update voting status
        preStm2 = connection.prepareStatement("update users set status=? where user_id=?");

        //get candidate total votes
        preStm4 = connection.prepareStatement("select votes from candidates where name=?");

        //prepare statement login
        preStm3 = connection.prepareStatement("update candidates set votes=? where name=?");

        stm1 = connection.createStatement();
    }

    @Override
    public User signIn(String email, String password) throws SQLException {
        preStm1.setString(1, email);
        preStm1.setString(2, password);

        try (ResultSet rs = preStm1.executeQuery()) {
            if (rs.next()) {
                return new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getBoolean(7), rs.getString(8));
            }
        }

        return null;
    }

    @Override
    public String castVote(User user, Scanner sc) throws SQLException {
        String name = null;

        if (user == null) return "Invalid user";

        if (!user.isVotingStatus()) {
            System.out.println("Status Updated");

            System.out.println("Candidate List : Select Number");
            System.out.println("1. Ravi (BJP)");
            System.out.println("2. Asha (NCP)");
            System.out.println("3. Kiran (CONGRESS)");
            System.out.println("4. SUBHASH (AAP)");
            switch (sc.nextInt()) {
                case 1:
                    name = "ravi";
                    break;
                case 2:
                    name = "asha";
                    break;
                case 3:
                    name = "kiran";
                    break;
                case 4:
                    name = "subhash";
                    break;
            }

            preStm4.setString(1, name);

            try (ResultSet voteCount = preStm4.executeQuery()) {
                if (voteCount.next()) preStm3.setInt(1, voteCount.getInt(1) + 1);
                preStm3.setString(2, name);
                preStm3.executeUpdate();

                preStm2.setBoolean(1, true);
                preStm2.setInt(2, user.getUserId());
                preStm2.executeUpdate();

                return "Hello, " + user.getFirstName() + "\nYou have casted the vote successfully" + "\nThank You for your important vote";
            }
        }

        return "Hello, " + user.getFirstName() + "\nyou have already voted." + "\nThank You for your important vote";
    }

    @Override
    public void adminWork(User user, Scanner sc) throws SQLException {

        System.out.println("Welcome Admin " + user.getFirstName());
        System.out.println("---------------------------------------------------");
        boolean exit = false;
        while (!exit) {
            System.out.println("Select Operation : \n1. Top two highest voted candidates \n2. Party wise vote analysis \n3. Exit");
            switch (sc.nextInt()) {
                case 1:
                    try (ResultSet resultSet = stm1.executeQuery("select * from candidates order by votes desc limit 2")) {
//                        System.out.println("Id      Name     Votes     Party");
                        System.out.printf("%-7s %-10s %-10s %-20s%n", "Id", "Name", "Votes", "Party");
                        while (resultSet.next()) {
                            System.out.printf("%-7d %-10s %-10d %-20s%n",
                                    resultSet.getInt(1),
                                    resultSet.getString(2),
                                    resultSet.getInt(3),
                                    resultSet.getString(4));

//                            System.out.println(resultSet.getInt(1) + "      " + resultSet.getString(2) + "      " + resultSet.getInt(3) + "       " + resultSet.getString(4));
                        }
                    }
                    break;
                case 2:
                    try (ResultSet resultSet = stm1.executeQuery("select party_name, votes from candidates group by party_name order by votes desc ")) {
                        System.out.println("Party_Name    Total_votes");
                        while (resultSet.next()) {
                            System.out.printf("%-18s %d", resultSet.getString(1), resultSet.getInt(2));
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    exit = true;
                    break;
            }
        }

    }

    // add clean up method to close DB resources
    @Override
    public void cleanUp() throws SQLException {
        if (preStm1 != null) preStm1.close();
        if (preStm2 != null) preStm2.close();
        if (preStm3 != null) preStm3.close();
        if (preStm4 != null) preStm4.close();

        closeConnection();
    }
}
