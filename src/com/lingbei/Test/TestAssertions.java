package com.lingbei.Test;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestAssertions {

    @Test
    public void testAssertions(){
        String str1 = new String("abc");

        String str2 = new String("abc");

        String str3 = null;

        String str4 = "abc";
        String str5 = "abc";

        int var1 = 4;
        int var2 = 5;

        String[] expectArray = {"one","two","three"};
        String[] resultArray = {"one","two","three"};

        assertEquals(str1,str2);

        assertTrue(var1 < var2);

        assertFalse(var1 > var2);

        assertNotNull(str1);

        assertNull(str3);

        assertSame(str4,str5);

        assertNotSame(str1,str2);

        assertArrayEquals(expectArray,resultArray);



    }
}
