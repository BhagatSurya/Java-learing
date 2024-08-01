public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println(FindArea(4));
    }

    // static  double FindArea( int r){
    //            double Area;
    //            double pi = 3.14159;
    //            Area = pi * (r*r);

    //            return Area;
    // }

    static  double FindArea(int radius){
        if(radius < 0 ){
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return Math.PI * (radius* radius);
    }
}
