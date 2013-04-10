package com.jcwatsonfive.stringutil;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;


public class TestValidator {

    @Test(groups = "unit")
    public void testEmpty(){
        String s = "";
        assertTrue(Validator.empty(s));
    }

    @Test(groups = "unit")
    public void testNotEmpty(){
        String s = "blah blah blah";
        assertFalse(Validator.empty(s));
    }
}
