class Solution {
    // public int removeDuplicates(int[] nums) {
    //     int count=0;
    //     for(int i=0;i<nums.length;i++){
    //         if(i<nums.length-1 && nums[i]==nums[i+1]){
    //             continue;
    //         }else{
    //             nums[count]=nums[i];
    //             count++;
    //         }
    //     }
    //      return count;
    // }
    public int removeDuplicates(int[] nums) {
        int i=1;
        for(int j=1;j<nums.length;j++){
            if(nums[j-1]!=nums[j]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
   
}