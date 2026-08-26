 import java.util.Arrays;
 import java.util.Scanner;
 public class DuplicateElements {
    public static boolean hasDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        boolean result=hasDuplicate(nums);
        if(result){
            System.out.println("The array contains duplicate elements.");
        }else{
            System.out.println("The array does not contain duplicate elements.");
        }
    }
}
