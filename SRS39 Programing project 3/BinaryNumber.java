/** This program prints binary number when given decimal number.
*Precondition: must be a positive integer.
*  @author Samantha Shoecraft  
*  @version 3/5/2016
*/


import java.util.*;
public class BinaryNumber {
   public static void main(String[] args){
      binaryPrint(27);
    }
    
    /*This method takes a binary number and prints out it's binary equivalent.
    *@param n is a positive decimal integer.
    */
    
    public static void binaryPrint(int n){
      if (n <= 1){
         System.out.print("");//prints nothing
      }else
         binaryPrint(n/2);//recursive call
         System.out.print(n%2);//prints binary digit
      }
   }
