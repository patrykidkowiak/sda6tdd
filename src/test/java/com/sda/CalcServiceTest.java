package com.sda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcServiceTest {
    CalcService calcService;
    @Before
    public void init(){
        calcService = new CalcService();
    }

    @Test
    public void CaclSimpleTest(){
        String input = "2;3;4";
        int result = calcService.calculate(input);
        Assert.assertEquals("First, simple test failed",9,result);
    }

    @Test
    public void CaclSimpleTest2(){
        String input = "21;3;4";
        int result = calcService.calculate(input);
        Assert.assertEquals("Simple test failed",28,result);
    }

    @Test
    public void CaclNullTest(){
        String input =null;
        int result = calcService.calculate(input);
        Assert.assertEquals("NULL test failed",0,result);
    }

    @Test
    public void CaclSpaceTest(){
        String input =" ";
        int result = calcService.calculate(input);
        Assert.assertEquals("Space test failed",0,result);
    }

    @Test
    public void CaclMultiSpaceTest(){
        String input ="   ";
        int result = calcService.calculate(input);
        Assert.assertEquals("Multi space test failed",0,result);
    }

    @Test
    public void CaclProductTest(){
        String input ="3 pomarancze;2 kiwi;1 jablko";
        int result = calcService.calculate(input);
        Assert.assertEquals("Product test failed",6,result);
    }

    @Test
    public void CaclRandomCharTest(){
        String input ="c3;w 2 kiwi;tt 1 jablko";
        int result = calcService.calculate(input);
        Assert.assertEquals("Number with random char test failed",6,result);
    }


}
