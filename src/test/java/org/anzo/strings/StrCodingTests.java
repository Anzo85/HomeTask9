package org.anzo.strings;

import org.junit.Test;
import org.strings.anzo.MailExchange;
import org.strings.anzo.StringCoding;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by andreyz on 10.09.16.
 */
public class StrCodingTests {


    @Test

    public void codingTest01() throws IOException {

        String input = "internationalization";

        assertThat(StringCoding.coding(input), is("i18n"));

    }

    @Test

    public void codingTest02() throws IOException {

        String input = "localization";

        assertThat(StringCoding.coding(input), is("l10n"));

    }

}
