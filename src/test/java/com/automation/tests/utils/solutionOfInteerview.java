package com.automation.tests.utils;

import java.util.*;

public class solutionOfInteerview {
 static int[] arr = {20,1,1,2,5,1,2,1,2};

    public static void main(String[] args) {

        solutionOfInteerview s = new solutionOfInteerview();

        System.out.println(s.sum(arr));
    }

    public int sum(int[]arr){


        if(arr==null||arr.length == 0 ){
            return 0;
        }
        int[] user = arr;
        int a = user[0]+sum(cutArr(2, user));
        int b = user[0]+sum(cutArr(3, user));

        return Math.max(a, b);
    }

    public static int[] cutArr(int position,int[]arr) {
        int length =arr.length-position;
        if(length<0){
           return null;
        }
        int[] result = new int[length];

        for (int i = position; i < result.length+position; i++) {
            result[i-position] = arr[i];
        }

        System.out.println(Arrays.toString(result));

        return result;
    }
}


