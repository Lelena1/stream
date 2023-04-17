package me.luppolem.streamapp.lesson3.hw3.service;

import me.luppolem.streamapp.lesson3.hw3.User;
import me.luppolem.streamapp.lesson3.hw3.repository.UserDao;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Boolean checkUserExist(User user) {

        return userDao.getUserByName(user.getName()) != null;
    }
}
