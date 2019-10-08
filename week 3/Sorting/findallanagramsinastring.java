class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            ArrayList<Integer> results = new ArrayList<Integer>();
            int len = s.length() - p.length() + 1;
            int pLen = p.length();
            for(int i = 0; i < len; i++){
                if(isAnagram(s.substring(i,i + pLen),p)){
                    results.add(i);
                }
            }
            return results;
        }

        public boolean isAnagram(String a, String b){
            Map<Character,Integer> A = new HashMap<Character,Integer>();
            Map<Character,Integer> B = new HashMap<Character,Integer>();
            for(int i = 0; i < a.length(); i++){
                if(A.containsKey(a.charAt(i))){
                    A.put(a.charAt(i), A.get(a.charAt(i)) + 1);
                }else{
                    A.put(a.charAt(i), 1);
                }
            }
            for(int i = 0; i < b.length(); i++){
                if(B.containsKey(b.charAt(i))){
                    B.put(b.charAt(i), B.get(b.charAt(i)) + 1);
                }else{
                    B.put(b.charAt(i), 1);
                }
            }
            
            return B.equals(A);
    }
              
}