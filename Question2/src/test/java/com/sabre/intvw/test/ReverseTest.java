package com.sabre.intvw.test;

import com.sabre.intvw.Reverse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseTest {
    @Before
    public void setUp() {
    }

    @Test
    public void testReverse1() {
        String s="LOAD";
        assertEquals("DAOL",new Reverse().reverseMe(s));
    }

    @Test
    public void testReverse2() {
        String s="INTERVIEW";
        assertEquals("WEIVRETNI",new Reverse().reverseMe(s));
    }

    @After
    public void tearDown() {
    }

}