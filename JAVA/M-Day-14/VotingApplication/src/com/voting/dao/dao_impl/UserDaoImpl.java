package com.voting.dao.dao_impl;

import com.voting.dao.UserDao;
import com.voting.model.User;

import static com.voting.database.DatabaseConnectivity.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    private Connection connection;
    private PreparedStatement preStm1;
    private PreparedStatement preStm2;

    public UserDaoImpl() throws SQLException, ClassNotFoundException {
        //open connection
        connection = openConnection();

        //prepare statement login
        preStm1 = connection.prepareStatement("select * from users where email=? and password=?");



    }

    @Override
    public User signIn(String email, String password) throws SQLException {
        preStm1.setString(1, email);
        preStm1.setString(2, password);

        try (ResultSet rs = preStm1.executeQuery()) {
            if (rs.next()) {
                return new User(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getDate(6),
                        rs.getBoolean(7), rs.getString(8));
            }
        }

        return null;
    }

    @Override
    public String castVote(User user) {
        if (!user.isVotingStatus()) {

        }

        return "";
    }
}
