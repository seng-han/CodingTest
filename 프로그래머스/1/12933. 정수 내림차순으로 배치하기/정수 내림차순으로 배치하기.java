class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        char[] charArray = str.toCharArray();
        java.util.Arrays.sort(charArray);
        
        StringBuilder sb = new StringBuilder(new String(charArray));
        sb.reverse();
        
        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}