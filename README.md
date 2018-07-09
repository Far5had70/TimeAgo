# TimeAgo
Easily change DateTime to TimeAgo through this library

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:


	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
Step 2. Add the dependency


	dependencies {
	        implementation 'com.github.Far5had70:TimeAgo:1.0.1'
	}
  
way 1:
  
  
        Log.e(TAG, "onCreate: " + TimeAgo.Convert(2018, 7, 6, 21, 30, 0));


way2:


        Log.e(TAG, "onCreate: " + TimeAgo.ConvertWithPattern("2018-07-06T21:30:00", "yyyy-MM-dd'T'HH:mm:ss"));


way 3:


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Log.e(TAG, "onCreate: " + TimeAgo.ConvertWithSimpleDateFormat("2018-07-06T21:30:00", simpleDateFormat));


Change Text:


        TimeAgo.changeTextDay("Day ago"); // 3 Day Ago
        TimeAgo.changeTextHour("Hour ago"); // 2 Hour Ago
        TimeAgo.changeTextMinute("Minute ago"); // 3 Minute Ago
        TimeAgo.changeTextSecond("Second ago");  // 55 Second Ago
        Log.e(TAG, "onCreate: " + TimeAgo.Convert(2018, 7, 6, 21, 30, 0));


Full Code:


        //way 1
        Log.e(TAG, "onCreate: " + TimeAgo.Convert(2018, 7, 6, 21, 30, 0));

        //way2
        Log.e(TAG, "onCreate: " + TimeAgo.ConvertWithPattern("2018-07-06T21:30:00", "yyyy-MM-dd'T'HH:mm:ss"));

        //way 3
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Log.e(TAG, "onCreate: " + TimeAgo.ConvertWithSimpleDateFormat("2018-07-06T21:30:00", simpleDateFormat));

        //Change Text
        TimeAgo.changeTextDay("Day ago"); // 3 Day Ago
        TimeAgo.changeTextHour("Hour ago"); // 2 Hour Ago
        TimeAgo.changeTextMinute("Minute ago"); // 3 Minute Ago
        TimeAgo.changeTextSecond("Second ago");  // 55 Second Ago
        Log.e(TAG, "onCreate: " + TimeAgo.Convert(2018, 7, 6, 21, 30, 0));
        
        


