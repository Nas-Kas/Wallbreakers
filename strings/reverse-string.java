class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        if(s.length <= 1){
            //do nothing
        }else{
        char temp = s[start];
        while(start <= end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
      }
    }
}