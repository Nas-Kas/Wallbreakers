class Solution {
    public boolean isAnagram(String s, String t) {
        return (mapper(s).equals(mapper(t)));
    }
    
    public HashMap<Character,Integer> mapper(String input){
        HashMap<Character,Integer> result = new HashMap<Character,Integer>();
        for(int i = 0; i < input.length(); i++){
            if(!result.containsKey(input.charAt(i))){
                result.put(input.charAt(i), 1);
            }else{
                result.put(input.charAt(i), result.get(input.charAt(i)) + 1);
            }
        }
        return result;
    }
}