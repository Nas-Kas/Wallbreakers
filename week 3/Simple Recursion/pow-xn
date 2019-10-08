class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        boolean pos;
        if(Math.signum(n) == 1){
            pos = true;
        }else{
            pos = false;
        }
        n = Math.abs(n);
        double result = myPowHelper(x,n,x);
            if(!pos){
                return 1/result;
            }
        return result;
        }
    
    public double myPowHelper(double x, double n, double base){
        if(n <= 1){
            return x;
        }
        System.out.println(n);
        return myPowHelper(x * base, n - 1, base);
    }
       
    }

    