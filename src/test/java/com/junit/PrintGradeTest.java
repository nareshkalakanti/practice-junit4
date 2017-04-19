package com.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PrintGradeTest {

    @Test
    public void test(){
        PrintGrade pg = new PrintGrade();
        String result = pg.print(95);
        assertEquals("You got A",result);
    }
}
