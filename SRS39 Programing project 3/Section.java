/**  
*  This program prints sections consisting of a string followed by the .  
*  apropriate number of sub sections.
*  @author Samantha Shoecraft  
*  @version 3/5/2016
*/
public class Section {
   // The main method.
   public static void main(String[] args) {
      numbers("THEREBLIG", 2);// call to public method.
   }
   /*This metod has a call to the private recursive metod.
   * @param prefix String containing print statement.
   *@param levels int for how many numbers there should be.
   */
   public static void numbers(String prefix, int levels){
      for(int i = 1; i <10; i ++){ //loop that calls recursive method and changes c.
         numbers(prefix, levels, i );
        
      }
   }
   /**recursive metod that takes in string and number of printed levels.
   *@param prefix string to be printed
   *@param levels number of levels of numbers
   *@param c number to be added to string
   */
   private static void numbers(String prefix, int levels, int c){
        String s = prefix + c + ".";//numbr added to string
        
        if (levels == 1){
         System.out.println(s);//if no more levels, print

        }else {
           for( int i = 1; i <=9; i++){
           c = i;//changes number to be added
           numbers(s, levels-1, c);// recursive call
           }
           
        
        
         
         
      }
   }
}

      
      
      