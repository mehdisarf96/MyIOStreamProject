package com.mehdisarf.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamPractice {
    public static void main(String[] args) {

        try {

            // F:\Java SE 2022\IO Stream\IO Stream Projects\MyIOStreamProject\src\com\mehdisarf\fileinputstream\mehdi.txt
            // backslash ha tabdil mishan be forward slash.
            FileInputStream inputStream = new FileInputStream("F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/fileinputstream/mehdi.txt");

            System.out.println(inputStream.available()); // returns 23.
            // available(): number of remaining byte that can be read from this input stream
            // tuye mehdi.txt dashtim "salam mehdi :) chetori?" ke 23 character e.

            inputStream.read(); // return 115. va age cast esh koni be char, va un char ro print koni, 's' chap mishe.

            System.out.println(inputStream.available()); // return 22

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
