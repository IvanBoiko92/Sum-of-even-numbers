package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{0, 0, 0};

        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        int S = 0;
        if (array == null){
            S = 0;
        }
        else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    S = S + array[i];
                }

            }
        }
        return S;
        
    }
}
