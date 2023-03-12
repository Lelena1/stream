package me.luppolem.streamapp.lesson2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static me.luppolem.streamapp.lesson2.constants.GreetingsServiceTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

class GreetingsServiceParametrizedTest {
   private final GreetingsService out = new GreetingsService();

    @Test
    public void shouldReturnDefaultMessageWhenNameIsNotExists() {
        String result = out.generateGreetings();
        assertTrue(result.contains(DEFAULT_NAME));
        assertEquals(DEFAULT_MESSAGE,result);

    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldGenerateCorrectMessages(String inputName, String messageName, String expectedMessage) {

        String result = out.generateGreetings(inputName);
        assertTrue(result.contains(messageName));
        assertEquals(expectedMessage,result);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNameContainsIllegalCharacters() {
        assertThrows(IllegalArgumentException.class,()->out.generateGreetings(ILLEGAL_CHARACTERS_NAME)
        );
    }
    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(null, DEFAULT_NAME, DEFAULT_MESSAGE),
                Arguments.of(EMPTY_NAME, DEFAULT_NAME, DEFAULT_MESSAGE),
                Arguments.of(ONLY_SPACES_NAME, DEFAULT_NAME, DEFAULT_MESSAGE),
                Arguments.of(CORRECT_NAME, CORRECT_NAME, CORRECT_MESSAGE),
                Arguments.of(UPPER_CASE_NAME, CORRECT_NAME, CORRECT_MESSAGE),
                Arguments.of(LOVER_CASE_NAME, CORRECT_NAME, CORRECT_MESSAGE)
        );

    }

}