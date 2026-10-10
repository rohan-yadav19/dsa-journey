class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int i=m-1;
        // int j=n-1;
        // int k=m+n-1;
        // while(j>=0){
        //     if(i>=0 && nums1[i]>nums2[j]){
        //         nums1[k]=nums1[i];
        //         k--;
        //         i--;
        //     }else{
        //         nums1[k]=nums2[j];
        //         k--;
        //         j--;
        //     }

        // }
        int p1=m-1;
        int p2=n-1;
        for(int p=m+n-1;p>=0;p--){
            if(p2<0){
                break;
            }
            if(p1>=0 &&nums1[p1]>nums2[p2]){
                nums1[p]=nums1[p1];
                p1--;
            }else{
                nums1[p]=nums2[p2];
                p2--;
            }
        }
    }
}