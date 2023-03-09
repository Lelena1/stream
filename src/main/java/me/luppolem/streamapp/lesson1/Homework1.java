package me.luppolem.streamapp.lesson1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Homework1 {
    public static void main(String[] args) {


        System.out.println("Task 1");
        Stream<Integer>integerStream = Stream.of(1,5,2,8,4,9,2,1,4,2);
        findMinMax(integerStream,Integer::compareTo,(x,y)-> System.out.println("min: " + x + ", max: " + y));
        System.out.println("==================================");

//        Random random = new Random();
//        for (int i = 0; i < 20; i++) {
//            intList.add(random.nextInt(200));
//        }
//        System.out.println(intList);
//
//        System.out.println("Максимальное число:");
//
//        System.out.println(intList.stream()
//
//                .max(Comparator.naturalOrder())
//                .get());
//        System.out.println("=============================");
//
//        System.out.println("Минимальное число:");
//        System.out.println(intList.stream()
//
//                .min(Comparator.naturalOrder())
//                .get());
//        System.out.println("=============================");

        System.out.println("Task2");
        Random random2 = new Random();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            integerList.add(random2.nextInt(500));
        }
        System.out.println(integerList);
        System.out.println("=============================");
        System.out.println("Количество четных чисел в стриме:");
        System.out.println(integerList.stream()
                .filter(x -> x % 2 == 0)
                .count());
    }



    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<Integer, Integer> minMaxConsumer) {
        List<T> list = stream.collect(Collectors.toList());
        if (list.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            list.sort(order);
            minMaxConsumer.accept((Integer) list.get(0), (Integer) list.get(list.size() - 1));
        }
    }

}
