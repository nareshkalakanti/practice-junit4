
Notes : JUNIT

1.Its an unit testing library

2.unit testing is examining a small piece of software

3.Goal is assert expected behaviour and state

4.Provides automation testing and validation

5.run several test in one execution

6.After all unit testing is done , integration tests are next
 When testing, we need to identify any inputs to methods in our code as well as expected results.

7.Integration testing is used to test the entire system
  An integration test aims to test the behavior of a component or the integration between multiple components. These tests are used to test the entire system.

8.Performace testing benchmark the software by running repeatedly
  The purpose is to ensure the code runs fast enough under a high traffic load

Using Assertions:

1.Provides overloaded assertion methods

2.Parameter order is (expected value,actualvlaue)

3.String message can also be added as first parameter

 Actual & Expected values for
  
  a)Arrays
  
  b)Single values
  
  c)Objects
  
  d)Null Values

Test Suite:

If you have several test classes : You can run all of them a once by combining them into test suite

Running a test suite execute all test classes in that suite in the specified order. A test suite can also contain other test suites

Unit Test:

1)Does not require human judgement to interpret

2)Annotate a method with @Test

3)import org.junit.Assert.*

Junit 4: New Feature

JUnit 4 they added another feature that allows you run paramaterized tests.

This feature allows the developer to run tests, including multiple values at one time.

JUnit allows you to use parameters in the test class.

The class can contain one test method, and the method is executed with the list of parameters provided.

@parameters
 

