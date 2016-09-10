package org.strings.anzo;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by andreyz on 10.09.16.
 */
public class StringPalindrom {
    public static void main(String[] args) throws IOException {

        BufferedReader set = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(stringPalindrom(set.readLine()));

    }

    public static String stringPalindrom(String s) throws IOException {


        String[] str = s.split(",");


        int count = 0;
        String result = "";

        for (String myr : str) {
            if (isP(myr.trim()) == true) {
                count++;

            }

            result = "There are " + count + " palindromes in the text";

        }
        return result;
    }


    public static Boolean isP(String s) {

        return s.equals(revers(s));

    }

    public static String revers(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i) r += s.charAt(i);
        return r;
    }


}
