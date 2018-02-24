package com.sda;

import org.junit.Assert;
import org.junit.Test;

public class WriterTest {
    @Test
    public void sayHelloWithGivenNameTest() {

        Writer writer = new Writer();
        String name = "Patryk";
        String result = writer.sayHello(name);
        Assert.assertEquals("Expected hello message is invalid",result, "Hello Patryk!");

    }

    @Test
    public void sayHelloWithNoNameSpecified(){
        Writer writer = new Writer();
        String name ="";
       String result = writer.sayHello("");
       Assert.assertEquals("my friend!", "Hello my friend!",result);
    }

    @Test
    public void sayHelloWithNullName(){
        Writer writer = new Writer();
        String name= null;
        String result = writer.sayHello(null);
        Assert.assertEquals("NULL test","Hello my friend!",result);
    }
}
