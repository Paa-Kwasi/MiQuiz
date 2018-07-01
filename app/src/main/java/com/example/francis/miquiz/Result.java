package com.example.francis.miquiz;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultMessage = findViewById(R.id.resultMessage);
        TextView resultDisplay = findViewById(R.id.resultDisplay);
        TextView resultGrade = findViewById(R.id.resultGrade);
        int attempted ;

        //Get the number of questions answered correctly from the MainActivity
        Intent result = getIntent();
        attempted = result.getIntExtra(MainActivity.EXTRA_MESSAGE,0);

        //Set the text of resultMessage textview with concatenation of number of questions answered correctly
        resultMessage.setText("You answered "+attempted+" out of the 10 attempted questions correctly. Representing:");

        //Convert score to percentage and display to resultDisplay textview
        double resultShow= attempted;
        resultShow= (resultShow/10);
        NumberFormat showScore = NumberFormat.getPercentInstance();
        showScore.setMinimumFractionDigits(0);
        resultDisplay.setText(showScore.format(resultShow));

        //Determine the grade based on number of questions answered correctly
        String grade = "AVERAGE";
        if (attempted==10){
            grade = "EXCELLENT";
            resultDisplay.setTextSize(140);

        }else if (attempted>5 ){
            grade = "ABOVE AVERAGE";
        }else if(attempted==5){
            grade = "AVERAGE";
        }else if (attempted<5){
            grade = "BELOW AVERAGE";
        }
        //Display the grade
        resultGrade.setText("Your grade is "+grade);


    }


    // Go back to MainActivity (Questions screen) to try questions again
    public void reStart(View view) {
        Intent question = new Intent(this, MainActivity.class);
        finish();
        startActivity(question);
    }

    //Exit the app
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void exit(View view) {
        this.finishAffinity();
    }
}
