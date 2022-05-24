package com.mehdisarf.tasks.copyingfiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAndConvertFromUppercaseToLowercase {

    private final static String PATH = "F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/tasks/copyingfiles/source.txt";
    private final static String DEST_PATH = "F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/tasks/copyingfiles/dest.txt";

    public static void copy() throws IOException {

        FileInputStream inputStream = new FileInputStream(PATH);

        byte[] bytes = new byte[inputStream.available()];

        inputStream.read(bytes);

        /*
            A-Z  (65-90)
            a-z  (97-122)

            pas code e harkodum bayad 32ta ezaf va plus she
            ta az uppercase tabdil she be lower case
         */
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] > 65 && bytes[i] < 90) // nemikham space o mabaqi ham 32ta ezaf shan.
                bytes[i] = (byte) (bytes[i] + 32);
        }

        FileOutputStream outputStream = new FileOutputStream(DEST_PATH);
        outputStream.write(bytes);

        inputStream.close();
        outputStream.close();
    }

    private static void copyAnotherWay() throws IOException {

        FileInputStream inputStream = new FileInputStream(PATH);
        FileOutputStream outputStream = new FileOutputStream(DEST_PATH);

        int readByte;

        while ((readByte = inputStream.read()) != -1) {
            if (readByte > 65 && readByte < 90)
                outputStream.write(readByte + 32);
            else
                outputStream.write(readByte);
        }

        inputStream.close();
        outputStream.close();
    }

    public static void main(String[] args) throws IOException {
        copy();
    }
}
