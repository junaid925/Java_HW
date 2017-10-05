import java.util.*;

public class MCarlo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        long n = 300000000;
        
        System.out.println("Please enter the radius: ");
        double r = scanner.nextDouble();
        
        int inSide = 0, outSide = 0;
        
        for (int i = 1; i < n; i++) {
            double x = Math.random() * r;
            double y = Math.random() * r;
            if ((Math.pow(x, 2) + Math.pow(y, 2)) <= Math.pow(r, 2)) {
                inSide++;
            } else {
                outSide++;
            }
        }
        
        System.out.println("Inside Circle: " + inSide);
        System.out.println("Inside Square: " + outSide);
        System.out.println("PI = " + (double) 4 * inSide / n);
    }
}
