/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

import com.sun.prism.impl.Disposer;
import java.io.*;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AVIRAM
 */
public class FileHandler {

    private String fileName;
    private Scanner reader;
    private Formatter myFile;
    
    public FileHandler(String filename) {
        this.fileName=filename;
        exist();
    }

    public void exist() {

        File record = new File(fileName);
        Scanner input = new Scanner(System.in);

        if (record.exists()) {
            System.out.println("File \"" + record.getName() + "\" exists.");
        } else {
            String choice = "";
            do {
                System.out.println("File \"" + record.getName() + "\"dose not exists.");
                System.out.println("Do you whant to creat?(Y/N)");
                choice = input.nextLine();

            } while (!choice.equals("y") && !choice.equals("Y") && !choice.equals("N") && !choice.equals("n"));

            if (choice.equals("Y") || choice.equals("y")) {
                createFile();
                System.out.println("File have been created");
            } else {/*Dont create file*/
                System.out.println("File wasn't created");
            }
        }

    }
      
    public void createFile(){
        /*If file dose not exsit it will be created.*/
        try {
            myFile = new Formatter(fileName);
            System.out.println("File have been created.");

        } catch (Exception e) {
            System.out.println("Create file faild");
        }
    }
    
    public void openfile(String fileName) {
        
    }
    
    public void readRecords() {

        try {
            reader = new Scanner(new File(FileConstant.fileMame));
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist");
            Logger.getLogger(FileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (reader.hasNext()) {
            System.out.println("Date " + reader.next() + " Numbers" + reader.next());
        }

        reader.close();
    }

    public void addRecords(String date, String numbers) {
        myFile.format("%s%s", date, numbers);
    }

    public void closeFile() {
        myFile.close();
    }
}
