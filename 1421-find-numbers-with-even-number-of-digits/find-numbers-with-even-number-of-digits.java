class Solution {
    public int findNumbers(int[] nums) {
        int count2=0;
        for(int x : nums){
            int count=0;
            while(x!=0){
                x=x/10;
                count++;
            }
            if(count%2==0){
                count2++;
            }
        }
        return count2;}
    
}