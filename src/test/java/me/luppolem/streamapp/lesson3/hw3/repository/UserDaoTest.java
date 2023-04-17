package me.luppolem.streamapp.lesson3.hw3.repository;

import me.luppolem.streamapp.lesson3.hw3.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    private static final User CORRECT_USER = new User("Elena");
    private static final User WRONG_USER = new User("Petr");
    private final UserDaoImpl out = new UserDaoImpl();


    @Test
    public void shouldReturnUsersNameIfListExistsNameOfThisUser() {

        String result = out.getUserByName(CORRECT_USER.getName());

        assertNotNull(result);
        assertEquals(result, "Elena");

    }

    @Test
    public void shouldReturnNullIfListNotExistsNameOfThisUser() {

        String result = out.getUserByName(WRONG_USER.getName());

        assertNull(result);
        assertEquals(result, null);

    }
}