package com.github.wellsoft.RNImmediateQuickzap;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RNImmediateQuickzapModule extends ReactContextBaseJavaModule {

    ReactApplicationContext reactContext;
    AlarmManager alarmManager;

    public RNImmediateQuickzapModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
        alarmManager = (AlarmManager) reactContext.getSystemService(Context.ALARM_SERVICE);
    }

    @Override
    public String getName() {
        return "RNImmediateQuickzap";
    }

    @ReactMethod
    public void immediateQuickzap(String number) {
        number = Uri.encode(number);
        String url = "tel:" + number;
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(url));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.reactContext.startActivity(intent);
    }
}
