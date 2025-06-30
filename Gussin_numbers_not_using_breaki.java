
package gussin_numbers_not_using_breaki;
import java.util.Scanner;

public class Gussin_numbers_not_using_breaki {

   
    public static void main(String[] args) {
        Scanner name = new Scanner (System.in);
         int random = (int)(Math.random()*100);
        System.out.println("hidden number: "+random);
        System.out.println("guess the number ");
        int userInput = 0;
        boolean result = (userInput != random) ^ (userInput == random);
        while (result){
        userInput = name.nextInt();
         if (userInput == random){
             System.out.println("Correct Answer");
         result = false;
         }else if (userInput > random){
         if (((userInput-random)>=60)){
             System.out.println("too high ");
         
         }else if (((userInput-random)>=30) && ((userInput-random)<60)){
             System.out.println("very high");
         
         }else if (((userInput-random)>=10) && ((userInput-random)<30)){
             System.out.println("very close , (high)");
         }else if (((userInput-random)>=1) && ((userInput-random)<10)){
             System.out.println("too close , (high)");
         }
         
         }else if (random > userInput){
            if( ((random - userInput)>=60)){
                System.out.println("too low");
            }else if (((random - userInput)>=30) && ((random -userInput)<60)){
                System.out.println("very low");
            }else if (((random - userInput)>=10) && ((random -userInput)<30)){
                System.out.println("very close, (low)");
            }else if (((random - userInput)>=1) && ((random -userInput)<10)){
              System.out.println("too close, (low)");
            }
         }   
            
        
        
        }
        
        
        
        
        
    }
    
}
