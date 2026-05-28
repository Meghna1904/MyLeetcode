class Solution {
    public int romanToInt(String s) {

        
            int sum=0;
              for(int i = 0; i < s.length(); i++) {
                int curr= f(s.charAt(i));
                if(i<s.length()-1){
                int next=f(s.charAt(i+1));
                if(curr<next){
                    sum -= curr;
                }
                else{
                sum+=curr;
                }

                }
                else{
                sum += curr;
                }
                
            }
        
        return sum;

    }

    public int f(char s){
        int num=0;
        if(s=='I'){
            return 1;
        }
        else if(s=='V'){
            return 5;
        }
        else if(s=='X'){
            return 10;
        }
        else if(s=='L'){
            return 50;
        }
        else if(s=='C'){
            return 100;
        }
        else if(s=='D'){
            return 500;
        }
        else if(s=='M'){
            return 1000;
        }
        else{
            System.out.println("Invalid");
        }
        return 0;
    }
}