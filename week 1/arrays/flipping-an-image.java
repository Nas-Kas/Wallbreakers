class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        flipI(A);
        invertmatrix(A);
        return A;
    }
    public void invertmatrix(int [] [] input){
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input[0].length; j++){
                if(input[i][j] == 0){
                    input[i][j] = 1;
                }else{
                    input[i][j] = 0;
                }
            }
        }
    }
    public void flipI(int [] [] input){
        for(int i = 0; i < input.length; i++){
            input[i] = reverse(input[i]);
        }
    }
    public int [] reverse(int [] input){
        int [] result = new int [input.length];
        for(int i = 0; i < input.length; i++){
            result[i] = input[input.length - i - 1];
        }
        return result;
    }
}