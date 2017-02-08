/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author AVIRAM
 */
public class ExpectedNumbers {
    
    Random rand = new Random();
    List<int[]> predictingNumbers = new ArrayList<int[]>();
    /*lotteryStock - */
    List<int[]> lotteryStock = new ArrayList<int[]>();
    
    public ExpectedNumbers() {

/*this metod need to generate all data from the previous lotteries from the database */
        generateStok(lotteryStock);
        
        
        printNumbers(lotteryStock);
        calc(lotteryStock);
    }
    
    private void calc(List<int[]> lotteryStock) {
        int []temp =new int[38];
        
/*Count how many times the number appears until today*/
        for (int[] index : lotteryStock) {
            for (int i = 0; i < index.length; i++) {
                ++temp[index[i]];
            }
        }
        System.out.println("The amount of the appearance of the numbers!");
        
        for (int i = 1; i < temp.length; i++) {
           System.out.println((i)+") "+temp[i]+"  ");          
        }
    }

    private void printNumbers(List<int[]> lotteryStock) {
        
        for (int[] index : lotteryStock) {
            for (int i = 0; i < index.length; i++) {
                System.out.print(index[i]+" ");
            }
            System.out.println("");
        }
    }

    //this function spost to generate number from the Tickit stok/database
    private void generateStok(List<int[]> lotteryStock) {
        
        for (int i = 0; i < 5; i++) {
            int []temp=new int[7];
            for (int j = 0; j < 7; j++) {
                
                if (j!=6) {
                    temp[j]=rand.nextInt(37)+1;
                } else {
                    temp[j]=rand.nextInt(7)+1;
                }
                
            }
            lotteryStock.add(temp);
        }
    }
}