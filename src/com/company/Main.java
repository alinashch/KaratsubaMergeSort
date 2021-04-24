package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = new int[]{564789, 345672, -768946, -564321, -784532, -874567, 126789, 894657, 890467, 154637, 892989, 124753, 143526, 445234, 789354, 987452, 153467, 984567, 345623, 897654};
        int []arrMS;
        arrMS=MergeSort.sortArray(arr1);
        System.out.println("MergeSort");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arrMS[i] + " ");
        }
        System.out.println();
        int [] arrS;
        arrS=Sort.Sort(arr1);
        System.out.println("Check Sort");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arrS[i] + " ");
        }
        System.out.println();
        System.out.println();
        BigInteger a= BigInteger.valueOf(5655112);
        BigInteger b=BigInteger.valueOf(1233224);
        System.out.println("Result Karatsuba "+ Karatsuba.Karatsuba(a,b,7));
        System.out.println("Check Result " +a.multiply(b));

    }
}
