package com.company.easy;


public class ReverseNumber {

    public static void main(String[] args) {
        int reverse = reverse(123);
        System.out.println(reverse);
    }

    public static int reverse(int num) {
        int rev =0;
         while(num !=0) {
             rev= rev*10 + num%10;
             num /=10;
         }
         return rev;
    }
}
