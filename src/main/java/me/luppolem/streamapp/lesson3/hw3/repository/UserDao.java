package me.luppolem.streamapp.lesson3.hw3.repository;

import me.luppolem.streamapp.lesson3.hw3.User;

import java.util.List;

public interface UserDao {

    String getUserByName(String name);

    List<User> findAllUsers();
}
