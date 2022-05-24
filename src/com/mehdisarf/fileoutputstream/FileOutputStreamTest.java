package com.mehdisarf.fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamTest {

    public static void firstMethod() {

        try {
            // F:\Java SE 2022\IO Stream\IO Stream Projects\MyIOStreamProject\src\com\mehdisarf\fileoutputstream
            // backslash ha tabdil mishan be forward slash.
            FileOutputStream fileOutputStream = new FileOutputStream("F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/fileoutputstream/mehdi.txt");
            // ba hamin yek khat e bala, fileemun sakhte mishe.

            String myString = "Hello Mehdi :D";
            fileOutputStream.write(myString.getBytes()); // hameye bytes haro baham va yekja tu file neveshtam.

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void secondMethod() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/fileoutputstream/mehdi.txt");

            String myString = "Hello Mehdi :D";

            // hala mikham byte be byte (1byte, 1byte) tuye file benevisam.
            byte[] bytes = myString.getBytes();
            for (byte b : bytes) {
                fileOutputStream.write(b);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void thirdMethod() {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/fileoutputstream/mehdi.txt");

            String myString = "Hello Mehdi :D";
            byte[] bytes = myString.getBytes();

            fileOutputStream.write(bytes, 6, 8);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        thirdMethod();
    }
}
