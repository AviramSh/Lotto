/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticket.TicketGenerator;

import java.util.Random;

/**
 *
 * @author alex-ks53
 */
public class Row {

    Random rand = new Random();
    int[] row = new int[7];
//    int[] row = {0,0,0,0,0,0,0};
    int[] numberTestArray = new int[38];

    public Row() {

        
        int num;

        for (int i = 0; i < row.length; i++) {
            
            if(i!=6){
                num = rand.nextInt(37) + 1;
            }else{

                num = rand.nextInt(7) + 1;
            }
            
            if (numberTestArray[num] != 0) {
                --i;
            }else{
                numberTestArray[num]++;
                row[i]=num;
            }

        }

    }

    public int[] getMyRow() {
        return numberTestArray;
    }

    public void setNumberTestArray(int[] numberTestArray) {
        this.numberTestArray = numberTestArray;
    }
    
    
    

}
