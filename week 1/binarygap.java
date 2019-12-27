class Solution {
    public int binaryGap(int N) {
        int [] res = intToBinary(N);
        printArr(res);
        return findMaxGap(res);
    }
    
    public int [] intToBinary(int N){
        int count = 0;
        while(Math.pow(2,count) < N){
            count++;
        }
        int [] res = new int [count + 1];
        double temp = N;
        while(count >= 0){
            double current = Math.pow(2,count);
            System.out.println(temp);
            if((temp - current) >= 0){
                res[count] = 1;
                temp = temp - current;
            }else{
                res[count] = 0;
            }
            count--;
        }
        return res;
    }
    public void printArr(int [] in){
        for(int i = 0; i < in.length; i++){
            System.out.print(in[i] + ":");
        }
        System.out.println();
    }
    public int findMaxGap(int [] input){
        int max = 0;
        int currentMax = 0;
        int i = 0;
        while(i < input.length){
            if(input[i] == 1){
                currentMax++;
                    while(input[i] != 1){
                        i++;
                        currentMax++;
                    }
                if(input[i] == 1){
                    if(currentMax > max){
                        max = currentMax;
                        currentMax = 0;
                    }
                }
            }
        }
        return max;
    }
}