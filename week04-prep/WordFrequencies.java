import java.util.Scanner;
import java.util.ArrayList;
public class WordFrequencies {
   public static void main(String[] args) {
      // TODO: Implement your code here
      Scanner scan = new Scanner(System.in);
      int elements= scan.nextInt();
      String[] words = new String[elements];
      int i;
      int o;
      int frequency = 0;
      for( i = 0; i<elements; ++i){
         words[i] = scan.next();
      }
      for (i = 0; i<elements; ++i){
         for(o = 0; o<elements; ++o){
            if( words[i].equals( words[o])){ 
               frequency+=1;
            }
         }
         
         System.out.print(words[i]+" "+frequency+" ");
         frequency = 0;
      }
      
   }
}
   
