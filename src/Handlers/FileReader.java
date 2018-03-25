/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

//import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aviram
 */
public class FileReader {
    
//    private static final String fileName = "C:\\Users\\Aviram\\Desktop\\Lotto.csv";
    ArrayList<Integer> rows;
    ArrayList<Integer> rowsList;
    
    ArrayList<Integer> row = new ArrayList<>();
    ArrayList<ArrayList<Integer>> rowsList1 = new ArrayList<>();
    
    Scanner scanner;
    String temp;

    public FileReader(String file_name) throws FileNotFoundException {

//        "/Users/pankaj/abc.csv"

        scanner = new Scanner(new File(file_name));
        temp = new String();
//        rows = new ArrayList<>();
        rowsList = new ArrayList<>();
        
    }
    
    public boolean read(){
        
        scanner.useDelimiter(",");

        for (int i = 0,j = 0; scanner.hasNext();j++, i++) {
            
            temp = scanner.next();
            
            System.out.print("("+i+")"+temp+"\t");
            
            
            if(i>1&&i<9){
                row.add(Integer.parseInt(temp));
            }else if(i == 10){
                i=0;
                rowsList1.add(row);
                row = new ArrayList<>();
            }

        }
        scanner.close();
        

        
        System.out.println("\n******************");


        
        for (ArrayList<Integer> myRow : rowsList1) {
            for (Integer rowNumbers : myRow) {
                System.out.print(" "+rowNumbers);
            }
            System.out.println("");
        }
        calc();
        return true;
    }
    
    public String calc(){
//        ArrayList<Integer> oddList = new ArrayList<>();
        int[] numbersAverage = new int[38];
        int odd = 0;
        int even = 0;
        int powerOdd = 0;
        int powerEven = 0;
        
        for (ArrayList<Integer> myRow : rowsList1) {
            
            for (int i = 0; i < myRow.size(); i++) {
                if(myRow.get(i)%2!=0    &&  i!=6){
                    odd++;
                }else if(myRow.get(i)%2==0    &&  i!=6){
                    even++;
                }else if(myRow.get(i)%2!=0    &&  i==6){
                    powerOdd++;
                }else if(myRow.get(i)%2==0    &&  i==6){
                    powerEven++;
                }
            }
            
        }
        System.out.println(" The average of Odd numbers is : "+(double)odd / rowsList1.size());
        System.out.println(" The average of Even numbers is : "+(double)even / rowsList1.size());
        System.out.println(" The average of odd Power numbers is : "+(double)powerOdd/rowsList1.size());
        System.out.println(" The average of odd Power numbers is : "+(double)powerEven/rowsList1.size());
        
        return "";
    }
    

}
