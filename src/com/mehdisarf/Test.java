package com.mehdisarf;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {

        String myFilePath = "F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/reader/mehdi.txt";

        File myFile = new File(myFilePath);
        FileInputStream inputStream = new FileInputStream(myFilePath);
        FileReader reader = new FileReader(myFilePath);

        // "salam mehdi :) chetori?" has 23 character.
        // size of this file is 23 bytes. (Rclick+properties)
        System.out.println(myFile.length()); // 23
        System.out.println(inputStream.available()); // 23
    }
}
