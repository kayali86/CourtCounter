package com.example.android.courtcounter;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    MyApplication myApplication = new MyApplication();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*

          Get the Score values form variable to display it on TextView

         */
        displayForTeamA(myApplication.getScoreTeamA());
        displayForTeamB(myApplication.getScoreTeamB());

    }


    /*

     * Increase the score for Team A.

     */
    public void addThreeToTeamA(View view) {
        myApplication.setScoreTeamA(3);
        displayForTeamA(myApplication.getScoreTeamA());
    }


    public void addTwoToTeamA(View view) {
        myApplication.setScoreTeamA(2);
        displayForTeamA(myApplication.getScoreTeamA());
    }


    public void addOneTeamA(View view) {
        myApplication.setScoreTeamA(1);
        displayForTeamA(myApplication.getScoreTeamA());
    }



    /*

     * Increase the score for Team B.

     */
    public void addThreeToTeamB(View view) {
        myApplication.setScoreTeamB(3);
        displayForTeamB(myApplication.getScoreTeamB());
    }


    public void addTwoToTeamB(View view) {
        myApplication.setScoreTeamB(2);
        displayForTeamB(myApplication.getScoreTeamB());
    }


    public void addOneTeamB(View view) {
        myApplication.setScoreTeamB(1);
        displayForTeamB(myApplication.getScoreTeamB());
    }


    /*

     * Reset the score by Zero.

     */
    public void resetScore(View view) {
        myApplication.resetScoreTeamA();
        myApplication.resetScoreTeamB();
        displayForTeamA(0);
        displayForTeamB(0);
    }



    /*

     * Displays the given score for Team A.

     */

    public void displayForTeamA(int scoreTeamA) {

        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));

        ProgressBar progressBarA = findViewById(R.id.progressBarA);
        progressBarA.setProgress(scoreTeamA);

    }


    /*

     * Displays the given score for Team B.

     */

    public void displayForTeamB(int scoreTeamB) {

        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));

        ProgressBar progressBarB = findViewById(R.id.progressBarB);
        progressBarB.setProgress(scoreTeamB);
    }



}
