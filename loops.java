public class loops {
    public static void main(String[] args) {
        
        int n = 2 ; 
        for(int i = 1;i<=20;i+=n) {
            System.out.println("for loop:" + i);
            System.out.println("----------");
        }

        int nn =1;
       
        while ( nn<=20) {
            System.out.println("while loop:"+ +nn);
            nn+=n;
            System.out.println("----------");

        }

        do {
            System.out.println("do while loop");

            System.out.println(nn+=n);
            if(nn<=20){
                System.out.println("----------");
            }

        } while(nn<=20);
    }
}
