package me.luppolem.streamapp.lesson2.homework2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private static final String LOGIN = "login";
    private static final String EMAIL = "e@ma.il";

    @Test
    public void shouldCreatObjectUserWithTwoParams() {

        User out = new User(LOGIN, EMAIL);
        String resultLogin = out.getLogin();
        String resultEmail = out.getEmail();

        assertEquals(LOGIN, resultLogin);
        assertEquals(EMAIL, resultEmail);
    }

    @Test
    public void shouldCreatObjectUserWithNoParams() {
        User out = new User();
        String resultLogin = out.getLogin();
        String resultEmail = out.getEmail();
        assertEquals(null, resultLogin);
        assertEquals(null, resultEmail);

    }

    @Test
    public void shouldSetCorrectEmail() {

        User out = new User();
        String resultEmail = out.getEmail();
        assertTrue(EMAIL.contains("@") && EMAIL.contains("."));
    }

    @Test
    public void shouldNotBeEqualLoginAndEmail() {

        User out = new User();
        String resultLogin = out.getLogin();
        String resultEmail = out.getEmail();
        assertNotEquals(LOGIN == EMAIL, resultLogin == resultEmail);

    }
}