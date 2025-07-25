
package fritzie;

import java.util.Scanner;


public class Fritzie {

   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Yanna";
        int byear = 2005;
        
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your byear: ");
        byear = sc.nextInt();
        
        
        System.out.println("Hello  " +name+ " your age is " +(2025-byear));
    }
}
