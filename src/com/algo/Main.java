package com.algo;

public class Main {

    public static void main(String[] args) {
	    // winput : T=[2,3,4,15,16,17,0,0,-4,5,6,7,8,9,10,1,2]
        // output : [2,3,4,15,16,17,0,0,10,9,8,7,6,5,-4,1,2]
        // the test
        int[] tab={2,3,4,15,16,17,0,0,-4,5,6,7,8,9,10,1,2};
        Algo.theAlgo(tab);
        for (int i = 0; i < tab.length ; i++) {
            System.out.printf("%d ", tab[i]);
        }
    }
}
