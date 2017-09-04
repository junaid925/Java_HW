/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author junaid
 */
public class Hw1Q2 {
    
                
                
    public static void main(String[] args) {
        PrintWriter printWriter = null;
        try {
            int r;
            Scanner s = new Scanner(System.in);
            DecimalFormat myFormat = new DecimalFormat(".#");
            File file = new File("output.txt");
            printWriter = new PrintWriter("output.txt");
            do{
                r = s.nextInt();
                printWriter.println("Enter radius of circle: "+ r);
                double area = (double) Math.PI * Math.pow(r,2);
                printWriter.println("Area of circle: "+ myFormat.format(area));
                printWriter.println("");
                
            } while(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Hw1Q2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            printWriter.close();
        }
    }
   
     
}
