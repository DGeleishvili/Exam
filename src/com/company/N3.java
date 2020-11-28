package com.company;

public class N3 {
    public static void printCities() {

        String[] cityArray = {"New York", "San Francisco", "Dallas", "Los Angeles", "Seattle"};
        for (
                int i = 0;
                i < cityArray.length; i++) {
            System.out.println(cityArray[i]);
        }
    }
    public static void main(String[] args){
        N3.printCities();
    }
}
