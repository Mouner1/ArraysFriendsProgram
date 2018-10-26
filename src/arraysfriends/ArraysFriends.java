/*
Mouner Dabjan
October 26 2018 
Practicing Arrays 
 */

package arraysfriends;
import java.util.Scanner; 
/**
 *
 * @author modab5310
 */
public class ArraysFriends {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner keyedInput = new Scanner (System.in);
        
        String [ ] friends = new String [10];
        
        System.out.println("Enter the names of ten friends:");
        for (int i = 0; i <= 9; i = i + 1)
        {
            friends[i] = keyedInput.nextLine();
        }
        
        System.out.println("The fourth and seventh names listed were:");
        System.out.println("Fourth: " + friends[3]);
        System.out.println("Seventh: " + friends[6]); 
    }
    
}
