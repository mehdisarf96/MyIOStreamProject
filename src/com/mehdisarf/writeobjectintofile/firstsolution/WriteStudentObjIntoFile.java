package com.mehdisarf.writeobjectintofile.firstsolution;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class WriteStudentObjIntoFile {

    private final static String PATH = "F:\\Java SE 2022\\IO Stream\\IO Stream Projects\\MyIOStreamProject\\src\\com\\mehdisarf\\writeobjectintofile\\firstsolution\\Student1.txt";

    public static void firstMethod() throws IOException {

        FileOutputStream outputStream = new FileOutputStream(PATH);

        Student student = new Student();
        student.rollNumber = 15;
        student.name = "mehdi";
        student.department = "CE";

        // outputStream.write(student.rollNumber); 15 ro store nemikone. symbol e ba code e 15 ro zakhire mikone.
        // you should first convert your integer to string and then call getBytes on that:
        outputStream.write((String.valueOf(student.rollNumber)).getBytes());

        outputStream.write(student.name.getBytes());
        outputStream.write(student.department.getBytes());

        outputStream.close();
    }

    public static void secondMethod() throws IOException {

        FileOutputStream outputStream = new FileOutputStream(PATH);
        // baraye rahati kar va inke sakhtihaye method aval ro nakesham,
        // miam be outputStream amm, ye PrintStream vasl va attach mikonam.
        PrintStream printStream = new PrintStream(outputStream); // vasl kardam.

        Student student = new Student();
        student.rollNumber = 15;
        student.name = "mehdi";
        student.department = "CE";

        printStream.println(student.rollNumber);
        printStream.println(student.name);
        printStream.println(student.department);
        // tu printStream neveshtam, az printStream miran be outputStream va azunja miran tuye file.

        printStream.close();
        outputStream.close();
    }

    public static void main(String[] args) throws IOException {
        secondMethod();
    }
}
