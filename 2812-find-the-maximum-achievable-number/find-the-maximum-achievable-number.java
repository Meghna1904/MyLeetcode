class Solution {
    public int theMaximumAchievableX(int num, int t) {
       int x = num;
       while(t>0){
        x+=2;
        num++;
        t--;
       } 
       return x;
    }
}