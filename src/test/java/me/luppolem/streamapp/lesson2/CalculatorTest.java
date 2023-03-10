package me.luppolem.streamapp.lesson2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CalculatorTest {
    private static final List<String> CORRECT_LIST = new ArrayList<>();
    private static int x;
    private static int y;
    static Calculator calculator;

    @BeforeAll
    public static void initFields() {
        x = 10;
        y = 5;
        calculator = new Calculator();
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Testing is finish");
    }

    @Test
    void shouldGetSum() {

        Assertions.assertEquals(15, calculator.getSum(x, y));
    }

    @Test
    void shouldGetDivide() {
        Assertions.assertEquals(2, calculator.getDivide(x, y));
    }

    @Test
    void shouldGetMultiple() {
        Assertions.assertEquals(50, calculator.getMultiple(x, y));
    }

    @Test
    void shouldReturnListAnimal() {
        CORRECT_LIST.add("Dog");
        Assertions.assertEquals(CORRECT_LIST.size(), calculator.getListAnimal("Dog").size());
    }
}