package com.mehdisarf.bytearrayoutputstream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamTest {

    public static void firstMethod() throws IOException {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(10); // it will create a byte array by itself.
        // its Doc:     'buf = new byte[size];'

        byte[] bytes = {'s','a','l','a','m'}; // it's ok because of narrowing in java.

        outputStream.write(bytes);

        System.out.println(outputStream);
    }

    public static void secondMethod() throws IOException {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(10); // it will create a byte array by itself.
        // its Doc:     'buf = new byte[size];'

        outputStream.write(65);
        outputStream.write('b'); // int migire vali char ro mishe rikht tu int.

        System.out.println(outputStream);
    }

    public static void thirdMethod() throws IOException {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(10); // it will create a byte array by itself.
        // its Doc:     'buf = new byte[size];'

        outputStream.write(65);
        outputStream.write('b'); // int migire vali char ro mishe rikht tu int.

        byte[] bytes = outputStream.toByteArray();
        String str = new String(bytes);

        System.out.println(str);
    }

    public static void fourthMethod() throws IOException {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(10); // it will create a byte array by itself.
        // its Doc:     'buf = new byte[size];'

        outputStream.write(65);
        outputStream.write('b'); // int migire vali char ro mishe rikht tu int.

        outputStream.writeTo(new FileOutputStream("F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/bytearrayoutputstream/mycontent.txt"));
    }


    public static void main(String[] args) throws IOException {
        fourthMethod();
    }
}
