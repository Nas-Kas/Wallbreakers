class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int current = nums.length/2;
        if(nums[0] == target){
            return 0;
        }
        if(nums[end] == target){
            return end;
        }
        if(nums[start] == target){
            return start;
        }
        if(nums[current] == target){
            return current;
        }
        while(nums[current] != target){
            System.out.println(start);
            System.out.println(end);
            System.out.println(current);
            if(nums[current] < target){
                start = current;
                current += (end - start)/2;
            }
            if(nums[current] > target){
                end = current;
                current += (start - end)/2;
            }
            if(nums[current] == target){
                return current;
            }
            if((end - (start + 1)) <= 1){
                return -1;
            }
        }
        return -1;
    }
}