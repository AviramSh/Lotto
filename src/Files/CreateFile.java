/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

import java.util.Formatter;

/**
 *
 * @author AVIRAM
 */
public class CreateFile {
    
    private Formatter myFile;
    private String fileName;
    
    public CreateFile(String fileName){
        this.fileName =fileName;
    }
    
    public void openfile(){
        
        try {
            myFile = new Formatter(fileName+".text");
            System.out.println("File have been created.");
            
        } catch (Exception e) {
            System.out.println("Create file faild");
        }
        
    }
    public void addRecords(String date ,String numbers){
        myFile.format(date, numbers);
    }
    
    public void closeFile(){
        myFile.close();
    }
}
