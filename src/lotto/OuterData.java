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
    
    public void UpdateLastYearData() throws IOException{
        List<String> lines = new ArrayList<>();
        
        for (String line : Files.readAllLines(Paths.get(allYearsFileName), StandardCharsets.UTF_8)) {
            if (line.contains("2016")||line.contains("2017")) {
                Integer.parseInt(line.toString());
                lines.add(line);
            }
        }
        Files.write(Paths.get(pastYearFileName), lines, StandardCharsets.UTF_8);  
    } 
}
