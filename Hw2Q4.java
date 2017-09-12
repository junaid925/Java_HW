import java.util.*;

public class Hw2Q4 {
    
    public static void main(String[] args) {
        /* Here we are doing unsigned right shift but not changing
         the value of x after each shift that why after 32 shifts x will come back it its
         orignal value */
        
        int x = 4282;
        for(int i=0;i<35;i++){
            System.out.printf("%d\t\t%32s\n",i,Integer.toBinaryString(x>>>i));
            /* changing the code to this can fix the issue
             System.out.printf("%d\t\t%32s\n",i,Integer.toBinaryString(x=x>>>i));*/
        }
        
        
        System.out.println ("\n\n\n\n")
        ;
        int j = 4282;
        for(int i=0;i<35;i++){
            System.out.printf("%d\t\t%32s\n",i,Integer.toBinaryString(j));
            j = j >>> i;
        }
        
    }
    
}
