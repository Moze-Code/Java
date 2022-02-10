package com.company;

/**
 * @author Omoze Oyarebu
 * Exercise-Write a method called lastIndexOf that accepts an array of
 *          integers and an integer value as its parameters and returns
 *          the last index at which the value occurs in the array. The
 *          method should return –1 if the value is not found. For
 *          example, in the array [ 74, 85, 102, 99, 101, 85, 56 ], the last
 *          index of the value 85 is 5.
 */
//Create an Array
//traverse the Array backwards
//look for the specified number in the Array
//Return the number's index/element once found
//Or return "-1" if the number wasn't found
public class LastIndex {
    public static void main(String[] args) {
        //Array creation
        int[] array = {74,85,102,99,101,85,56};
        System.out.println("Last index = " +lastIndexOf(array,85));
        System.out.println("Last Index = " + lastIndexOf(array,99));
        System.out.println("Last Index = " + lastIndexOf(array,56));
    }
    public static int lastIndexOf(int[] nums, int index){
        //Traverse the array backwards
        int last_position;
        for(int i = nums.length-1; i >=0;i--){
            if (nums[i]== index) {
                last_position  = i;
                return last_position;
            }

        }
        return -1;

    }
}
