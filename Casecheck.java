import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char a  = in.next().trim().charAt(0);
        if(a>='A' && a <='Z'){
            System.out.println("UpperCase");
        }else{
            System.out.println("LowerCase");
        }
    }
}
