package com.sabre.intvw.test;

import com.sabre.intvw.StringHelpers;

import static org.junit.Assert.*;

public class StringHelpersTest {
    @org.junit.Test
    public void equalsIgnoreCase() throws Exception {
    }

    @org.junit.Test
    public void toUpper() throws Exception {
        assertEquals("TEST", StringHelpers.toUpper("test"));
    }

    @org.junit.Test
    public void replace() throws Exception {
        String str="This is a not test";
        assertEquals("This is a test", StringHelpers.replace(str,"not ",""));
    }

    @org.junit.Test
    public void ltrim() throws Exception {
        assertEquals("This is a test", StringHelpers.ltrim("  This is a test"));
    }

    @org.junit.Test
    public void isNotSpace() throws Exception {
        assertTrue(StringHelpers.isNotSpace('a'));
    }

    @org.junit.Test
    public void rtrim() throws Exception {
        assertEquals("This is a test", StringHelpers.ltrim("This is a test  "));
    }

    @org.junit.Test
    public void trim() throws Exception {
        assertEquals("This is a test", StringHelpers.ltrim("   This is a test  "));
    }

}