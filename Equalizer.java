
import java.util.Random;

public class Equalizer {
    public static void main(String[] args) {
        eq_5_sorbol();
    }
    
    public static void eq() {
        
       int db = (int) (Math.random()*5)+3;
       eq(db);
    }
    
    public static void eq_5_sorbol() {
        
       eq();
       eq(12);
       eq();
       eq(8);
       eq();
    }
    
    public static void eq(int hossz) {

       String szin = "\u001B[45m";
       
       for (int i = 0; i < hossz; i++) {
            System.out.print(szin + " ");
       }
        System.out.println(" ");
      
    }
    
   
}
