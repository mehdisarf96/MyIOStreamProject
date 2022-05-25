package com.mehdisarf.bufferedreader;

import java.io.*;

public class BufferedReaderTest {
    // in hamun BufferedInputStreamTest.java e. faqat va faqat FileInputStream ro kardam FileReader
    // va BufferedInputStream ro kardam BufferReader. kuchektarin taqiri daresh nadadam
    // va mibini ke kar kard.

    private static final String FILE_PATH = "F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/bufferedinputstream/message.txt";

    public static void firstMethod() throws IOException {

        FileReader fileReader = new FileReader(FILE_PATH); // attach a InputStream to an existing file.

        BufferedReader bufferedReader = new BufferedReader(fileReader); // attach a buffer to a FileReader.
        // BufferedInputStream ro be FileInputStream mituni vasl va attach koni
        // va BufferedReader ro be FileReader mituni vasl va attach koni.

        String str = "";

        int readByte;
        while ((readByte = bufferedReader.read()) != -1)
            str = str + (char)readByte;

        System.out.println(str);

        bufferedReader.close();
        fileReader.close();
    }

    private static void secondMethod() throws IOException {

        FileReader fileReader = new FileReader(FILE_PATH); // attach a InputStream to an existing file.

        BufferedReader bufferedReader = new BufferedReader(fileReader); // attach a buffer to a FileReader.
        // BufferedInputStream ro be FileInputStream mituni vasl va attach koni
        // va BufferedReader ro be FileReader mituni vasl va attach koni.

        char[] myEmptyCharArray = new char[50];

        bufferedReader.read(myEmptyCharArray); // mikhune va mirize tuye myEmptyCharArray.

        String str = new String(myEmptyCharArray);

        System.out.println(str);

        bufferedReader.close();
        fileReader.close();
    }

    private static void thirdMethod() throws IOException {

        FileReader fileReader = new FileReader(FILE_PATH); // attach a InputStream to an existing file.

        BufferedReader bufferedReader = new BufferedReader(fileReader); // attach a buffer to a FileInputStream.

        System.out.println("File support mark? " + fileReader.markSupported());
        System.out.println("Buffer support mark? " + bufferedReader.markSupported());
        System.out.println();

        System.out.print((char) bufferedReader.read());
        System.out.print((char) bufferedReader.read());
        System.out.print((char) bufferedReader.read());
        System.out.print((char) bufferedReader.read());
        System.out.print((char) bufferedReader.read());
        System.out.print((char) bufferedReader.read());

        bufferedReader.mark(10); // how long u want this mark to be valid?
        // the maximum limit of bytes that can be read before the mark position becomes invalid.

        System.out.print((char) bufferedReader.read());
        System.out.print((char) bufferedReader.read());
        System.out.print((char) bufferedReader.read());
        System.out.print((char) bufferedReader.read());
        System.out.print((char) bufferedReader.read());
        bufferedReader.reset();
        System.out.print((char) bufferedReader.read());
        System.out.print((char) bufferedReader.read());
        System.out.print((char) bufferedReader.read());
        System.out.print((char) bufferedReader.read());
        System.out.print((char) bufferedReader.read());

        bufferedReader.close();
        fileReader.close();
    }

    public static void fourthMethod() throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String str = bufferedReader.readLine(); // in tuye BufferedInputStream nabud.
        // because this is for character and set of character makes a string.
        System.out.println(str);

        bufferedReader.close();
        fileReader.close();
    }

    public static void main(String[] args) throws IOException {
        fourthMethod();
    }
}
