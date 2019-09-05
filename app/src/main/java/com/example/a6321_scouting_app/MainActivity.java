package com.example.a6321_scouting_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    //private static final String TOTAL_COUNT = "total_count";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toSelectSeason(View view)
    {
        Intent randomIntent = new Intent(this, secondActivity.class);
        startActivity(randomIntent);
    }

    /*public void randomMe(View view)
    {
        Intent randomIntent = new Intent(this, secondActivity.class);
        TextView showCountTextView = (TextView)findViewById(R.id.textView2);
        String countString = showCountTextView.getText().toString();
        int count = Integer.parseInt(countString);
        randomIntent.putExtra(TOTAL_COUNT,count);
        startActivity(randomIntent);
    }/*

    /*public void toastMe(View view)
    {
        Toast myToast = Toast.makeText(this, "hello Toast!",
                Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe(View view)
    {
        TextView showCountTextView = (TextView)findViewById(R.id.textView2);
        String countString = showCountTextView.getText().toString();
        Integer count = Integer.parseInt(countString);
        count++;
        showCountTextView.setText(count.toString());
    }
*/
}