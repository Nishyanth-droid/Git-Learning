import java.util.*;
class demo{
     public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = scanner.nextInt();
        }
        int answer = arraySum(nums);
        System.out.println("The sum of elements of array " + Arrays.toString(nums) + " is : " + answer);}
public static int arraySum(int[] arr){
        int sum = 0;
        for(int x : arr){
            sum += x;
        }
        return sum;
    }

}