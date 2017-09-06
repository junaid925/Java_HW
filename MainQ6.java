import java.util.*;

/**
 *
 * @author junaid
 */
public class MainQ6 {

    
    public static void main(String[] args) {
                double distanceAB;
        
        while(true){

        System.out.println("\n\n\n\n\n\n\nEnter the center coordinates (x1,y1) and radiuses of circle A");
        Scanner keyboard = new Scanner(System.in);
        double x1 = keyboard.nextDouble();
        double y1 = keyboard.nextDouble();
        double r1 = keyboard.nextDouble();

        System.out.println("Enter the center coordinates (x2,y2) and radiuses of circle B");
        double x2 = keyboard.nextDouble();
        double y2 = keyboard.nextDouble();
        double r2 = keyboard.nextDouble();

        distanceAB = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        if (distanceAB == (r1 + r2)) {
            System.out.println("The circles touch externally");
        } else if (distanceAB == (r1 - r2)) {
            System.out.println("The circles touch internally");
        }
        if (r2 >= r1 && distanceAB <= (r2 - r1)) {
            System.out.println("Circle A is inside Circle B.");
        } else if (r1 >= r2 && distanceAB <= (r1 - r2)) {
            System.out.println("Circle B is inside Circle A.");
        } else if (distanceAB > (r1 + r2)) {
            System.out.println("Circle B does not overlap Circle A.");
        } else {
            System.out.println("Circle B overlaps Circle A.");
        }
    }
    }
}

