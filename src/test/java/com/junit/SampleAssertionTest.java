package com.junit;


import org.junit.Test;

import static org.junit.Assert.*;

public class SampleAssertionTest {

    //constructor
    public SampleAssertionTest(){

    }

    @Test
    public void testAssertArrayEquals(){
        byte[] expected = "test".getBytes();
        byte[] actual = "test".getBytes();
        assertArrayEquals("failure- byte arrays are not same ",expected,actual);
    }


    @Test
    public void testAssertEquals(){
        //checks two primitive/objects are equal
        assertEquals("failure - strings are not equal ", "text","text");
    }

    @Test
    public void testAssertFalse(){
        assertFalse("failure - should be false",false);
        //checks that the condition is false
    }

    @Test
    public void testAssertNotNull(){
        assertNotNull("Should not be null",new Object());
        //checks that an object is'nt null.

    }

    @Test
    public void testAssertNotSame(){
        assertNotSame("Should not be same object ",new Object(),new Object());

    }

    @Test
    public void testAssertNull(){
        assertNull("should be null ",null);
        //check that an object is null
    }

    @Test
    public void testAssertSame(){
        Integer aNumber = Integer.valueOf(62);
        assertSame("should be same ",aNumber,aNumber);
    }

    @Test
    public void testAssertTrue(){
        assertTrue("Failue-should be true",true);
        //checks the condition is true
    }






}
