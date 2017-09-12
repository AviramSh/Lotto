/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticket;

import Ticket.TicketGenerator.Row;
import java.util.ArrayList;

/**
 *
 * @author alex-ks53
 */
public class Ticket {

    public Ticket(int rowNum) {
        
        ArrayList<Row> ticket =new ArrayList<Row>();
//        Row[]ticket = FillTicket(rowNum);
        
        for(int i=0;i<rowNum;i++){
            ticket.add(new Row());
        }
        
        
        for (Row myRow : ticket) {
            
            int[] temp = myRow.getMyRow();
            for (int i = 0 ;i<temp.length; i++) {
               System.out.print(temp[i]+" , "); 
            }
            System.out.println(" "); 
            
        }
    }
    
    
    


public Row[] FillTicket(int rows){
    Row[] ticket = null;
    
    for(int i=0;i<rows;i++)
    {
        Row row= new Row();
        ticket[i]=row;
        
        ticket[i].getMyRow();
    }
    return ticket;
}
}