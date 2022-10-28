package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunnyAlgorithmsTest {
    private static FunnyAlgorithms funnyAlgorithms;

    @BeforeClass
    public static void startClass(){
        funnyAlgorithms = new FunnyAlgorithms();
    }

    @Before
    public void startArray(){
        // TODO: 28/10/2022
    }

    @Test
    public void stringToIntConverterTest (){
        String numT = "12365";
        int num =  12365;
        assertEquals(num,funnyAlgorithms.stringToIntConverter(numT));
    }
}
