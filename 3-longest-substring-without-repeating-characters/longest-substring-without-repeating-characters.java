class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left=0;
        int length=set.size();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                length=Math.max(length,set.size());

            }
            else{
                while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;

}
set.add(s.charAt(i));

            }
            
    }
    return length;
    }
}