//exceeds time limit will fix this later
class Solution {
    public String reverseVowels(String s) {
        String vowelString = "";
        String output = "";
        int count = 0;
            for(int i = s.length()-1; i >= 0; i--){
                if(isVowel(s.charAt(i))){
                    vowelString += s.charAt(i) + "";
                }
            }
            for(int i = 0; i <= s.length()-1; i++){
                if(!isVowel(s.charAt(i))){
                    output += "" + s.charAt(i);
                }else{
                    output += vowelString.charAt(count) + "";
                    count++;
                }
            }
        return output;
    }
    
    public boolean isVowel(char in){
        char input = Character.toLowerCase(in);
        if(input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u'){
            return true;
        }
        return false;
    }
}