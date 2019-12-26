class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(count.containsKey(nums[i])){
                count.put(nums[i],count.get(nums[i]) + 1);
            }
            else{
                count.put(nums[i], 1);
            }
        }
       for(int i = 0; i < nums.length; i++){
           if(count.get(nums[i]) == 1){
               return nums[i];
           }
       }
        return -1;
    }
}