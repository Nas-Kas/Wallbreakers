class Solution {

    public int titleToNumber(String s) {
        int total = 0;
        if(s.length() == 0) return 0;
        if(s.length() == 1) return s.charAt(0) -'A' + 1;
        int baseCount = s.length()-1;
        for(int i = 0; i < s.length(); i++){
            total = 26 * total + s.charAt(i) -'A' + 1;
        }
        return total;   
    }

}