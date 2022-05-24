package com.mehdisarf.bytearrayinputstream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamTest {

    public static void firstMethod() throws IOException {

        byte[] bytes = {'A','B','C','D','E','F','G','H'}; // it's ok because of narrowing in java.

        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);

        int readByte;
        while ((readByte =inputStream.read()) != -1 )
            System.out.print((char) readByte);

        inputStream.close();
    }

    public static void main(String[] args) throws IOException {
        firstMethod();

        /*
        byte[] bytes = {'A','B','C','D','E','F','G','H'}; // it's ok because of narrowing in java.
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
        inputStream.markSupported(); // return true. because it's an array.
        // from that array, we can read data multiple times. ye data ro mishe dobare khund.
        // ama tu file intor nist. unja ye file pointer darim ke faqat jolo mire va aqab nemiad.
         */
    }
}
