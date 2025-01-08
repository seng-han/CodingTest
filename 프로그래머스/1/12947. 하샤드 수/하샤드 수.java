class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int num = x;
        
        while(num>0){
            sum += num % 10; //마지막 자리 수
            num /= 10;// 마지막 자리 제거
        }
        
      return x % sum ==0;
    }
}