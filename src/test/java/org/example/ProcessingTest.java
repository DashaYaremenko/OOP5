package org.example;

import static org.junit.jupiter.api.Assertions.*;

class ProcessingTest {
 Processing processing;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        processing=new Processing();
    }

    @org.junit.jupiter.api.Test
    void calculate1() {
        double[]array=new double[]{9.1, 11.2,0,27.3,7.5,12.1,16.5,18.4};
        double expext= 1767.01;
        double result= processing.calculate(array);
        assertEquals(expext,result,1.0e-3);
    }

    @org.junit.jupiter.api.Test
    void calculate2() {
        double[][] array= new double[][]{
                {0,3,6,-7,},
                {1,1,1,1,},
                {1,1,0,0,},
                {1,1,8,6,}
        };
        double expext =46;
        double result=processing.calculate(array);
        assertEquals(expext, result, 1.0e-3);
    }
}