/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

import java.io.*;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AVIRAM
 */
public class CreateFile {
    
    private Scanner reader;
    private Formatter myFile;
    private String fileName;
    
    public CreateFile(String fileName){
        this.fileName =fileName;
    }
    
    public void openfile(){
        
            fileName+=".txt";
        try {
            myFile = new Formatter(fileName);
            System.out.println("File have been created.");
            
        } catch (Exception e) {
            System.out.println("Create file faild");
        }
        
    }
    public void addRecords(String date ,String numbers){
        myFile.format("%s%s",date, numbers);
    }
    
    public void readRecords(){
        
        try {
            reader = new Scanner(new File(fileName));
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist");
            Logger.getLogger(CreateFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while (reader.hasNext()) {
            System.out.println("Date "+reader.next()+" Numbers"+reader.next());
        }
        
        reader.close();
    }
    
    
    public void closeFile(){
        myFile.close();
    }
}
