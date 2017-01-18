/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lotto;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alex-ks53
 */
public class TicketHandler {
    private int[] numbers=new int[6];
    private int strongNumber;
    public TicketHandler() {
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Lotto 6 numbers : ");

        for (i = 0; i < 6; i++) {
            System.out.print((i + 1) + ")  ");
            this.numbers[i] = input.nextInt();
            System.out.println("");
        }
        System.out.println("Enter strong number : ");
        this.strongNumber = input.nextInt();
    }
    
    public int[] getNumbers() {
        return numbers;
    }

    public int getStrongNumber() {
        return strongNumber;
    }
    
    
        @Override
    public String toString() {
        return "My Ticket :"+ Arrays.toString(numbers) + "[" + strongNumber + "]";
    }

}
