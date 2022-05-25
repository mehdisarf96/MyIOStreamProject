package com.mehdisarf.writeobjectintofile.firstsolution;

import java.io.*;

public class ReadStudentObjectFromFile {

    private final static String PATH = "F:\\Java SE 2022\\IO Stream\\IO Stream Projects\\MyIOStreamProject\\src\\com\\mehdisarf\\writeobjectintofile\\firstsolution\\Student1.txt";

    public static void firstMethod() throws IOException {
        FileInputStream inputStream = new FileInputStream(PATH);

        String str = "";
        int readByte;
        while ((readByte = inputStream.read()) != -1) {
            str = str + (char) readByte;
        }
        System.out.println(str);

        // daram mikhunam va okeye. alan str ham mohtaviat e file Student1.txt ro
        // kamelan namayesh mide ama nemidunam va nemitunam begam che byte ii mishe rollNumber
        // ya inke  az che byte ta che byte ii mishe rollNumber e student ya
        // masalan az che byte ii ta che byteii mishe department.
        // so pas ba in FileInputStream e ma ke dare byte byte mikhune nemishe rahi be pish bord.
        // ama man chi mikham? mikham aval rollNumber ro bkhune. bad name va bad department ro bkhune.
        // mohtaviate in file Student1.txt, String e. man mikham String bekhunam.
        // hamuntor ke didim, FileInputStream cannot read String. for that I need BufferedReader.
        // BufferedReader, method e readLine() dare. vase hamin berim azash estefade konim.
    }

    public static void secondMethod() throws IOException {

        FileInputStream inputStream = new FileInputStream(PATH);
        // so komak migiram. bufferedReader ro vasl mikonam be FileInputStream (ba ye bridge un vassat(InputStreamReader))
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String studentRollNumber = bufferedReader.readLine();
        String studentName = bufferedReader.readLine();
        String studentDepartment = bufferedReader.readLine();

        Student student = new Student();
        student.rollNumber = Integer.parseInt(studentRollNumber);
        student.name = studentName;
        student.department = studentDepartment;
    }

    public static void main(String[] args) throws IOException {
        firstMethod();
    }
}
