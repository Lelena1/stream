package me.luppolem.streamapp.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public int getSum(int x, int y) {
        return x + y;
    }

    public int getDivide(int x, int y) {
        return x / y;
    }

    public int getMultiple(int x, int y) {
        return x * y;
    }

    List<String> listAnimal = new ArrayList<>();

    public List<String> getListAnimal(String animal) {
        listAnimal.add(animal);
        return listAnimal;
    }
}
