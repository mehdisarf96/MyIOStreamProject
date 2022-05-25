package com.mehdisarf.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamTest {

    private static final String FILE_PATH = "F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/bufferedinputstream/message.txt";

    public static void firstMethod() throws IOException {

        FileInputStream inputStream = new FileInputStream(FILE_PATH); // attach a InputStream to an existing file.

        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream); // attach a buffer to a FileInputStream.

        String str = "";

        int readByte;
        while ((readByte = bufferedInputStream.read()) != -1)
            str = str + (char)readByte;

        System.out.println(str);

        bufferedInputStream.close();
        inputStream.close();
    }

    private static void secondMethod() throws IOException {

        FileInputStream inputStream = new FileInputStream(FILE_PATH); // attach a InputStream to an existing file.

        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream); // attach a buffer to a FileInputStream.

        byte[] myEmptyByteArray = new byte[50];

        bufferedInputStream.read(myEmptyByteArray); // mikhune va mirize tuye myEmptyByteArray.

        String str = new String(myEmptyByteArray);

        System.out.println(str);

        bufferedInputStream.close();
        inputStream.close();
    }

    private static void thirdMethod() throws IOException {

        FileInputStream inputStream = new FileInputStream(FILE_PATH); // attach a InputStream to an existing file.

        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream); // attach a buffer to a FileInputStream.

        System.out.println("File support mark? " + inputStream.markSupported());
        System.out.println("Buffer support mark? " + bufferedInputStream.markSupported());
        System.out.println();

        System.out.print((char) bufferedInputStream.read());
        System.out.print((char) bufferedInputStream.read());
        System.out.print((char) bufferedInputStream.read());
        System.out.print((char) bufferedInputStream.read());
        System.out.print((char) bufferedInputStream.read());
        System.out.print((char) bufferedInputStream.read());

        bufferedInputStream.mark(10); // how long u want this mark to be valid?
        // the maximum limit of bytes that can be read before the mark position becomes invalid.

        System.out.print((char) bufferedInputStream.read());
        System.out.print((char) bufferedInputStream.read());
        System.out.print((char) bufferedInputStream.read());
        System.out.print((char) bufferedInputStream.read());
        System.out.print((char) bufferedInputStream.read());
        bufferedInputStream.reset();
        System.out.print((char) bufferedInputStream.read());
        System.out.print((char) bufferedInputStream.read());
        System.out.print((char) bufferedInputStream.read());
        System.out.print((char) bufferedInputStream.read());
        System.out.print((char) bufferedInputStream.read());

        bufferedInputStream.close();
        inputStream.close();
    }



    public static void main(String[] args) throws IOException {
        thirdMethod();
    }
}
