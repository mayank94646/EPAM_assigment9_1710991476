package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Ques2 {

    public static void main(String args[])
    {
        List<String> list = new ArrayList<>();
        list.add("bber");
        list.add("bbqrstu");
        list.add("br");
        list.add("bb");

        list = findStrings(list);

        for(String str : list)
            System.out.println(str);
    }

    static List<String> findStrings(List<String> list)
    {
        return list.stream().filter(str -> str.startsWith("b")).filter(str -> str.length()==3).collect(Collectors.toList());
    }
}
