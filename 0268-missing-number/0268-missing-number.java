class Solution {
    public int missingNumber(int[] nums) {
        int range=nums.length;
        int actSum=(range*(range+1))/2;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum=currSum+nums[i];
        }
       int ans=actSum-currSum;
       return ans;
    }
}