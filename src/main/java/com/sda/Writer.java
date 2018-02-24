package com.sda;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Stream;

public class Writer {
    public String sayHello(String name) {
        String[] nameTable = name != null ? name.split(",") : new String[1];
        String nameSection = nameTable.length == 1 ? name : convertToMessage(nameTable);
        String greetings = "Hello, ";

        if (StringUtils.isBlank(nameSection)) {
            nameSection = "my friend";
        }
        if (StringUtils.isAllUpperCase(name)) {
            greetings = StringUtils.upperCase(greetings);
        }

        String out = greetings + nameSection + "!";
        return isAllUpperCase(nameTable) ? StringUtils.upperCase(out) : out;
    }

    private String convertToMessage(String[] names) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < names.length; i++) {
            stringBuilder.append(names[i]);
            if (i < names.length - 2) {
                stringBuilder.append(", ");
            } else if (i == names.length - 2) {
                stringBuilder.append(" and ");
            }
        }
        return stringBuilder.toString();
    }

    private boolean isAllUpperCase(String[] names) {
        return Stream.of(names).allMatch(e -> StringUtils.isAllUpperCase(e));
    }
}
