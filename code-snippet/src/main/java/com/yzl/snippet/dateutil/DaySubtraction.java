package com.yzl.snippet.dateutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DaySubtraction {


    public static void main(String[] args) throws ParseException {

        String startTime = "2019-10-15 00:00:00";
        String  endTime="2019-10-18 22:00:00";

        SimpleDateFormat formatter =   new SimpleDateFormat( "yyyy-MM-dd");
        Date date = formatter.parse(startTime);
        long ts = date.getTime();
        Date date1 =  formatter.parse(endTime);
        long ts1 = date1.getTime();

        long l = caculateTotalDay(ts,ts1);
        System.out.println(l+1);

    }


    /**
     * 计算时间
     * @param startTime ： 开始时间
     * @param endTime  ： 结束时间
     * @return
     */
    public static int caculateTotalTime(String startTime,String endTime) {
        SimpleDateFormat formatter =   new SimpleDateFormat( "yyyy-MM-dd");
        Date date1=null;
        Date date = null;
        Long l = 0L;
        try {
            date = formatter.parse(startTime);
            long ts = date.getTime();
            date1 =  formatter.parse(endTime);
            long ts1 = date1.getTime();

            l = (ts - ts1) / (1000 * 60 * 60 * 24);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return l.intValue();
    }

    /**
     * 计算时间
     * @param startTime ： 开始时间
     * @param endTime  ： 结束时间
     * @return
     */
    public static long caculateTotalDay(long ts,long ts1) {

        long  l = (ts1 - ts) / (1000 * 60 * 60 * 24);
        return l;
    }


}
