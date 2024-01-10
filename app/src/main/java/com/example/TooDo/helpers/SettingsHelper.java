package com.example.TooDo.helpers;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.TooDo.R;
public class SettingsHelper {

    //apply theme for toolbar
    public static void applyThemeToolbar(Toolbar toolbar, Context context){
        SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences(context);
        String themeName=sharedPreferences.getString("app_theme","Default");
        if(themeName.equals("Default")){
            toolbar.setBackgroundColor(context.getResources().getColor(R.color.colorPrimaryViolete));
        }
    }

    //apply theme for text views
    public static void applyThemeTextView(TextView textView,Context context){
        SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences(context);
        String themeName=sharedPreferences.getString("app_theme","Default");
        if(themeName.equals("Default")){
            textView.setBackgroundColor(context.getResources().getColor(R.color.colorPrimaryViolete));
        }
    }

    //apply text color for text views
    public static void applyTextColor(TextView textView,Context context){
        SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences(context);
        String themeName=sharedPreferences.getString("app_theme","Default");
        if(themeName.equals("Default")){
            textView.setTextColor(context.getResources().getColor(R.color.colorPrimaryViolete));
        }
    }

    //apply theme
    public static void applyTheme(Context context){
        SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences(context);
        String themeName=sharedPreferences.getString("app_theme","Default");
        if(themeName.equals("Default")){
            context.setTheme(R.style.VioleteTheme);
        }
    }
}
