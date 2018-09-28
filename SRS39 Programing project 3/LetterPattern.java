/** This program prints out a letter pattern.
*Precondition: must be capital letter.
*  @author Samantha Shoecraft  
*  @version 3/5/2016
*/
public class LetterPattern {
   public static void main(String[] args){
      letters('D');
   }
   
   /*This method takes a character and prints the indexes before it as well as the indexes before those indexes.
   *@param capital letter that is the starting index.
   */
   public static void letters(char c){
      String ls = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//letters to choose from
      if (ls.indexOf(c) ==0){
         System.out.print(ls.charAt(ls.indexOf(c)));//print letter at c
      }else{
         
         letters(ls.charAt(ls.indexOf(c-1)));//
         System.out.print(ls.charAt(ls.indexOf(c)));
         
         letters(ls.charAt(ls.indexOf(c-1)));
         
      }
   }
}