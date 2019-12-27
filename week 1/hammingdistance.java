class Solution {
    public int hammingDistance(int x, int y) {
        int res = 0;
        String [] test = convertToBinary(y);
        String [] test2 = convertToBinary(x);
        if(test.length > test2.length){// put the smaller one first
            res = calcDistance(test2,test);
        }else{
            res = calcDistance(test,test2);
        }
        return res;
    }
    public String [] convertToBinary(int x){
        int count = 0;
        double temp = x;
        String res = "";
        while(temp >= Math.pow(2,count)){
            count++;
        }
        String [] binaryRep = new String [count + 1];
        while(count >= 0){
            double current = (temp - (Math.pow(2,count)));
            if(current >= 0){
                binaryRep[count] = "1";
                temp = temp - Math.pow(2,count);
            }else{
                binaryRep[count] = "0";
            }
            count--;
        }
    return binaryRep;
    }
    
    public int calcDistance(String [] a, String [] b){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                count++;
            }
        }
        for(int j = a.length; j < b.length; j++){
            if(b[j] == "1"){
                count++;
            }
        }
        return count;
    }
}