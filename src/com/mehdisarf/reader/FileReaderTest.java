package com.mehdisarf.reader;

import java.io.*;
import java.util.Arrays;

public class FileReaderTest {

    public static void firstMethod() {
        try {
            // F:\Java SE 2022\IO Stream\IO Stream Projects\MyIOStreamProject\src\com\mehdisarf\reader\mehdi.txt
            // backslash ha tabdil mishan be forward slash.
            FileReader reader = new FileReader("F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/reader/mehdi.txt");

            // char[] myCharArray = new char[reader.--];
            // FileReader method ii mesle available() ke tuye InputStream dashtim, nadare.
            // alan ma nemidunim size e myCharArray ro chand bedim.
            // che rahi hast? mitunim az class e File estefade konim.

            File myFile = new File("F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/reader/mehdi.txt");
            char[] myCharArray = new char[(int) myFile.length()];

            reader.read(myCharArray); // mikhune va mirize tu myCharArray.
            // hame ro baham va yekja az file khund.

            System.out.println(Arrays.toString(myCharArray));
            System.out.println(String.valueOf(myCharArray));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void secondMethod() {
        try {

            // F:\Java SE 2022\IO Stream\IO Stream Projects\MyIOStreamProject\src\com\mehdisarf\reader\mehdi.txt
            // backslash ha tabdil mishan be forward slash.
            FileReader reader = new FileReader("F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/reader/mehdi.txt");

            // FileReader method ii mesle available() ke tuye InputStream dashtim, nadare.
            // che rahi hast? mitunim az class e File estefade konim.

            File myFile = new File("F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/reader/mehdi.txt");

            char[] myCharArray = new char[(int) myFile.length()];

            // mikham character be character az file bekhunam.
            for (int i = 0; i < myCharArray.length; i++) {
                myCharArray[i] = (char) reader.read();
            }

            System.out.println(Arrays.toString(myCharArray));
            System.out.println(String.valueOf(myCharArray));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        secondMethod();
    }
}
