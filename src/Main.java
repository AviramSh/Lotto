
import Handlers.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aviram
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
//        FileReader r = new FileReader("C:\\Users\\Aviram\\Desktop\\Lotto.csv");
//        if(r.read())
//            System.out.println("Goood");
//        else System.out.println("Bad");

        int i =0;
        
        try (Scanner scanner = new Scanner(new File("C:\\Users\\Aviram\\Desktop\\Lotto.csv"))) {
            scanner.useDelimiter(",");
            
            while(scanner.hasNext()){
                i++;
                System.out.print(scanner.next()+"|");
            }
            System.out.println("File is good");
        }catch(FileNotFoundException e){
            System.out.println("File empty");
        }
    }
        
    
}
