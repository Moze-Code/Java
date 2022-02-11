/**
 * @author Omoze Oyarebu
 * Exercise-Write a method called stdev that returns the standard
 *          deviation of an array of integers. Standard deviation is
 *          computed by taking the square root of the sum of the squares
 *          of the differences between each element and the mean,
 *          divided by one less than the number of elements. (It’s just that
 *          simple!). For example, if the array passed contains the values [1, –2,
 *          4, –4, 9, –6, 16, –8, 25, –10] , your method should return
 *          approximately 11.237 .
 *
 */
//create an array
//compute sum of the array
//compute average of the array
//compute variance
//compute stDev of the array
//stDev = Square root of the sum of (xi - ave)^2/total num of items
public class StandardDevCalculator {
    public static void main(String[] args) {
        int[] array = {1,-2,4,-4,9,-6,16,-8,25,-10};
        System.out.print("Standard Deviation = " + stDev(array));
    }
    public static double stDev(int[] nums){
        double total_num_of_items = nums.length; //N
        double sum= 0; //xi
        double mean = 0;
        double variance = 0;
        double stdev = 0;
        for(int n: nums) {
            sum = sum + n;
        }
        System.out.println("Total Count of Numbers = " + (int) (total_num_of_items));
        System.out.println("sum = " + sum);
        mean = sum/total_num_of_items;
        System.out.println("Mean = " + mean);
        for(int i =0; i < nums.length; i++) {
            variance = variance+(Math.pow((nums[i]), 2)- Math.pow(mean,2));
        }

       System.out.println("Variance = " + ((variance)/(total_num_of_items-1)));
        stdev = Math.sqrt(variance/(total_num_of_items-1));

        return stdev;
    }
}
