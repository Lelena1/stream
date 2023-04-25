package me.luppolem.streamapp.lesson3.hw3.service;

import me.luppolem.streamapp.lesson3.hw3.User;
import me.luppolem.streamapp.lesson3.hw3.repository.UserDaoImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    private static final User CORRECT_USER = new User("Elena");
    private static final User WRONG_USER = new User("Petr");
//    private static final String ELENA = "Elena";
//    private static final String PETR = "Petr";

    @Mock
    private UserDaoImpl daoMock;
    @InjectMocks
    private UserServiceImpl out;


    @Test
    public void shouldCheckThatUserExistInBD() {

        when(daoMock.getUserByName(CORRECT_USER.getName())).thenReturn(("Elena"));

        boolean userExistInBD = out.checkUserExist(new User("Elena"));
        assertTrue(userExistInBD);

    }

    @Test
    public void shouldCheckThatUserDoesNotExistInBD() {

        when(daoMock.getUserByName(WRONG_USER.getName())).thenReturn(null);

        boolean userExistInBD = out.checkUserExist(new User("Petr"));
        assertFalse(userExistInBD);

    }
}