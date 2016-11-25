package com.ashokslsk.shortcuts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String mUsername;

    private TextView mUser;

    private static final int age = 86;

    public static final String UserAge = "";

    private static final String TAG = "MainActivity";

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUser = (TextView) findViewById(R.id.username);

        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]");

        Log.d(TAG, "onCreate() returned: ");


        //Shortcut #1
        /*
        * Look up IDE Commands
        *
        * Mac OS
        * cmd + shift + a
        *
        * Linux/Win
        * Ctrl + Shift + A
        *
        * */


        //Shortcut #2
        /*
        * Open Class
        *
        * Mac OS
        * Cmd + O
        *
        * Linux/Win
        * Ctrl + O
        *
        */

        //Shortcut #3
        /*
        * Open Class
        *
        * Mac OS
        * Cmd + Shift + O
        *
        * Linux/Win
        * Ctrl + Shift + O
        *
        */

        //Shortcut #4
        /*
        * Open recently edited file
        *
        * Mac OS
        * Cmd + Shift + E
        *
        * Linux/Win
        * Ctrl + Shift + E
        *
        */

        //Shortcut #5
        /*
        * Open recently Used file
        *
        * Mac OS
        * Cmd + E
        *
        * Linux/Win
        * Ctrl + E
        *
        */

        //Shortcut #6
        /*
        * Last Edited Location
        *
        * Mac OS
        * Cmd + Shift + Backspace
        *
        * Linux/Win
        * Ctrl + Shift + Backspace
        *
        */

        //Shortcut #7
        /*
        * Format the code with proper Indentation
        *
        * Mac OS
        * Cmd + Opt + L
        *
        * Linux/Win
        * Ctrl + Alt + L
        *
        */


        //Shortcut #8
        /*
        * Surround With
        *
        * Mac OS
        * Opt + Cmd + T
        *
        * Linux/Win
        * Alt + Ctrl + T
        *
        */


        try {
            surroundwith();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Shortcut #9
        /*
        * Generate Setter/Getters/
        *
        * Mac OS
        * Cmd + N
        *
        * Linux/Win
        * Alt + Ins
        *
        */

        //Shortcut #10
        /*
        * Search Everywhere
        *
        * Mac OS
        * Shift + Shift
        *
        * Linux/Win
        * Shift + Shift
        *
        */

        //Live Templates in Android Studio

        Toast.makeText(MainActivity.this, "Hellow World", Toast.LENGTH_SHORT).show();


    }

    private void surroundwith() {

        System.out.println("MainActivity.surroundwith");
        System.out.println("");
        System.out.println("mUsername = " + mUsername);
        

    }

}
