package com.margas.rafal.utils.string;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CommonStringParserTest {

    @Test
    public void shouldReturnNullWhenPassedNullValue() {
        String result = CommonStringParser.convertIbanToNrb(null);

        assertThat(result, equalTo(null));
    }

    @Test
    public void shouldReturnNullWhenPassedEmptyValue() {
        String iban = "";

        String result = CommonStringParser.convertIbanToNrb(iban);

        assertThat(result, equalTo(iban));
    }

    @Test
    public void shouldReturnNrbWhenPassedNrb() {
        String nrb = "65249000050903814657132978";

        String result = CommonStringParser.convertIbanToNrb(nrb);

        assertThat(result, equalTo(nrb));
    }

    @Test
    public void shouldConvertToNrbWhenPassedIban() {
        String iban = "PL65249000050903814657132978";

        String result = CommonStringParser.convertIbanToNrb(iban);

        assertThat(result, equalTo(iban.substring(2)));
    }
}