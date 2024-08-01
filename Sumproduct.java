import java.util.Scanner;

public class Sumproduct {
    public static void main(String[] args) {
        
        Scanner input =  new Scanner(System.in);
        int n =  input.nextInt();
        int sum = 0;
        int prod = 1;
        while (n<0) {
            int rem = n % 10;
            sum+=rem;
            prod*=rem;

            n/=10;

        }
        int result = sum - prod; // Calculate the result
        System.out.println("Result (Sum - Product): " + result);


    }
}
