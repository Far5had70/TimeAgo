package com.waspar.timeago;

import android.annotation.SuppressLint;
import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeAgo {
    private static final String TAG = "TimeAgo";
    private static String SecondText = " ثانیه پیش";
    private static String MinuteText = " دقیقه پیش";
    private static String HourText = " ساعت پیش";
    private static String DayText = " روز پیش";

    public static void changeTextDay(String DayText){
        TimeAgo.DayText = " "+DayText;
    }
    public static void changeTextHour(String HourText){
        TimeAgo.HourText = " "+HourText;
    }
    public static void changeTextMinute(String MinuteText){
        TimeAgo.MinuteText = " "+MinuteText;
    }
    public static void changeTextSecond(String SecondText){
        TimeAgo.SecondText = " "+SecondText;
    }

    public static String Convert(int Year , int Month , int Day , int Hour , int Minute , int Second){

        String Month_final;
        String Day_final;
        String Hour_final;
        String Minute_final;
        String Second_final;

        if (Month <10){
            Month_final = "0"+String.valueOf(Month);
        }else {
            Month_final = String.valueOf(Month);
        }
        if (Day <10){
            Day_final = "0"+String.valueOf(Day);
        }else {
            Day_final = String.valueOf(Day);
        }
        if (Hour <10){
            Hour_final = "0"+String.valueOf(Hour);
        }else {
            Hour_final = String.valueOf(Hour);
        }
        if (Minute <10){
            Minute_final = "0"+String.valueOf(Minute);
        }else {
            Minute_final = String.valueOf(Minute);
        }
        if (Second <10){
            Second_final = "0"+String.valueOf(Second);
        }else {
            Second_final = String.valueOf(Second);
        }
        String Time = Year+"-"+Month+"-"+Day+"T"+Hour+":"+Minute+":"+Second;

        Calendar InputCalander, NowCalendar;
        InputCalander = Calendar.getInstance();
        String Convert = null;
        Date now_time = null, pre_time;
        long diff, diffSeconds=0, diffMinutes=0, diffHours =0, diffDays = 0;


        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        NowCalendar = Calendar.getInstance();
        String currenttime = simpleDateFormat.format(InputCalander.getTime());

        try {
            now_time = simpleDateFormat.parse(currenttime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            NowCalendar.setTime(simpleDateFormat.parse(Time));
            pre_time = simpleDateFormat.parse(Time);
            diff = now_time.getTime() - pre_time.getTime();
            diffSeconds = diff / 1000;
            diffMinutes = diff / (60 * 1000) % 60;
            diffHours = diff / (60 * 60 * 1000) % 24;
            diffDays = diff / (24 * 60 * 60 * 1000);


        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (diffDays > 0) {
            if (diffDays == 1) {
                Convert = diffDays + DayText;
            } else {
                Convert = diffDays + DayText;
            }
        } else {
            if (diffHours > 0) {
                if (diffHours == 1) {
                    Convert = diffHours + HourText;
                } else {
                    Convert = diffHours + HourText;
                }
            } else {
                if (diffMinutes > 0) {
                    if (diffMinutes == 1) {
                        Convert = diffMinutes + MinuteText;
                    } else {
                        Convert = diffMinutes + MinuteText;
                    }
                } else {
                    if (diffSeconds > 0) {
                        Convert = diffSeconds + SecondText;
                    }
                }
            }
        }
        return Convert;
    }

    public static String ConvertWithPattern(String Time , String Pattern){

        Calendar InputCalander, NowCalendar;
        InputCalander = Calendar.getInstance();
        String Convert = null;
        Date now_time = null, pre_time;
        long diff, diffSeconds=0, diffMinutes=0, diffHours =0, diffDays = 0;


        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Pattern);
        NowCalendar = Calendar.getInstance();
        String currenttime = simpleDateFormat.format(InputCalander.getTime());

        try {
            now_time = simpleDateFormat.parse(currenttime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            NowCalendar.setTime(simpleDateFormat.parse(Time));
            pre_time = simpleDateFormat.parse(Time);
            diff = now_time.getTime() - pre_time.getTime();
            diffSeconds = diff / 1000;
            diffMinutes = diff / (60 * 1000) % 60;
            diffHours = diff / (60 * 60 * 1000) % 24;
            diffDays = diff / (24 * 60 * 60 * 1000);


        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (diffDays > 0) {
            if (diffDays == 1) {
                Convert = diffDays + DayText;
            } else {
                Convert = diffDays + DayText;
            }
        } else {
            if (diffHours > 0) {
                if (diffHours == 1) {
                    Convert = diffHours + HourText;
                } else {
                    Convert = diffHours + HourText;
                }
            } else {
                if (diffMinutes > 0) {
                    if (diffMinutes == 1) {
                        Convert = diffMinutes + MinuteText;
                    } else {
                        Convert = diffMinutes + MinuteText;
                    }
                } else {
                    if (diffSeconds > 0) {
                        Convert = diffSeconds + SecondText;
                    }
                }
            }
        }
        return Convert;
    }

    public static String ConvertWithSimpleDateFormat(String Time , SimpleDateFormat simpleDateFormat){

        Calendar InputCalander, NowCalendar = null;
        InputCalander = Calendar.getInstance();
        String Convert = null;
        Date now_time = null, pre_time;
        long diff, diffSeconds=0, diffMinutes=0, diffHours =0, diffDays = 0;

        String currenttime = null;
        try {
            NowCalendar = Calendar.getInstance();
            currenttime = simpleDateFormat.format(InputCalander.getTime());
        }catch (Exception e){
            Log.e(TAG, "ConvertWithSimpleDateFormat: "+e );
        }


        try {
            now_time = simpleDateFormat.parse(currenttime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            NowCalendar.setTime(simpleDateFormat.parse(Time));
            pre_time = simpleDateFormat.parse(Time);
            diff = now_time.getTime() - pre_time.getTime();
            diffSeconds = diff / 1000;
            diffMinutes = diff / (60 * 1000) % 60;
            diffHours = diff / (60 * 60 * 1000) % 24;
            diffDays = diff / (24 * 60 * 60 * 1000);


        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (diffDays > 0) {
            if (diffDays == 1) {
                Convert = diffDays + DayText;
            } else {
                Convert = diffDays + DayText;
            }
        } else {
            if (diffHours > 0) {
                if (diffHours == 1) {
                    Convert = diffHours + HourText;
                } else {
                    Convert = diffHours + HourText;
                }
            } else {
                if (diffMinutes > 0) {
                    if (diffMinutes == 1) {
                        Convert = diffMinutes + MinuteText;
                    } else {
                        Convert = diffMinutes + MinuteText;
                    }
                } else {
                    if (diffSeconds > 0) {
                        Convert = diffSeconds + SecondText;
                    }
                }
            }
        }
        return Convert;
    }
}
