package com.mehdisarf.writer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void firstMethod() {

        try {

            // F:\Java SE 2022\IO Stream\IO Stream Projects\MyIOStreamProject\src\com\mehdisarf\fileoutputstream
            // backslash ha tabdil mishan be forward slash.
            FileWriter writer = new FileWriter("F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/writer/mehdi.txt");
            // ba hamin yek khat e bala, fileemun sakhte mishe.

            String myString = "Hello Mehdi :D how are you?";

            writer.write(myString);

            writer.close(); // ta close nakardam, hichi neveshte nashod tu file.

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void secondMethod() {
        try {
            FileWriter writer = new FileWriter("F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/writer/mehdi.txt");

            String myString = "Hello Mehdi :D how are you?";
            char[] chars = myString.toCharArray();

            writer.write(chars);

            writer.close(); // ta close nakardam, hichi neveshte nashod tu file.

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void thirdMethod() {
        try {

            FileWriter writer = new FileWriter("F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/writer/mehdi.txt");

            String myString = "Hello Mehdi :D how are you?";

            for (char c: myString.toCharArray())
                writer.write(c);

            /*
            // injuram mishe:
            for (int i = 0; i < myString.length(); i++) {
                writer.write(myString.charAt(i));
            }
             */

            writer.close(); // ta close nakardam, hichi neveshte nashod tu file.

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void fourthMethod() {
        try {
            FileWriter writer = new FileWriter("F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/writer/mehdi.txt");

            String myString = "Hello Mehdi :D how are you?";

            writer.write(myString,2,7);

            writer.close(); // ta close nakardam, hichi neveshte nashod tu file.

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        fourthMethod();
    }
}
