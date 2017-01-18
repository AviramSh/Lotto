/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alex-ks53
 */
public class OuterData {
    final String allYearsFileName="C:\\Users\\alex-ks53\\Desktop\\Lotto\\src\\Files\\AllYearsResults.txt";
    final String pastYearFileName="C:\\Users\\alex-ks53\\Desktop\\Lotto\\src\\Files\\PastYearResults.txt";
    String[] lastYearCommonResults = null;
    String[] lastYearLeastResults = null;
    String[] mainNumbersOnly=null;
    public void UpdateLastYearData() throws IOException{
        List<String> lines = new ArrayList<>();
        int i=0;
        int j=0;
        
        for (String line : Files.readAllLines(Paths.get(allYearsFileName), StandardCharsets.UTF_8)) {
            if (line.contains("2016")||line.contains("2017")) {
                lines.add(line);
                //System.out.println(line.toString());
                lastYearCommonResults=line.split(" ");
                i= lastYearCommonResults.length;
                j=0;
                System.out.println(i);
//                System.out.print(" START "+lastYearCommonResults[2]+"  ");
//                System.out.print(lastYearCommonResults[3]+"  ");
//                System.out.print(lastYearCommonResults[4]+"  ");
//                System.out.print(lastYearCommonResults[5]+"  ");
//                System.out.print(lastYearCommonResults[6]+"  ");
//                System.out.print(lastYearCommonResults[7]+"  END ");
                while(i>j)
                {
                    System.out.print(lastYearCommonResults[j]);
                j++;
                }
            }
        }
        Files.write(Paths.get(pastYearFileName), lines, StandardCharsets.UTF_8);  
    }
}
