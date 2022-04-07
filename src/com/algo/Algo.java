package com.algo;

public class Algo {
    public static void theAlgo(int[] arr){
        int maxLenOfTheSerie=0;
        int lenOfTheSerie =0;
        int indexOfFirst = -1;
        int indexOfLast =-1;
        int maxIndexOfFirst = -1;
        int maxIndexOfLast =-1;
        if(arr.length< 2){
            System.out.println("the array is too small");
        }
        for (int i = 1; i < arr.length ; i++) {
            //Searching for the serie
            if (arr[i]>arr[i-1]){
                lenOfTheSerie++;
                indexOfFirst = i-1;
                indexOfLast = i;
                i++;
                //calculating the len and overwriting the last index
                while (i< arr.length && arr[i]>arr[i-1]){
                    lenOfTheSerie++;
                    indexOfLast= i;
                    i++;
                }
                //checking if it is the longest one
                if(lenOfTheSerie > maxLenOfTheSerie){

                    maxLenOfTheSerie = lenOfTheSerie;
                    maxIndexOfFirst = indexOfFirst;
                    maxIndexOfLast = indexOfLast;
                }
                lenOfTheSerie =0;
            }
        }
        //reversing
        while (maxIndexOfFirst < maxIndexOfLast){
            int temp = arr[maxIndexOfFirst];
            arr[maxIndexOfFirst] = arr[maxIndexOfLast];
            arr[maxIndexOfLast] = temp;
            maxIndexOfFirst++;
            maxIndexOfLast--;
        }
    }
}
