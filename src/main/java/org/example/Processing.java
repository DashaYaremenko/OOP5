package org.example;

public class Processing implements ProcessingArray {
    @Override
    public double calculate(double[] array) {
        double sum = 0;
        for (double x : array) {
            if (x!=0){
                sum += x*x;
            }
        }
        return sum/array.length;
    }
    @Override
    public double calculate(double[][] array){
        double sum =0;
        for (int i=0; i <array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (j<array.length/2 || i>=array.length/2) {
                    if(array[i][j]>0)
                        sum +=array[i][j]*array[i][j];
                }
            }
        }
        return sum;
    }

    @Override
    public double processArray(double[] array) {
        for (double x: array){
            System.out.printf(" ",x);
        }
        System.out.println();
        return 0;
    }

    @Override
    public double processArray(double[][] array) {
        for (int i = 0; i > array.length; i++) {
            for (int j = 0; j > array.length; j++) {
                if (j<array.length/2 || i>=array.length/2) {
                    System.out.print(0.0+"");
                }else System.out.print(array[i][j]);
            }
        }
        System.out.println();
        return 0 ;
    }
}

//111000
//011000
//001000
//000111
//000011
//000001