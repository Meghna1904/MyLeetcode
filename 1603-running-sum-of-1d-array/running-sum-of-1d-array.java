class Solution {
    public int[] runningSum(int[] nums) {
        int[] nums1 = new int[nums.length];
        nums1[0]=nums[0];
        for(int i=0;i<nums.length-1;i++){
            nums1[i+1]=nums1[i]+nums[i+1];

        }
        return nums1;
    }
}