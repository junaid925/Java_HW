import java.util.*;
 
public class Hw2Q1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int counter = 1;
 
        System.out.println("Numbers of Rows You Want In Your Pyramid?");
        int rows = s.nextInt();

        System.out.println("Here Is Your Pyramid");
 
        for (int i = rows; i > 0; i--)
        {
            for (int j = 1; j <= i*2; j++)
             
                System.out.print(" ");
            
 
            for (int k = 1; k <= counter; k++)             
                System.out.print(k +" ");
            
            for (int a = counter-1; a >= 1; a--)
                System.out.print(a+" ");             
                                      
             
            System.out.printf("%n");
 
            counter++;
        }
    }
}