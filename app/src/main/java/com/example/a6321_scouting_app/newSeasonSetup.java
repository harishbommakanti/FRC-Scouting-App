package com.example.a6321_scouting_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class newSeasonSetup extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_season_setup);
    }

    public void addSeasonName(View view)
    {
        //adding new season name to season name arraylist
        TextView inputBox = (TextView)findViewById(R.id.newSeasonName);
        String newSeasonName = inputBox.getText().toString();
        inputBox.setCursorVisible(false);
        //Intent intent = getIntent();
        //if (newSeasonName != null)
        //    intent.getStringArrayListExtra("seasonList").add(newSeasonName);

        TextView isNameAdded = (TextView)findViewById(R.id.seasonCreatedText);
        isNameAdded.setText("Season \'" + newSeasonName + "\' created!");

        TextView introToSetupBox = (TextView)findViewById(R.id.textView2);
        introToSetupBox.setVisibility(View.VISIBLE);

        Button goToSeasonSetup = (Button)findViewById(R.id.goToSeasonInitButton);
        goToSeasonSetup.setVisibility(View.VISIBLE);
    }
}
