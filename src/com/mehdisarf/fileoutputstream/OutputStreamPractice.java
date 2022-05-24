package com.mehdisarf.fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamPractice {
    public static void main(String[] args) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/fileoutputstream/practice.txt");

            fileOutputStream.write(65);
            fileOutputStream.write(66);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
