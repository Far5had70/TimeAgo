package com.waspar.timeago;

import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeAgo {
    private static final String TAG = "TimeAgo";
    public static String Convert(String Time){

        Calendar calander, c;
        calander = Calendar.getInstance();
        String Convert = null;
        Date now_time = null, pre_time;
        long diff, diffSeconds=0, diffMinutes=0, diffHours =0, diffDays = 0;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        c = Calendar.getInstance();
        String currenttime = sdf.format(calander.getTime());
        Log.e("DATE", "" + currenttime);

        try {
            now_time = sdf.parse(currenttime);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        try {
            c.setTime(sdf.parse(Time));
            pre_time = sdf.parse(Time);
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
                Convert = diffDays + " روز پیش";
            } else {
                Convert = diffDays + " روز پیش";
            }
        } else {
            if (diffHours > 0) {
                if (diffHours == 1) {
                    Convert = diffHours + " ساعت پیش";
                } else {
                    Convert = diffHours + " ساعت پیش";
                }
            } else {
                if (diffMinutes > 0) {
                    if (diffMinutes == 1) {
                        Convert = diffMinutes + " دقیقه پیش";
                    } else {
                        Convert = diffMinutes + " دقیقه پیش";
                    }
                } else {
                    if (diffSeconds > 0) {
                        Convert = diffSeconds + " ثانیه پیش";
                    }
                }

            }

        }

        return Convert;

    }
}
