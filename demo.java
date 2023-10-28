import java.util.*;
class demo{
     public static void main(String[] args){
         int[] nums = {1,3,23,65,8,89};
        int answer = arraySum(nums);
        System.out.println("Sum of elements in array " + Arrays.toString(nums) + " is : " + answer);
}
public static int arraySum(int[] arr){
        int sum = 0;
        for(int x : arr){
            sum += x;
        }
        return sum;
    }

}