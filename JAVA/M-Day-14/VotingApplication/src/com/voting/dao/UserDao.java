package com.voting.dao;

import com.voting.model.User;

import java.sql.SQLException;

public interface UserDao {

    User signIn(String email, String password) throws SQLException;

    String castVote(User user);
}