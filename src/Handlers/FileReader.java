/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
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
    Scanner scanner;
    String temp;

    public FileReader(String file_name) throws FileNotFoundException {

//        "/Users/pankaj/abc.csv"

        scanner = new Scanner(new File(file_name));
        temp = new String();
        rows = new ArrayList<>();
        rowsList = new ArrayList<>();
    }
    
    public boolean read(){
        
        scanner.useDelimiter(",");
        String temp = "";
        int[] row = new int[7];
        
        for (int i = 0,j = 0; scanner.hasNext();j++, i++) {
            
            temp = scanner.next();
            
            System.out.print("("+i+")"+temp+"\t");
            
            
            if(i>1&&i<9){
                rowsList.add(Integer.parseInt(temp));
            }else if(i == 10){
                i=0;
            }

        }
        scanner.close();
        
        
        System.out.println("\n******************");

        for (int i = 0,j=0; i < rowsList.size(); i++,j++) {
            if(j == 7){
                System.out.println("");
                j=0;
            }
            System.out.print(" "+rowsList.get(i));
        }
        
        
        return true;
    }

        
//    public boolean read(){
//        
//        scanner.useDelimiter(",");
//        
//        while (scanner.hasNext()) {
//            
//            temp = scanner.next();
//            System.out.println(temp + " ");
//            
//        }
//        
//        scanner.close();
//        
//        return true;
//    }
    

}
