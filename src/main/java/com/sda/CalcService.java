package com.sda;

import org.apache.commons.lang3.StringUtils;

import java.util.stream.Stream;

public class CalcService {
    public int calculate(String text) {
        String[] table = StringUtils.isNotEmpty(text) ? text.split(";| ") : new String[1];
        return Stream.of(table).filter(e-> StringUtils.isNumeric(e)).mapToInt(e -> Integer.parseInt(e)).sum();
    }
}
