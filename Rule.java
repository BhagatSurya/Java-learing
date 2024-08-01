public class Rule {
    public static void main(String[] args) {
        int n = 1000;
        if(n<1000){
             n+=100;
        }
        if (n>= 1000) {
            n +=1000;
        } else {
            n+=0;
        }

        System.out.println(n);
    }
}
