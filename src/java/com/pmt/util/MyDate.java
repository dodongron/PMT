/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmt.util;

;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ronald
 */


public class MyDate {

    public static String jan_1_2014_to_2014_01_01(String date) {
        try {
            SimpleDateFormat sf = new SimpleDateFormat("MMMMMMMMMM dd, yyyy");
            SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sf.parse(date);
            date = sf2.format(d);
            return date;
        } catch (ParseException ex) {
            return "";
        }
    }

    public static String yyyy_mm_dd_to_slash(String date) {
        try {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sf2 = new SimpleDateFormat("MM/dd/yyyy");
            Date d = sf.parse(date);
            date = sf2.format(d);
            return date;
        } catch (ParseException ex) {
            return "";
        }
    }

    public static String yyyy_mm_dd_to_MMMMMM_dd_yyy(String date) {
        try {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sf2 = new SimpleDateFormat("MMMMMMMMMMM dd, yyyy");
            Date d = sf.parse(date);
            date = sf2.format(d);
            return date;
        } catch (ParseException ex) {
            return "";
        }
    }

    public static String datetime_to_time(String date) {
        try {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sf2 = new SimpleDateFormat("MMMMMMMMMMM dd, yyyy");
            Date d = DateType.datetime.parse(date);
            date = DateType.day_and_time.format(d);
            return date;
        } catch (ParseException ex) {
            return "";
        }
    }

    public static String date_to_yyyy_mm_dd(Date d) {
        SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
        String date = sf2.format(d);
        return date;
    }

    public static String report_date(Date from, Date to) {
        SimpleDateFormat sf2 = new SimpleDateFormat("MM/dd/yyyy");
        String date = "Date:[" + sf2.format(from) + "] - [" + sf2.format(to) + "]";
        return date;
    }

    public static String now() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date = sf.format(new Date());
        return date;
    }

    public static String date_to_string(Date Date) {
        String date = DateType.sf.format(Date);

        return date;
    }

    public static String datetime_to_yyyy_(Date Date) {
        String date = DateType.sf.format(Date);

        return date;
    }

    public static String now_sf() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sf.format(new Date());
        return date;
    }

    public static String parse_to_datetime(String date, String format) {
        SimpleDateFormat sf = new SimpleDateFormat(format);
        Date d;
        try {
            d = DateType.slash3.parse(date);
            date = DateType.datetime.format(d);
        } catch (ParseException ex) {
            Logger.getLogger(MyDate.class.getName()).log(Level.SEVERE, null, ex);
        }

        return date;
    }
    public static String parse_to_time(String datetime){
        try {
            Date d=DateType.datetime.parse(datetime);
            datetime=DateType.time3.format(d);
        } catch (ParseException ex) {
            Logger.getLogger(MyDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datetime;
    }
     public static String parse_to_time2(String datetime){
        try {
            Date d=DateType.datetime.parse(datetime);
            datetime=DateType.time4.format(d);
        } catch (ParseException ex) {
            Logger.getLogger(MyDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datetime;
    }
     public static String parse_to_time3(String datetime){
        try {
            Date d=DateType.datetime.parse(datetime);
            datetime=DateType.slash4.format(d);
        } catch (ParseException ex) {
            Logger.getLogger(MyDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datetime;
    }
}
