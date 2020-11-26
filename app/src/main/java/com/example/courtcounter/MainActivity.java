package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    int totalForTeamA=0;
    int totalForTeamB=0;
   // void points_counter(View view)
   // {
   //     getDisplay(points);
   // }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void plusThreeForTeamA(View view)
    {
        totalForTeamA+=3;
        displayForTeamA(totalForTeamA);
    }
    public void plusThreeForTeamB(View view)
    {
        totalForTeamB+=3;
        displayForTeamB(totalForTeamB);
    }
    public void plusTwoForTeamA(View view)
    {
        totalForTeamA+=2;
        displayForTeamA(totalForTeamA);
    }
    public void plusTwoForTeamB(View view)
    {
        totalForTeamB+=2;
        displayForTeamB(totalForTeamB);
    }
    public void plusFreeThrowForTeamA(View view)
    {
        totalForTeamA+=1;
        displayForTeamA(totalForTeamA);
    }
    public void plusFreeThrowForTeamB(View view)
    {
        totalForTeamB+=1;
        displayForTeamB(totalForTeamB);
    }
    public void reset(View view)
    {
        totalForTeamA=0;
        totalForTeamB   =0;
        displayForTeamA(totalForTeamA);
        displayForTeamB(totalForTeamB);
    }
}