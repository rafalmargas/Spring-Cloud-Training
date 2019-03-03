package com.margas.rafal.utils.string;

import java.util.Objects;
import java.util.regex.Pattern;

public class CommonStringParser {
    private static final Pattern pattern = Pattern.compile("[^\\d+]");

    public static String convertIbanToNrb(String ibanNumber) {
        if (!Objects.nonNull(ibanNumber)) {
            return null;
        }
        return pattern.matcher(ibanNumber).replaceAll("");
    }
}
