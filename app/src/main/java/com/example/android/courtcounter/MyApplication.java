package com.example.android.courtcounter;

import android.app.Application;


public class MyApplication extends Application {

    //Declare score variables for team A and B
    private static int scoreTeamA = 0;
    private static int scoreTeamB = 0;

    // Getter Score Team A
    public int getScoreTeamA() {
        return scoreTeamA;
    }

    // Setter Score Team A
    public void setScoreTeamA(int points) {
        scoreTeamA += points;
    }

    // Set Score Team A by zero
    public void resetScoreTeamA() {
        scoreTeamA = 0;
    }


    // Getter Score Team B
    public int getScoreTeamB() {
        return scoreTeamB;
    }

    // Setter Score Team B
    public void setScoreTeamB(int points) {
        scoreTeamB += points;
    }

    // Set Score Team B by zero
    public void resetScoreTeamB() {
        scoreTeamA = 0;
    }
}