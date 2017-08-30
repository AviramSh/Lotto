/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utill;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Aviram
 */
public class DateUtill {
    Calendar myCal;
    public static final String dateFormat = "dd/mm/yyyy";

    public DateUtill() {
        myCal = Calendar.getInstance();
    }
    
    
    public static Calendar convertStringToCalender(String strToConvert) throws ParseException{
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);

        c.setTime(sdf.parse(strToConvert));
        
        return c;
    }
}
