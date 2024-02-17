package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class OptionalApi {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        Optional<OnlineClass> optional = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        OnlineClass onlineClass = optional.orElseThrow(() ->{
            return new IllegalArgumentException();
        });
        System.out.println(onlineClass.getTitle());
    }

    private static OnlineClass createNewClasses(){
        System.out.println("creating new online class");
        return new OnlineClass(10,"New class",false);
    }
}