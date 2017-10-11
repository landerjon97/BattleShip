package com.example.jonlander.battleship;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setting a listener up for the button to go to new activity
        (findViewById(R.id.start)).setOnClickListener(this);
        (findViewById(R.id.credits)).setOnClickListener(this);

    }
    public void onClick(View v){
        //when the start button is pressed go to different activity (switch statement)
        switch(v.getId()){
            case R.id.start:
                Intent gameIntent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(gameIntent);
                break;
            case R.id.credits:
                Intent creditIntent = new Intent(MainActivity.this, CreditActivity.class);
                startActivity(creditIntent);
        }
    }
}
