public class CountNum {

       public static void main(String[] args) {
        int n = 5535;

        int Count = 0 ;
        while (n>0) {
        
        int rem = n % 10;
        if(rem == 5){
            Count ++;
         }
        n = n/10;
        }
        System.out.println(Count);
       }
}