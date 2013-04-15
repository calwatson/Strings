package com.jcwatsonfive.stringutil;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import java.util.Arrays;


public class TestTransformer {

    @Test(groups = "unit")
    public void testRemoveAlphaNumeric(){
        String s = "ABC123[-!@#$%^&*()_+]";
        assertEquals(Transformer.cleanNonAlphaNumeric(s),"ABC123");
    }

    @Test(groups = "unit")
    public void testRemoveAlphaNumericEmpty(){
        String s = "";
        assertEquals(Transformer.cleanNonAlphaNumeric(s),s);
    }

    @Test(groups = "unit")
    public void testUrlFriendly(){
        String s = "abc + 123 + [xyz]";
        assertEquals(Transformer.urlFriendly(s),"abc--123--xyz");
    }

    @Test(groups = "unit")
    public void testRemoveDuplicates(){
        String s = "AAABBBCCC";
        assertEquals(Transformer.removeDuplicates(s),"ABC");
    }

    @Test(groups = "unit")
    public void testRemoveDupsSpecialChars(){
        String s = "@@@@@@@AAABBBCCC";
        assertEquals(Transformer.removeDuplicates(s),"@ABC");
    }

    @Test(groups = "unit")
    public void testJoin(){
        String delim = ",";
        String[] strings = new String[]{"A","B","C"};
        assertEquals(Transformer.join(strings,delim),"A,B,C");
    }

    @Test(groups = "unit")
    public void testMultiply(){
        String s = "A";
        assertEquals(Transformer.multiply(s, 3),"AAA");
    }

    @Test(groups = "unit")
    public void testCapital(){
        char c = 'A';
        assertTrue(Transformer.isCapital(c));

        c = 'Z';
        assertTrue(Transformer.isCapital(c));

        c = 'F';
        assertTrue(Transformer.isCapital(c));

        c = 'a';
        assertFalse(Transformer.isCapital(c));

    }

    @Test(groups = "unit")
    public void testSecondLargest(){
        int[] ints = new int[]{1,3,4,5,3,4,9,78};
        assertEquals(9,Transformer.secondLargest(ints));

        ints = new int[]{1,3,4,5,3,4,9,78,10};
        assertEquals(10,Transformer.secondLargest(ints));

        ints = new int[]{10,9,9,9,78,8};
        assertEquals(10,Transformer.secondLargest(ints));

        ints = new int[]{0,1};
        assertEquals(0,Transformer.secondLargest(ints));

        ints = new int[]{1};
        assertEquals(1,Transformer.secondLargest(ints));

    }

}
