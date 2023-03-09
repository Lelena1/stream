package me.luppolem.streamapp.lesson1;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WebinarExample {

    public static void main(String[] args) {

        String stroka = new String("ABCDE");
        Function<String, Integer> function = String::length;
        System.out.println(function.apply(stroka));

        List<String> list = new ArrayList<>();
        init(list);
        String[] arrString = {"a", "b", "c", "d"};
        Stream<String> streamFromCollection = list.stream();
        Stream<Integer> integerStreamOf = Stream.of(1, 2, 3, 4, 5, 6, 7);
        Stream<String> stringStreamOf = Stream.of("a", "b", "c");
        Stream<String> arrStream = Arrays.stream(arrString);
        Arrays.stream(arrString);
        Stream<Integer> iterate = Stream.iterate(2, x -> x + 2);
        iterate.forEach(System.out::println);
        iterate.limit(15)
                .skip(3)
                .forEach(System.out::println);
        Map<Integer, String> map = list.stream()
                .map(String::toLowerCase)
                .sorted()
                .collect(Collectors.toMap(String::hashCode, x -> x));

        System.out.println(map);

        Random random = new Random();
        List<User>listUsers=new ArrayList<>();
        for(int i=0; i<10; i++){

            listUsers.add(new User (i,random.nextInt(120)));
        }
        System.out.println(listUsers);
        System.out.println("----------------------");
        listUsers.stream()
                .filter(u->u.getAge()<18)
                .forEach(System.out::println);
        System.out.println(listUsers.stream()
                .anyMatch(u->u.getAge()<18));

        System.out.println(listUsers.stream()
                .filter(u->u.getAge()>180)
                .findAny());

    }


    public static void init(List<String> list) {
        list.add("Cat");
        list.add("Dog");
        list.add("Pig");
        list.add("Mouse");
        list.add("Eagle");
        list.add("Coc");
        list.add("Crocodile");
    }


}
