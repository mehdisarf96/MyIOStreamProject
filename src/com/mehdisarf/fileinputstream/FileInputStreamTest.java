package com.mehdisarf.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamTest {

    public static void firstMethod() {
        try {
            // F:\Java SE 2022\IO Stream\IO Stream Projects\MyIOStreamProject\src\com\mehdisarf\fileinputstream\mehdi.txt
            // backslash ha tabdil mishan be forward slash.
            FileInputStream inputStream = new FileInputStream("F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/fileinputstream/mehdi.txt");

            byte[] myByteArray = new byte[inputStream.available()];

            inputStream.read(myByteArray); // mikhune va mirize tu myByteArray.
            // hameye bytes haro baham va yekja az file khund.

            String str = new String(myByteArray);

            System.out.println(str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void secondMethod() {
        try {
            // F:\Java SE 2022\IO Stream\IO Stream Projects\MyIOStreamProject\src\com\mehdisarf\fileinputstream\mehdi.txt
            // backslash ha tabdil mishan be forward slash.
            FileInputStream inputStream = new FileInputStream("F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/fileinputstream/mehdi.txt");

            char[] myCharArray = new char[inputStream.available()];

            // mikham byte be byte (1byte, 1byte) az file bekhunam.
            for (int i = 0; i < myCharArray.length; i++) {
                myCharArray[i] = (char) inputStream.read();
            }

            String str = new String(myCharArray);

            System.out.println(str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void thirdMethod() {
        try {
            // F:\Java SE 2022\IO Stream\IO Stream Projects\MyIOStreamProject\src\com\mehdisarf\fileinputstream\mehdi.txt
            // backslash ha tabdil mishan be forward slash.
            FileInputStream inputStream = new FileInputStream("F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/fileinputstream/mehdi.txt");

            byte[] myByteArray = new byte[inputStream.available()];

            // mikham byte be byte (1byte, 1byte) az file bekhunam.
            inputStream.read(myByteArray,3, myByteArray.length-3);

            String str = new String(myByteArray);

            System.out.println(Arrays.toString(myByteArray));
            System.out.println(str);

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
