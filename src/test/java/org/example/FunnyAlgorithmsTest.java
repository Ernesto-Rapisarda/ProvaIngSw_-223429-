package org.example;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunnyAlgorithmsTest {
    private static FunnyAlgorithms funnyAlgorithms = null;

    @BeforeClass
    public static void startClass(){
        funnyAlgorithms = new FunnyAlgorithms();
    }

    @Before
    public void resetclass(){
        funnyAlgorithms = new FunnyAlgorithms();

    }

    @Test
    public void stringToIntConverterTestCorrectInput (){
        String numT = "12344";
        int num =  12344;
        assertEquals(num,funnyAlgorithms.stringToIntConverter(numT));
        numT = "-12344";
        num = -12344;
        assertEquals(num,funnyAlgorithms.stringToIntConverter(numT));

    }

    @Test(expected = UnsupportedOperationException.class)
    public void stringToIntConverterTestWrongNegativeInput (){
        //input out of range
        String numT = "-35000";
        funnyAlgorithms.stringToIntConverter(numT);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void stringToIntConverterTestWrongPositiveInput (){
        //input out of range
        String numT = "35000";
        funnyAlgorithms.stringToIntConverter(numT);
    }

    @Test
    public void switchNumberWithSwapFunction(){
        int[] temp = {5,6,7,9,8,20,6};
        int i = 2;
        int j = 4;
        //expected 8 and 7
        funnyAlgorithms.swap(temp,i,j);
        assertEquals(8,temp[i]);
        assertEquals(7,temp[j]);
    }





}
