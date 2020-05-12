package com.challenge;

public class MoveZeros {

    public static void main(String[] args) {
        moveZeros(new int[]{1, 0, 0, 3, 12});
    }

    //[1,0,0,3,12]
    private static void moveZeros(int[] nums) {
        int index = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        } // index = 3, length =5;

        for(int i= index; i < length; i++) {
            nums[i] = 0;
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
