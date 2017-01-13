/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto;

/**
 *
 * @author alex-ks53
 */
public class Number {
    private int number;
    private int appearancesCounter;
    
   public Number(){}
   
    public int GetNumber(){
        return this.number;
    }
    
    public void SetNumber(int number){
        this.number=number;
    }
    
    public int GetAppearancesCounter(){
        return this.appearancesCounter;
    }
    
    public void SetAppearancesCounter(int appearancesCounter){
        this.appearancesCounter=appearancesCounter;
    }
}
