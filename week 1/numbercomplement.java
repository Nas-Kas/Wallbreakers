class Solution {
    public int findComplement(int num) { // go back and optimize this later
        int [] res = convertToBinary(num);
        int [] res2 = shrinkArr(res);
        flipBits(res2);
        int res3 = convertToInt(res2);
        return res3;
    }
    
    public int [] convertToBinary(int x){
        int count = 0;
        double temp = x;
        while(temp >= Math.pow(2,count)){
            count++;
        }
        int [] binaryRep = new int [count + 1];
        while(count >= 0){
            double current = (temp - (Math.pow(2,count)));
            if(current >= 0){
                binaryRep[count] = 1;
                temp = temp - Math.pow(2,count);
            }else{
                binaryRep[count] = 0;
            }
            count--;
        }
    return binaryRep;
    }

    public int convertToInt(int [] input){
        double result = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] == 1){
                result = result + Math.pow(2,i);
            }
        }
        return (int)result;
    }
    
    public void flipBits(int [] input){
        for(int i = 0; i < input.length; i++){
            if(input[i] == 0){
                input[i] = 1;
            }
            else{
                input[i] = 0;
            }
        }
    }
    public void printArr(int [] input){
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i] + ":");
        }
        System.out.println();
    }
    public int [] shrinkArr(int [] input){//remove leading zeroes
        int size = input.length-1;
        for(int i = input.length-1; i >= 0; i--){
            if(input[i] == 0){
                size--;
            }
            if(input[i] == 1){
                break;
            }
        }
        int [] newArr = new int [size];
        for(int i = 0; i < size; i++){
            newArr[i] = input[i];
        }
        return newArr;
    }
}