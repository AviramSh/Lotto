/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticket;

import Ticket.TicketGenerator.Row;

/**
 *
 * @author alex-ks53
 */
public class Ticket {

    public Ticket(int rowNum) {
        int[] ticket=new int[rowNum];
        FillTicket(rowNum);
    }
    
    
    


public void FillTicket(int rows){
    Row row = new Row();
    for(int i=0;i<rows;i++)
    {
        
    }
}
}