import java.util.*;
/**
 *
 * @author junaid
 */
public class MainQ5 {
    
    public static void main(String[] args) {
        
        int distanceAB,distanceAC,distanceBC;
        while(true){
        System.out.println("Type in the value of 2D points A (x1,y1)");
        Scanner keyboard = new Scanner(System.in);
        int x1 = keyboard.nextInt();
        int y1 = keyboard.nextInt();
        
        System.out.println("Type in the value of 2D points B (x2,y2)?");
        int x2 = keyboard.nextInt();
        int y2 = keyboard.nextInt();

        System.out.println("Type in the value of 2D points C (x3,y3)?");
        int x3 = keyboard.nextInt();
        int y3 = keyboard.nextInt();
        
        
        distanceAB = (int) Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
        distanceAC = (int) Math.sqrt(Math.pow((x1-x3), 2) + Math.pow((y1-y3), 2));
        distanceBC = (int) Math.sqrt(Math.pow((x2-x3), 2) + Math.pow((y2-y3), 2));
        
        
        if((distanceAB+distanceAC)>distanceBC
                 &&(distanceAB+distanceBC)>distanceAC 
                 &&(distanceAC+distanceBC)>distanceAB
                 &&(distanceAB+distanceBC)>distanceAC ){
                System.out.println("Yes, this is a real triangle");
                System.out.println("--------------------------------------------\n\n");}
        else {
            
            System.out.println("This triangle is fake");
            System.out.println("--------------------------------------------\n\n");
        }
      
        }
            
    }
    
    
}
