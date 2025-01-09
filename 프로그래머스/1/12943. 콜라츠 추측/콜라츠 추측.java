class Solution {
    public int solution(int num) {
        long number = num; //오버플로우 방지를 위해서 long으로 변환
        int count = 0;
        while(number != 1) {
            if(count == 500){
                return -1;
            }
            if(number % 2 == 0){
                number /=2;
            }else{
                number = number * 3 +1;
        }
            count++;
        }
        return count;
    }
}