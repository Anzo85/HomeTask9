package org.strings.anzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCoding {

    public static void main(String[] args) throws IOException {

        BufferedReader set = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println(coding(set.readLine()));

        }

    }

    public static String coding(String s) throws IOException {

        String y = s.substring(1, s.length() - 1);
        char chFirst = s.charAt(0);
        char chLast = s.charAt(s.length() - 1);
        int index = y.length();
        String result = (chFirst + "" + index + chLast);
        return result;

    }
}
