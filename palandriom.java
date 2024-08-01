public class palandriom {
 public static void main(String[] args) {
    int num  = 121;
    System.out.println(isPalindrome(num));
 }

//  static boolean isPalindrome(int x) {
//     int sum =0 ;
//     int original = x; 
//     while(x > 0){
//         int rem = x%10;
//         x =  x / 10;
//         sum  += rem;
   
//     }
//     return original == sum;
static boolean isPalindrome(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
    }
    
    int revertedNumber = 0;
    while (x > revertedNumber) {
        revertedNumber = revertedNumber * 10 + x % 10;
        x /= 10;
    }
    
    return x == revertedNumber || x == revertedNumber / 10;
}
}




    

