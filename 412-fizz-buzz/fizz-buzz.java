class Solution {
    public List<String> fizzBuzz(int n) {
        String arr[] = new String[n];

        for(int i=0;i<n;i++){
            
            if((i+1)%3==0&&(i+1)%5==0){
                arr[i]="FizzBuzz";
            }
            else if((i+1)%5==0){
                arr[i]="Buzz";
            }
            else if((i+1)%3==0){
                arr[i]="Fizz";
            
            }
            else{
                arr[i]=String.valueOf(i+1);
            }
            
        }
        List<String>  lis = Arrays.asList(arr);
        return lis;
    }
}