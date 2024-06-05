package com.voting.dao;

import com.voting.model.User;

import java.sql.SQLException;
import java.util.Scanner;

public interface UserDao {

    User signIn(String email, String password) throws SQLException;

    String castVote(User user, Scanner sc) throws SQLException;

    void adminWork(User user, Scanner sc) throws SQLException;

    // cleanup resources
    void cleanUp() throws SQLException;
}
