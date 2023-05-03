package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        EnteringArray reader = new IO();
       ProcessingArray processing = new Processing();
       double[] array = reader.readOneDimensionalArray(new File("lab51.txt"));
       processing.processArray(array);
       double arithmetic_mean_squares = processing.calculate(array);
        System.out.println("Середнє Арифметичне Квадратів: " + arithmetic_mean_squares);
        double[][] array2= reader.readTwoDimensionalArray(new File("lab52.txt"));
        processing.processArray(array2);
        double sum_squares_shaded= processing.calculate(array2);
        System.out.println("Cумa квадратів елементів заштрихованої частини: "+sum_squares_shaded);
    }
}