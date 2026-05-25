class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hash = new HashSet<>();
        while(n!=1){
            if(hash.contains(n)){
                return false;
            }
            hash.add(n);
            int num=0;
        while(n>0){
            num=num+(int)Math.pow(n%10,2);
            n=n/10;
            
        }
        n=num;
        }
        return true;
    }
}