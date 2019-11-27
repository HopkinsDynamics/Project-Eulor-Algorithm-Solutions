package com.company;

public class N002_Even_Fibonacci {

    /*Each new term in the Fibonacci sequence is generated by adding the
     previous two terms. By starting with 1 and 2, the first 10 terms will be:

        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

    By considering the terms in the Fibonacci sequence whose values
    do not exceed four million, find the sum of the even-valued terms*/
    N002_Even_Fibonacci(){
        System.out.println("Sum of even fibonacci terms less than four million: ");
    }
    public void evenFibonacci(){
        int a=1;
        int b=2;
        int temp;
        int limit = 4000000;
        int evenSum=2;
        while( (a < limit) && (b < limit)){
            temp = a + b;
            a = b;
            b = temp;
            if(temp%2==0){
                evenSum+=temp;
            }
        }
        System.out.println(evenSum);

    }

}