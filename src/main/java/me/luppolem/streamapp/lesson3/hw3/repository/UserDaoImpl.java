package me.luppolem.streamapp.lesson3.hw3.repository;

import me.luppolem.streamapp.lesson3.hw3.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private final List<User> users;

    public UserDaoImpl() {
        this.users = Arrays.asList(
                new User("Elena"),
                new User("Maria"),
                new User("Olga"),
                new User("Victoria"),
                new User("Stella")

        );
    }

    @Override
    public String getUserByName(String name) {
        if (users.contains(new User(name))) {
            return name;
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users;

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
