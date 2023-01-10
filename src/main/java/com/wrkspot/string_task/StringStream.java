package com.wrkspot.string_task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class StringStream {
    public static void main(String[] args) {
        String name="Can I block your calender from 5:30pm to 6pm today to review/discuss on test case scenarios for HK dashboard cards ";
        List<String>n=Arrays.asList(name.split("\u0020"));
        Comparator <String>result=(s1,s2)->(s2.length()-s1.length());
        n.stream().sorted(result).forEach(System.out::println);

    }
}
