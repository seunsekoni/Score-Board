package com.example.android.scoreboard.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreArsenal = 0;
    int goalArsenal = 0;
    int penaltyArsenal = 0;
    int yellowArsenal = 0;
    int redArsenal = 0;

    int scoreBarcelona = 0;
    int goalBarcelona = 0;
    int penaltyBarcelona = 0;
    int yellowBarcelona = 0;
    int redBarcelona = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayArsenal(scoreArsenal);
        displayBarcelona(scoreBarcelona);

    }

    /**
     * Displays score for Arsenal
     */
    public void displayArsenal(int scoreArsenal) {
        TextView scoreView = (TextView) findViewById(R.id.score_arsenal);
        scoreView.setText(String.valueOf(scoreArsenal));
    }

    /**
     * Displays score for Team Arsenal
     */
    public void displayBarcelona(int scoreBarcelona) {
         TextView scoreView = (TextView) findViewById(R.id.score_barcelona);
         scoreView.setText(String.valueOf(scoreBarcelona));
    }

    /**
     * Display goal(s) for Team Arsenal
     */
    public void displayArsenalGoal(int goalArsenal) {
        TextView goalView = (TextView) findViewById(R.id.arsenal_goal_text_view);
        goalView.setText(String.valueOf(goalArsenal));
    }

    /**
     * Display goal(s) for Team Barcelona
     */
    public void displayBarcelonaGoal(int goalBarcelona) {
        TextView goalView = (TextView) findViewById(R.id.barcelona_goal_text_view);
        goalView.setText(String.valueOf(goalBarcelona));
    }

    /**
     * Display number of penalties taken by Team Arsenal
     */
    public void displayArsenalPenalty(int penaltyArsenal) {
        TextView penaltyView = (TextView) findViewById(R.id.arsenal_penalty_kick_text_view);
        penaltyView.setText(String.valueOf(penaltyArsenal));
    }

    /**
     * Display number of penalties taken by Team Barcelona
     */
    public void displayBarcelonaPenalty(int penaltyBarcelona) {
        TextView penaltyView = (TextView) findViewById(R.id.barcelona_penalty_text_view);
        penaltyView.setText(String.valueOf(penaltyBarcelona));
    }

    /**
     * Display number of yellow cards received by Team Arsenal
     */
    public void displayArsenalYellow(int yellowArsenal) {
        TextView yellowView = (TextView) findViewById(R.id.arsenal_yellow_text_view);
        yellowView.setText(String.valueOf(yellowArsenal));
    }

    /**
     * Display number of yellow cards received by Team Barcelona
     */
    public void displayBarcelonaYellow(int yellowBarcelona) {
        TextView yellowView = (TextView) findViewById(R.id.barcelona_yellow_text_view);
        yellowView.setText(String.valueOf(yellowBarcelona));
    }

    /**
     * Display number of red cards received by Team Arsenal
     */
    public void displayArsenalRed(int redArsenal) {
        TextView redView = (TextView) findViewById(R.id.arsenal_red_text_view);
        redView.setText(String.valueOf(redArsenal));
    }

    /**
     * Display number of red cards received by Team Arsenal
     */
    public void displayBarcelonaRed(int redBarcelona) {
        TextView redView = (TextView) findViewById(R.id.barcelona_red_text_view);
        redView.setText(String.valueOf(redBarcelona));
    }

    /**
     * Add one goal to Team Arsenal
     */
    public void addOneGoalForTeamArsenal(View view) {
        scoreArsenal = scoreArsenal + 1;
        displayArsenal(scoreArsenal);
        displayArsenalGoal(scoreArsenal);
    }

    /**
     * Add one goal for Team Barcelona
     */
    public void addOneGoalForTeamBarcelona(View view) {
        scoreBarcelona = scoreBarcelona + 1;
        displayBarcelona(scoreBarcelona);
        displayBarcelonaGoal(scoreBarcelona);
    }

    /**
     * Add one Penalty to Team Arsenal
     */
    public void addOnePenaltyForTeamArsenal(View view) {
        penaltyArsenal = penaltyArsenal + 1;
        displayArsenalPenalty(penaltyArsenal);
    }

    /**
     * Add one penalty for Team Barcelona
     */
    public void addOnePenaltyForTeamBarcelona(View view) {
        penaltyBarcelona = penaltyBarcelona + 1;
        displayBarcelonaPenalty(penaltyBarcelona);
    }

    /**
     * Add one yellow card to Team Arsenal
     */

    public void addOneYellowForTeamArsenal(View view) {
        yellowArsenal = yellowArsenal + 1;
        displayArsenalYellow(yellowArsenal);
    }

    /**
     * Add one yellow for Team Barcelona
     */
    public void addOneYellowForTeamBarcelona(View view) {
        yellowBarcelona = yellowBarcelona + 1;
        displayBarcelonaYellow(yellowBarcelona);
    }

    /**
     * Add one red card to Team Arsenal
     */

    public void addOneRedForTeamArsenal(View view) {
        redArsenal = redArsenal + 1;
        displayArsenalRed(redArsenal);
    }

    /**
     * Add one red for Team Barcelona
     */
    public void addOneRedForTeamBarcelona(View view) {
        redBarcelona = redBarcelona + 1;
        displayBarcelonaRed(redBarcelona);
    }

    /**
     * Resets the scoreboard
     */
    public void resetScoreBoard(View view) {
        scoreArsenal = 0;
        goalArsenal = 0;
        penaltyArsenal = 0;
        yellowArsenal = 0;
        redArsenal = 0;

        scoreBarcelona = 0;
        goalBarcelona = 0;
        penaltyBarcelona = 0;
        yellowBarcelona = 0;
        redBarcelona = 0;

        displayArsenal(scoreArsenal);
        displayArsenalGoal(goalArsenal);
        displayArsenalPenalty(penaltyArsenal);
        displayArsenalYellow(yellowArsenal);
        displayArsenalRed(redArsenal);

        displayBarcelona(scoreBarcelona);
        displayBarcelonaGoal(goalBarcelona);
        displayBarcelonaPenalty(penaltyBarcelona);
        displayBarcelonaYellow(yellowBarcelona);
        displayBarcelonaRed(redBarcelona);

    }

}
