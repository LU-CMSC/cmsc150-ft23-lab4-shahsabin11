import java.util.Scanner;
public class Fermat {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 'a'" );
        a = in.nextInt();
        System.out.println("Enter the second number 'b'");
        b = in.nextInt();
        System.out.println("Enter third number 'c'");
        c = in.nextInt();
        System.out.println("Enter the power number 'n'");
        n = in.nextInt();
        if ( n >= 2 & Math.pow (a,n) + Math.pow (b,n) == Math.pow(c,n)){
            System.out.println("Holy Smokes! Fermat was wrong.");

        } else { 
            System.out.println("No, that does't work");

        }
        
    }
}
