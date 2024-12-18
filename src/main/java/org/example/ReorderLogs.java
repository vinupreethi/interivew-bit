package org.example;


import java.util.*;

public class ReorderLogs {
    public static void main(String args[])
    {

        String a[]={"a1-9-2-3-1","g1-act-car","zo4-4-7","ab1-off-key-dog","a8-act-zoo"};
        List<String> letter_logs=new ArrayList<>();
        List<String> digit_logs=new ArrayList<>();

        HashMap<String,String> letter=new HashMap<>();
        HashMap<String,String> digit=new HashMap<>();

        String split1 = Arrays.toString(a[0].split("-",2));
        System.out.println("split1. = " + split1);




        
    }
}
