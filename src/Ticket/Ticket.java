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
        Row[]ticket = FillTicket(rowNum);
        
        for(int i=0;i<rowNum;i++){
            for (int j = 0; j < ticket.length; j++) {
                
                System.out.print(ticket[j]+" ");
                if(j == (ticket.length-2))
                    System.out.print("+");
            
            }
            System.out.println();
        }
    }
    
    
    


public Row[] FillTicket(int rows){
    Row[] ticket = null;
    
    for(int i=0;i<rows;i++)
    {
        ticket[i]=new Row();
    }
    return ticket;
}
}