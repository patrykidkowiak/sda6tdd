package com.sda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriterTest {
    private Writer writer;

    @Before
    public void init() {
        writer = new Writer();
    }

    @Test
    public void sayHelloWithGivenNameTest() {

        String name = "Patryk";
        String result = writer.sayHello(name);
        Assert.assertEquals("Expected hello message is invalid", result, "Hello Patryk!");

    }

    @Test
    public void sayHelloWithNoNameSpecified() {

        String name = "";
        String result = writer.sayHello("");
        Assert.assertEquals("my friend! test failed", "Hello my friend!", result);
    }

    @Test
    public void sayHelloWithNullName() {

        String name = null;
        String result = writer.sayHello(name);
        Assert.assertEquals("NULL test failed", "Hello my friend!", result);
    }

    @Test
    public void sayHelloWithCapitalName() {
        String name = "PATRYK";
        String result = writer.sayHello(name);
        Assert.assertEquals("Capital letter test failed", "HELLO PATRYK!", result);
    }

    @Test
    public void sayHelloWithSpaceInName() {
        String name = " ";
        String result = writer.sayHello("");
        Assert.assertEquals("test with space in name failed", "Hello my friend!", result);
    }

    @Test
    public void sayHelloWithMultiplySpaceInName() {
        String name = "   ";
        String result = writer.sayHello("");
        Assert.assertEquals("test with four spaces in name failed", "Hello my friend!", result);
    }


}
