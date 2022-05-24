package com.mehdisarf.fileoutputstream;

import java.util.Arrays;

public class StringToBytesPractice {
    public static void main(String[] args) {

        byte[] bytes = new byte[10];
        char[] chars = {'A', 'B', 'C', 'a', 'b', 'c'};

        for (int i = 0; i < chars.length; i++) {
            bytes[i] = (byte) chars[i];
        }
        System.out.println(Arrays.toString(bytes));

        String s = "ABCabc";
        System.out.println(Arrays.toString(s.getBytes()));

        //String myString = "Hello Mehdi :D";
        //System.out.println(Arrays.toString(myString.getBytes()));
    }
}
