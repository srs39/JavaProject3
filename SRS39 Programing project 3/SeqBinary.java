/** This program prints binary number when given decimal number.
*Precondition: must be a positive integer.
*  @author Samantha Shoecraft  
*  @version 3/5/2016
*/
import java.util.*;
public class SeqBinary {
   public static void main(String[] Args){
      number("00101", 2);
   }
   
   /*This method takes in a prefix and show all possible combinations
   *@param prefix is the beging binary sequence
   *@param k is the max number of digits added;
   */
   public static void number(String prefix, int k){
         double m = 1.0 * k;
         int s = (int)Math.pow(2, m);
         System.out.println(s);
         numbers(prefix, s);
         
   }
   
   private static void numbers(String prefix, int k){
      
      if (k == 0){
         System.out.println();
      }else {
         System.out.print(prefix);
         
         if (k-1<2){
            System.out.print("0");
         }
         binaryPrint(k-1);
         System.out.println();
         
         numbers(prefix, k-1);
         
         }
      }

   
      public static void binaryPrint(int n){
       if (n <= 1){
         System.out.print("");//prints nothing
       }else
         binaryPrint(n/2);//recursive call
         System.out.print(n%2);//prints binary digit
      }
}
      
      
            
      