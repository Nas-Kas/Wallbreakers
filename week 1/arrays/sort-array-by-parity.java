class Solution {
    public int[] sortArrayByParity(int[] A) {
        int [] result = new int [A.length];
        int counter = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                result[counter] = A[i];
                counter++;
            }
        }
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 != 0){
                result[counter] = A[i];
                counter++;
            }
        }
        
        return result;
        }
    }
