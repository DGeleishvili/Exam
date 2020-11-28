package com.company;

public class N5 {
    public static void main(String[] args){
        int[] myArray = {0, 7, 7, 2, 7, 3, 5};
        int[] ramdenjer = new int[myArray.length];
        for(int i = 0; i < ramdenjer.length; i++) {
            ramdenjer[i] = 0;
        }
        for(int i = 0; i < myArray.length; i++){
            int me_i_e_ricxvi = myArray[i];
            for(int j = 0; j < myArray.length; j++) {
             if(myArray[j] == me_i_e_ricxvi){
                 ramdenjer[i] += 1;
             }
            }
        }
        int max = ramdenjer[0];
        int maxIndex = 0;

        for(int i = 0; i < ramdenjer.length; i++) {
            if(ramdenjer[i] > max) {
                max = myArray[i];
                maxIndex = i;
            }
        }
        System.out.print("kvelaze xshirad shegvxvda ricxvi ");
        System.out.print(myArray[maxIndex]);
        System.out.print(", ");
        System.out.print(ramdenjer[maxIndex]);
        System.out.println("-jer");
    }
}
