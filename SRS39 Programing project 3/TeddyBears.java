/**  
*  This program determins if you are able to win the teady bear picnic game.
*  
*  @author Samantha Shoecraft  
*  @version 3/5/2016
*/
public class TeddyBears {

   public static void main(String[] args){
      System.out.print(bear(52));
   }
   /* this method takes in the number of bears and tells you if you can win the game (42 wins the game).   
   * @param n is the current number of bears.
   * @return returns true if the number of bears will win the game. otherwise, returns false.
   */
   public static boolean bear (int n){
      if (n == 42){//base case checks for winning number.
         return true;
      }else if (n <42){//checks for loss.
         return false;
      }else{
         if (n%5 == 0){//checks if divsable by 5 then subtracts 42.
            n-= 42;  
         }else if (n % 2 == 0 && n/2 >= 42){// checks that n is divisable by 2, and that n/2 is greater than 42, divides n by 2.
            n /=2;
          }else if (n % 3 == 0 || n % 4 == 0){// checks if n is devisable by 4 or 3, then multiplies the last two numbers and subtracts them from n.
            n = n -((n%10)*((n%100)/10));
          }
          
          return bear(n);
       }
    }
 }
 
            
      