import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // String frut = in.nextLine();

        //  switch (frut) {
        //     case "mango" -> System.out.println("king of frutes");
        //     case "Apple" -> System.out.println("red colour frutes");
                 
        //     case "Orange"->System.out.println("orange colour frutes");
                
        //     default -> System.out.println("please enter valide frute");

        //  }

        int day = in.nextInt();

        // switch (day) {
        //     case 1 -> System.out.println("monday");
        //     case 2 -> System.out.println("thusday");
        //     case 3 -> System.out.println("wednesday");
        //     case 4 -> System.out.println("thursday");

        //     case 5 -> System.out.println("friday");

        //     case 6 -> System.out.println("saturday");

        //     case 7 -> System.out.println("sunday");
        
        //     default-> System.out.println("enter vaild d");
              
        // }

        switch (day) {
            case 1,2,3,5 -> System.out.println("monday");
            
            case 7 -> System.out.println("sunday");
        
            default-> System.out.println("enter vaild d");
              
        }
        
    }
}
