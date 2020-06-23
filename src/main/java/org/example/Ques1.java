package org.example;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Ques1 {
    public static void main(String args[])
    {
        IntStream stream = IntStream.of(15, 17, 23, 27, 32, 38, 47, 50);
        OptionalDouble obj = stream.average();
        if(obj.isPresent()) {
            System.out.println("Average will be :- " + obj.getAsDouble());
        } else {
            System.out.println(-1);
        }
    }
}
