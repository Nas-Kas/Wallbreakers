class Solution {
    public String reverseWords(String s) {
       String [] words = s.split(" ");
       String result = "";
       for(int i = 0; i < words.length; i++){
           result += " " + reverseWord(words[i]);
       }
        return result.substring(1,result.length());
    }
    
    public String reverseWord(String input){
        String output = "";
        for(int i = input.length()-1; i >= 0; i--){
            output += input.charAt(i) + "";
        }
        return output;
    }
}