package org.anzo.strings;

import org.strings.anzo.MailExchange;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class MailTest {


    @Test
    public void mailTests1() throws IOException {
        String s = "andrey@123.com";
        assertThat(MailExchange.mailExchange(s), is("andrey[at]123[dot]com"));

    }

    @Test
    public void mailTests2() throws IOException {
        String s = "zolotarev@3g.ua";
        assertThat(MailExchange.mailExchange(s), is("zolotarev[at]3g[dot]ua"));

    }
}
