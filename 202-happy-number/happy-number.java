class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hash = new HashSet<>();
        while(n!=1){
            int sum=0;
            if(hash.contains(n)){
                return false;
            }
            hash.add(n);
            while(n>0){
                sum+=(int)Math.pow((n%10),2);
                n=n/10;
            }
            n=sum;
        }
        return true;
    }
}