/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Aviram
 */
public class FileReader {
    
//    private static final String fileName = "C:\\Users\\Aviram\\Desktop\\Lotto.csv";
    Scanner scanner;

    public FileReader(String file_name) throws FileNotFoundException {

//        "/Users/pankaj/abc.csv"

        scanner = new Scanner(new File(file_name));
        
    }
    
    public boolean read(){
        
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            System.out.print(scanner.next() + "|");
        }
        scanner.close();
        
        return true;
    }

}
