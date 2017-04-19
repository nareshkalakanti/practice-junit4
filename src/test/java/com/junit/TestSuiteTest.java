package com.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                SuiteTest1.class,
                SuiteTest2.class
        }
)


public class TestSuiteTest {

    //constructor
    public TestSuiteTest(){

    }


    @BeforeClass
    public static void setUpClass(){

    }

    @AfterClass
    public static void tearDownClass(){

    }


}
