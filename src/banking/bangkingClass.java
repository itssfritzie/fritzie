/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author Nino
 */
public class bangkingClass {
    int accNum = 1234;
    int pin = 1234;
    
    public boolean virifyAccount(int acc, int pn){
        if(accNum == acc && pin == pn){
            return true;
        }else{
            return false;
        }
    }
}
