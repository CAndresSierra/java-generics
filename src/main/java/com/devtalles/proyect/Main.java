package com.devtalles.proyect;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("Camilo");

        System.out.println("stringBox.getValue() = " + stringBox.getValue());

        Box<Integer> integerBox = new Box<>(10);
        System.out.println("integerBox.getValue() = " + integerBox.getValue());

        Utility.printItem("Camilo", 1);
        Utility.printItem("Ancizar", 2);
        Utility.printItem(50);


        System.out.println(MathUtils.sum(2,3));
        System.out.println(MathUtils.sum(2,2));

        List<String> names = new ArrayList<>();
        names.add("Gabriel");
        names.add("Camilo");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        Main.printList(names);
        Main.sumOfNumbers(numbers);
        Main.addNumber(numbers);
    }

    public static void printList(List<?> list){
        for(Object o: list){
            System.out.println(o);
        }
    }

    public static void sumOfNumbers(List<? extends Number> numbers){
        double  sum = 0;

        for(Number num: numbers){
            sum += num.doubleValue();
        }

        System.out.println("Sum: " + sum);
    }

    public static void addNumber(List<? super Integer> numbers){
         numbers.add(3);
         numbers.add(4);
         numbers.add(5);

         Object num = numbers.get(0);

        System.out.println("Num: " + num);


    }
}