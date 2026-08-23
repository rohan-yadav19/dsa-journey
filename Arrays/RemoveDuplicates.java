 import java.util.Scanner;
 public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            } else{
                nums[count]=nums[i];
                count++;
            }


        }
        return count;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int result = removeDuplicates(nums);
        System.out.println("New length after removing duplicates: " + result);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
