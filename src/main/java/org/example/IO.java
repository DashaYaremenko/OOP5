package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IO implements EnteringArray {
    public double[] readOneDimensionalArray(File file){
            try (Scanner in = new Scanner(new FileReader(file))) {
                int l = in.nextInt();
                double[] array = new double[l];
                for (int i = 0; i < array.length; i++) {
                    array[i] = in.nextDouble();
                }
                return array;
            } catch (FileNotFoundException e) {
                return new double[0];
            }
        }

    @Override
    public double[][] readTwoDimensionalArray(File file) {
        try (Scanner in= new Scanner(new FileReader(file))){
            int n = in.nextInt();
            double[][]array= new double[n][n];
            for (int i=0; i<n;i++){
                for (int j=0; j<n;j++){
                    array[i][j]=in.nextDouble();
                }
            }
            return array;

        } catch (FileNotFoundException e) {
            return new double[0][];
        }
    }
}

