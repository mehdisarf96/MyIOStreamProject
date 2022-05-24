package com.mehdisarf.chararrayreader;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderTest {

    static void firstMethod() throws IOException {

        char[] charsInRemoteComputerInWashington = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        CharArrayReader charArrayReader = new CharArrayReader(charsInRemoteComputerInWashington);

        char[] myEmptyCharArray = new char[10];

        charArrayReader.read(myEmptyCharArray);// mikhune va mirize tu myEmptyCharArray.

        String str = new String(myEmptyCharArray);

        System.out.println(str);

        charArrayReader.close();
    }

    static void secondMethod() throws IOException {

        char[] charsInRemoteComputerInWashington = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};

        CharArrayReader charArrayReader = new CharArrayReader(charsInRemoteComputerInWashington);

        String str = "";

        int readCharacter;
        while ((readCharacter = charArrayReader.read()) != -1)
            str = str + ((char) readCharacter);

        System.out.println(str);

        charArrayReader.close();
    }

    public static void main(String[] args) throws IOException {
        secondMethod();
    }
}
