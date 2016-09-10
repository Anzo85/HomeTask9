package org.strings.anzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by andreyz on 10.09.16.
 */
public class MailExchange {
    public static void main(String[] args) throws IOException{

        BufferedReader set = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(mailExchange(set.readLine()));
    }


    public static String mailExchange(String s) throws IOException {


        String result = s.replace("@", "[at]").replace(".", "[dot]");
        return result;
    }
}



