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
public class Row {
    private int[] number=new int[6];
    private int strongNumber;

    public int[] getNumber() {
        return number;
    }

    public void setNumber(int[] number) {
        this.number = number;
    }

    public int getStrongNumber() {
        return strongNumber;
    }

    public void setStrongNumber(int strongNumber) {
        this.strongNumber = strongNumber;
    }
}
