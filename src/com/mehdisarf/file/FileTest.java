package com.mehdisarf.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileTest {

    private static final String PATH = "F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/file";
    private static File file = new File(PATH);

    public static void firstMethod() {

        System.out.println(file.isDirectory());

        String[] contentOfTheDirectory = file.list(); // Returns an array of strings naming the files and directories in the directory denoted by this abstract pathname.
        for (String s : contentOfTheDirectory)
            System.out.println(s);
    }

    public static void secondMethod() {

        File[] files = file.listFiles();

        for (File f : files) {
            System.out.print(f.getName() + " ");
            System.out.print(f.getPath());
            System.out.println();
        }
    }

    public static void thirdMethod() throws FileNotFoundException {

        String path = "F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/file/temp1.txt";

        File file = new File(path);

        file.setReadOnly();

        FileOutputStream fileOutputStream = new FileOutputStream(path); // bayad Exception part kone; ke mikone.
        // java.io.FileNotFoundException:  (Access is denied)
    }

    public static void fourthMethod() throws FileNotFoundException {

        String path = "F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/file/temp1.txt";

        File file = new File(path);

        file.setWritable(true); // az Read-Only budan kharejesh mikonam va mishe tush nevesht alan.
        // va dg exception nakhahad dad.

        FileOutputStream fileOutputStream = new FileOutputStream(path);
    }

    public static void fifthMethod() throws FileNotFoundException {

        String path = "F:/Java SE 2022/IO Stream/IO Stream Projects/MyIOStreamProject/src/com/mehdisarf/file/temp2.txt";

        File file = new File(path);

        System.out.println(file.lastModified());
        System.out.println(file.length());
    }

    public static void main(String[] args) throws FileNotFoundException {
        fifthMethod();
    }
}
