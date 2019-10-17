package com.yzl.snippet.dateutil;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddHours {


    public static void main(String[] args){

        Date date = new Date();
        String time = addHours(date,2);
        System.out.println(time);
    }


    /**
     * 增加小时
     */
    public static String addHours(Date date,int hours) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, hours);// 24小时制
        date = cal.getTime();
        cal = null;
        return format.format(date);
    }
}
