package com.mehdisarf.tasks.copytwofilesinthirdfile;

import java.io.*;

public class CopyTwoFilesIntoThirdFile {

    private final static String PATH1 = "F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/tasks/copytwofilesinthirdfile/source1.txt";
    private final static String PATH2 = "F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/tasks/copytwofilesinthirdfile/source2.txt";
    private final static String DEST_PATH = "F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/tasks/copytwofilesinthirdfile/result.txt";

    private static void copy() throws IOException {

        FileInputStream inputStream1 = new FileInputStream(PATH1);
        FileInputStream inputStream2 = new FileInputStream(PATH2);
        FileOutputStream outputStream = new FileOutputStream(DEST_PATH);

        byte[] bytesFromSource1 = new byte[inputStream1.available()];
        inputStream1.read(bytesFromSource1); // khund va rikht tu bytesFromSource1.

        byte[] bytesFromSource2 = new byte[inputStream2.available()];
        inputStream2.read(bytesFromSource2); // khund va rikht tu bytesFromSource2.

        outputStream.write(bytesFromSource1);
        outputStream.write(bytesFromSource2);

        inputStream1.close();
        inputStream2.close();
        outputStream.close();
    }

    private static void copyAnotherWay() throws IOException {

        FileInputStream inputStream1 = new FileInputStream(PATH1);
        FileInputStream inputStream2 = new FileInputStream(PATH2);
        FileOutputStream outputStream = new FileOutputStream(DEST_PATH);

        int totalSize = inputStream1.available() + inputStream2.available();

        SequenceInputStream seqInputStream = new SequenceInputStream(inputStream1, inputStream2);

        byte[] bytes = new byte[totalSize];

        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) seqInputStream.read();
        }

        outputStream.write(bytes);

        inputStream1.close();
        inputStream2.close();
        seqInputStream.close();
        outputStream.close();
    }

    private static void copyAnotherWay2() throws IOException {

        FileInputStream inputStream1 = new FileInputStream(PATH1);
        FileInputStream inputStream2 = new FileInputStream(PATH2);
        FileOutputStream outputStream = new FileOutputStream(DEST_PATH);

        SequenceInputStream seqInputStream = new SequenceInputStream(inputStream1, inputStream2);

        int readByte;

        while ((readByte = seqInputStream.read()) != -1) {
            outputStream.write(readByte);
        }

        inputStream1.close();
        inputStream2.close();
        seqInputStream.close();
        outputStream.close();
    }

    public static void main(String[] args) throws IOException {
        copy();
    }
}
