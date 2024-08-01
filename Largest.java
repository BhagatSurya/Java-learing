import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       int a = in.nextInt();
       int b = in.nextInt();
       int c = in.nextInt();

       int max ;
       /* 
       if(a > b && a> c ){
        sum= a ;
       } 
       else if(b > c ){
        sum= b;
       }
       else  {
        sum= c;
       } 
        */
        max = a ; 
       if(b>max){
        max = b;
       }
       if(c>max){
        max = c;
       }

       System.out.println(max);

   }
}
