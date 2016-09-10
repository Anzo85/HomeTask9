package org.strings.anzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by andreyz on 10.09.16.
 */
public class StringCoding {

    public static void main(String[] args) throws IOException {

        BufferedReader set = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println(coding(set.readLine()));

        }

    }

    public static String coding(String s) throws IOException {

        String y = s.substring(1, s.length() - 1);

        StringBuffer sb = new StringBuffer(s);
        char chFirst = sb.charAt(0);
        char chLast = sb.charAt(sb.length() - 1);
        int index = y.length();
        String result = (chFirst + "" + index + chLast);
        return result;

    }
}