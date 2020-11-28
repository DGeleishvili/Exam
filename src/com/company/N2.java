package com.company;

public class N2 {
    public static boolean compare(int a, int b){
        return a == b;
    }
    public static void main(String[] args) {
        if (N2.compare(5, 3)) {
            System.out.println("5 and 3 are equal");
        } else {
            System.out.println("5 and 3 are NOT equal");
        }
    }
}
