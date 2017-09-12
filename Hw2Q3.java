import java.util.*;

public class Hw2Q3{

   public static void main(String args[])
   {
	
	  String realString , rCopy = "";
	  Scanner in = new Scanner(System.in);

          System.out.println("\n\nEnter a string to check if it is a palindrome");
           realString = in.nextLine();

      for ( int i = (realString.length() - 1) ; i >= 0 ; i-- )
         rCopy  = rCopy + realString.charAt(i);

      if (realString.equals(rCopy)){
         System.out.println("This string is a palindrome.");}
      else{
         System.out.println("This string is not a palindrome.");}

   }
}
