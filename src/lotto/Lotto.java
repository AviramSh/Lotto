/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AVIRAM
 */
public class Lotto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int[] myTicket= new int[7];
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Lotto 6 numbers : ");
        
        for(int i=0;i<6;i++)
            input.nextInt(myTicket[i]);
        
        System.out.println("Enter strong number : ");
        input.nextInt(myTicket[6]);
        
        Row myRow = new Row();
        
       myRow.setNumber(myTicket);
       myRow.setStrongNumber(myTicket[7]);
    }
    
    
}
