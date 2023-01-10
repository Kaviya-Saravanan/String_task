package com.wrkspot.string_task;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringCollection {
    public static void main(String[]args){
    String name = "Can I block your calender from 5:30pm to 6pm today to review/discuss on test case scenarios for HK dashboard cards ";
    List<String> n = Arrays.asList(name.split("\u0020"));
		Collections.sort(n,Comparator.comparingInt(String::length).reversed());
		for(String f :n)

    {
        System.out.println("f");
    }
}