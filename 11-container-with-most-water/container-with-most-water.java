class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int max=0;
        int area=0;
        int right=height.length-1;
        while(left<right){
            if(height[left]<=height[right]){
                 area=height[left]*(right-left);
                left++;
            }
            else{
                 area=height[right]*(right-left);
                right--;
            }
            max= Math.max(max,area);
        }
        return max;
    }
}