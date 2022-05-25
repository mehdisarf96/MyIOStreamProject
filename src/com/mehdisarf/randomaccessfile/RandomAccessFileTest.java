package com.mehdisarf.randomaccessfile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    private static final String FILE_PATH = "F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/randomaccessfile/Data.txt";

    public static void readFromRandomAccessFile() throws IOException {

        RandomAccessFile randomAccessFile = new RandomAccessFile(FILE_PATH, "rw");
        // rw: Open for reading and writing. If the file does not already exist then an attempt will be made to create it.

        System.out.println((char) randomAccessFile.read()); // read 1 byte.
        System.out.println((char) randomAccessFile.read()); // read 1 byte.
        System.out.println((char) randomAccessFile.read()); // read 1 byte.
    }

    public static void readAndWriteRandomAccessFile() throws IOException {

        RandomAccessFile randomAccessFile = new RandomAccessFile(FILE_PATH, "rw");
        // rw: Open for reading and writing. If the file does not already exist then an attempt will be made to create it.

        // mohtaviate Data.txt:     ABCDEFGHI
        System.out.println((char) randomAccessFile.read()); // read 1 byte.
        System.out.println((char) randomAccessFile.read()); // read 1 byte.
        System.out.println((char) randomAccessFile.read()); // read 1 byte.
        // badaz inke 'C' ro khund, alan file pointer dare be 'D' eshare va point mikone.

        // hala mikham write operation ro anjam bedam.
        randomAccessFile.write('d');
        // ta inja age run konam, beram file ro bbinam injur shode:  ABCdEFGHI

        // alan file pointer kojast? ruye 'E'.
        System.out.println((char) randomAccessFile.read()); // read 1 byte. print 'E'.
        // alan file pointer ruye 'F' e.

        // I want to skip few bytes.
        randomAccessFile.skipBytes(3); // 3 bytes ro skip mikone. 'F', 'G', 'H' ro skip mikone va be 'I' point mikone.
        System.out.println((char) randomAccessFile.read()); // read 1 byte. print 'I'.

        // mikham file pointer bargarde be index e 3. yani biad be 'd' eshare va point kone. so:
        randomAccessFile.seek(3); // Sets the file-pointer offset, measured from the beginning of this file, at which the next read or write occurs.
        // alan dare be 'd' eshare mikone.
        System.out.println((char) randomAccessFile.read()); // read 1 byte. print 'd'.

        // so I can go to any position.
        // alan file pointer dare be 'E' eshare mikone. yani index va position e 4. ama mikham motmaen sham:
        randomAccessFile.getFilePointer(); // return 4

        // mikham file-pointer harja ke hast, 2ta bere jolo.
        randomAccessFile.seek(randomAccessFile.getFilePointer() + 2);

        // mikham file-pointer harja ke hast, 4ta bere aghab.
        randomAccessFile.seek(randomAccessFile.getFilePointer() - 4);
    }

    public static void main(String[] args) throws IOException {
        readAndWriteRandomAccessFile();
    }
}
