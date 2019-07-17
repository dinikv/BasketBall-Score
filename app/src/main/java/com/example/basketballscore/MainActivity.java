package com.example.basketballscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int totalScore_a = 0;
    int totalScore_b = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void threePoints(View view){
        totalScore_a += 3;
        displayForTeamA(totalScore_a);
    }
    public void twoPoints(View view){
        totalScore_a += 2;
        displayForTeamA(totalScore_a);
    }
    public void onePoints(View view){
        totalScore_a += 1;
        displayForTeamA(totalScore_a);
    }
    public void threePointsb(View view){
        totalScore_b += 3;
        displayForTeamB(totalScore_b);
    }
    public void twoPointsb(View view){
        totalScore_b += 2;
        displayForTeamB(totalScore_b);
    }
    public void onePointsb(View view){
        totalScore_b += 1;
        displayForTeamB(totalScore_b);
    }
    public void Resetall(View view){
        totalScore_a = 0;
        totalScore_b = 0;
        displayForTeamA(totalScore_a);
        displayForTeamB(totalScore_b);
    }
}
