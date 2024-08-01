class Solution {
    public int subtractProductAndSum(int n) {
        int sum= 0;
        int product =0;

        while(n<0){
            int rem = n%10;
            sum += rem;
            product =  product * rem;
            n= n/10;
        }
        int Result  =  sum - product;
         return Result ;
     
}

}