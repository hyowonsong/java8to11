package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("hyowon");
        names.add("songsong");
        names.add("toby");
        names.add("foo");

        List<String> collect = names.stream().map((s)-> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println("==========");

        names.forEach(System.out::println);
    }
}