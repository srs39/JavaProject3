/**  
*  This program takes in a min and max number and prints a triangle  
*  precondition: m <= n
*  @author Samantha Shoecraft  
*  @version 3/5/2016
*/
public class Triangle {
   //main method
   public static void main(String[] args) {
      triangle(3, 5);//first call to recursive method
   }
   /**
   *  method to print triangle calls it's self until n number of stars is reached.
   * @param m is the minimum number of stars printed.
   * @param n the maximum number of stars printed.
   */
   
   public static void triangle(int m, int n) {
      if (m > n){
         System.out.print("");//base condition. once reached prints nothing.
      }else {
         for (int i = 0; i < m; i++) {
            System.out.print("*");//loop to print m number of stars.
         }
         System.out.println();//print new line.
         triangle(m+1, n);//recursive call.
         for (int i = 0; i < m; i++) {
            System.out.print("*");//print next line.
         }
         System.out.println();//print new line.
      }
   }
}