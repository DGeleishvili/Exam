package com.company;

public class N4 {
    public static void x(float initialPrice, float salePercent){
        System.out.println(initialPrice * salePercent / 100);
    }
    public static void main(String[] args){
        N4.x(200f, 35f);
    }
}
