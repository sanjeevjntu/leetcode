package com.company.easy;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {

        if(s == null) {
            return false;
        }

        int left=0, right=s.length()-1;
        while(left < right) {
            if(!Character.isLetterOrDigit(s.charAt(left))) {
                ++left;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right))) {
                --right;
            } else if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))              {
                return false;
            } else {
                ++left;
                --right;
            }
        }

        return true;
    }
}
