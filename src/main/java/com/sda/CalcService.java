package com.sda;

import org.apache.commons.lang3.StringUtils;

import java.util.stream.Stream;

public class CalcService {
    public int calculate(String text) {
        String[] table = StringUtils.isNotBlank(text) ? text.split(";") : new String[0];
        return Stream.of(table)
                .map(e-> e.replaceAll("[^0-9.]", ""))
                .mapToInt(e -> Integer.parseInt(e))
                .sum();
    }
}
