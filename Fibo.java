
public class Fibo {
    public static void main(String[] args) {
        int till = 10;
        int first = 0;
        int secount = 1;


        for(int i=1;i<till;i++){
            System.out.print(first + " ");

            int next = first + secount;
            secount = first;
            first = next;
        }

   
    }
}
