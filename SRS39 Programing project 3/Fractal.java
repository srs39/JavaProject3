/**  
*  This program prints a fractal pattern.
* 
*  @author Samantha Shoecraft  
*  @version 3/5/2016
*/
public class Fractal {
   
   public static void main(String[] args){
      
      pattern(8,0);
   }
   
   /**This creates the pattern.
   *Precondition: n is a power of 2 greater than 0.
   *Postcondition: a fractal like pattern is printed.
   *@param n is an integer for the maximum number of stars;
   *@param i is an integer for the minimum number of spaces;
   */
   public static void pattern(int n, int i) {
      if (n <=0){
       System.out.print("");  
      }else{
         pattern(n/2, i++);
         //pattern(n/2, i);
 
          //System.out.print(
         for(int k = 1; k < i*2; k++){
            System.out.print("  ");
          }
          for(int j = 0; j < n; j ++){
            System.out.print("* ");
          }

            
          
          System.out.println();

               
                pattern(n/2, i++);
       
     } 
   }
}  