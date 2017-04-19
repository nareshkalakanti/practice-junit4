package com.junit;

public class PrintGrade {

    public String print(int grade){

        if (grade > 93)
            return "You got A";
        else if (grade > 83)
            return "You got B";
        else if (grade > 73)
            return "You have recieved a C";
        else
            return "You need to study more";


    }
}
