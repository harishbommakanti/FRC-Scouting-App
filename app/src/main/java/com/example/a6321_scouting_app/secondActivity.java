package com.example.a6321_scouting_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class secondActivity extends AppCompatActivity
{
    public ArrayList<String> seasonList = new ArrayList<String>();
    //private static final String TOTAL_COUNT = "total_count";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void makeNewSeason(View view)
    {
        Intent nextPage = new Intent(this, newSeasonSetup.class);
        startActivity(nextPage);
        //nextPage.putExtra("seasonList",seasonList);
    }

    /*
    public void showRandomNumber()
    {
        TextView randomView = (TextView)findViewById(R.id.textview_random);
        TextView headingView = (TextView)findViewById(R.id.textview_heading);
        int count = getIntent().getIntExtra(TOTAL_COUNT,0);
        Random random = new Random();
        int randomInt = 0;
        if (count>0)
            randomInt = random.nextInt(count);

        randomView.setText(Integer.toString(randomInt));
        headingView.setText(getString(R.string.random_heading,count));
    } */
}