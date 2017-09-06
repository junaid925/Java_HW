import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class MainQ2 {
    
                
                
    public static void main(String[] args) {
        
            int r;
            Scanner s = new Scanner(System.in);
            DecimalFormat myFormat = new DecimalFormat(".##");
        
        while(true){
                System.out.println("Enter radius of circle: ");
                r = s.nextInt();
                double area = (double) Math.PI * Math.pow(r,2);
                System.out.println("Area of circle: "+ myFormat.format(area));
                System.out.println("");
                
        }
    }
   
     
}
