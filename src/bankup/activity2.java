package bankup;

import java.util.Scanner;
import banking.bangkingClass;

public class activity2 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today?\n");
        
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("\nEnter your chooce: ");
        int option = s.nextInt();
        
        int attemp = 0;
        
        switch(option){
            case 1:
                while(attemp < 3){
                    bangkingClass bank = new bangkingClass();
                   
                    System.out.println("Attemp: " +(attemp+1));
                    
                    System.out.print("Enter your Account No: ");
                    int acc = s.nextInt();

                    System.out.print("Enter your Pin: ");
                    int acpin = s.nextInt();

                    if(bank.virifyAccount(acc, acpin)){
                        System.out.println("\nLOGIN SUCCESS");
                    }else{
                        System.out.println("\nINVALID ACCOUNT!");
                        attemp++;
                    }
                }
            break;
        }
    }
}
