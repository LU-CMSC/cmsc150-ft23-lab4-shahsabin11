 import java.util.Scanner;
 public class Correction {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number");
    int x = in.nextInt(); 
    if ( x > 0 && x < 10) {
        System.out.println("It is a single digit positive number");
    } else {
        System.out.println("It is not a single digit positive number");
    } 
    
} 



    
}
