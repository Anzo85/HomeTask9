package org.anzo.strings;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.strings.anzo.StringPalindrom.isP;
import static org.strings.anzo.StringPalindrom.revers;
import static org.strings.anzo.StringPalindrom.stringPalindrom;

/**
 * Created by andreyz on 10.09.16.
 */
public class StringPalindrom {


    @Test

    public void reverstTest() {

        String s = "andrey";
        assertThat(revers(s), is("yerdna"));
    }

    @Test

    public void isPoliTest01() {

        String s = "andrey";
        assertThat(s.equals(revers(s)), is(false));
    }

    @Test
    public void isPoliTest02() {

        String s = "anna";
        assertThat(s.equals(revers(s)), is(true));
    }

    @Test
    public void PoliMainTest() throws IOException {

        String s = "anna, vannav , tests, newtest, lasttest";
        assertThat(stringPalindrom(s), is("There are 2 palindromes in the text"));
    }





}
