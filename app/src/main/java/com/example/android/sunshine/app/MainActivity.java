package com.example.android.sunshine.app;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.container, new ForecastFragment())
//                    .commit();
     //   }
    }
    public int numberOfPoints1 = 0;
    public int numberOfPoints2 = 0;
    public void add21(View view){
        numberOfPoints1 += 2;

        displayScore1(numberOfPoints1);
    }
    public void add11(View view){
        numberOfPoints1 += 1;
        displayScore1(numberOfPoints1);
    }
    public void minus11(View v) {
        numberOfPoints1 -= 1;
        displayScore1(numberOfPoints1);
    }


    public void displayScore1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_text_view1);
        quantityTextView.setText("" + number);
    }
    public void add22(View view){
        numberOfPoints2 += 2;

        displayScore2(numberOfPoints2);
    }
    public void add12(View view){
        numberOfPoints2 += 1;
        displayScore2(numberOfPoints2);
    }
    public void minus12(View v) {
        numberOfPoints2 -= 1;
        displayScore2(numberOfPoints2);
    }


    public void displayScore2(int number){
        TextView quantityTextView = (TextView) findViewById(R.id.score_text_view2);
        quantityTextView.setText("" + number);
    }
    public void reset(View v) {
        displayScore1(0);
        displayScore2(0);
        numberOfPoints1 = 0;
        numberOfPoints2 = 0;
    }
    //@Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

    //@Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}

    /**
     * A placeholder fragment containing a simple view.
     */
