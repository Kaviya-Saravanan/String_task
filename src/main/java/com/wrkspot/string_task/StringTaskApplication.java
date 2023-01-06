package com.wrkspot.string_task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StringTaskApplication {

    public static void main(String[] args) {

        String i1="Can I block Your calender from 5:30pm to 6pm today to review/discuss on test case scenarios for HK dashboard cards";
        String i=" ";
        for(int k=i1.length()-1;k>=0;k--)
            i=i+i1.charAt(k);
        String a[]=i.split(" ");
        int len=a.length;
        for(int k=0;k<a.length;k++){
            for(int j=0;j<a.length;j++){
                if(a[k].length()>a[j].length())
                {
                    String temp=a[k];
                    a[k]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]+" ");
        }


    }

}
