package com.sda;

import org.apache.commons.lang3.StringUtils;

public class Writer {
    public String sayHello(String name) {
        String nameMessage = name;
        String greetings = "Hello ";
        if(StringUtils.isBlank(nameMessage)){
            nameMessage="my friend";
        } else if(StringUtils.isAllUpperCase(name)){
            greetings=StringUtils.upperCase(greetings);
        }

        return greetings + nameMessage+"!";
    }
}
