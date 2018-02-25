package com.sda;

import org.apache.commons.lang3.StringUtils;

import java.util.stream.Stream;

public class CalcService {
    public int calculate(String text) {
        return StringUtils.isNotBlank(text) ? Stream.of(text.split(";"))
                .map(e-> e.replaceAll("[^0-9.]", ""))
                .mapToInt(e -> Integer.parseInt(e))
                .sum(): 0;
    }
}
