/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javahw1;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author junaid
 */
public class Javahw1 {

    public static void main(String[] args) {
        
           
         // randomly generate numbers from 0-11
        int month = (int) new Random().nextInt(12);
        getMonthName(month);
        
       
    }
    
    public static void getMonthName(int i) {
        
        PrintWriter printWriter = null;
        try {
            ArrayList<String> months = new ArrayList<String>();
            months.add("January");
            months.add("February");
            months.add("March");
            months.add("April");
            months.add("May");
            months.add("June");
            months.add("July");
            months.add("August");
            months.add("September");
            months.add("October");
            months.add("November");
            months.add("December");
            
            File file = new File("output.txt");
            printWriter = new PrintWriter("output.txt");
            printWriter.println(months.get(i));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Javahw1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            printWriter.close();
        }
            
    }
    
}
