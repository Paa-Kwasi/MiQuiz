package com.example.francis.miquiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.francis.miquiz.EXTRA_MESSAGE";
    int myScore = 0;
    int outQtn = 0;
    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;
    private RadioGroup radioGroup3;
    private RadioGroup radioGroup4;
    private RadioGroup radioGroup5;
    private RadioGroup radioGroup6;
    private RadioGroup radioGroup7;
    private RadioGroup radioGroup8;
    private RadioGroup radioGroup9;
    private RadioGroup radioGroup10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String mUser = intent.getStringExtra(FirstLogin.EXTRA_TEXT);
        TextView mainUsername = (TextView) findViewById(R.id.userName);
        mainUsername.setText(mUser);

        /* Initialize Radio Group and attach click handler */
        radioGroup1 = (RadioGroup) findViewById(R.id.rG_qtn_1);
        radioGroup1.clearCheck();

        radioGroup2 = (RadioGroup) findViewById(R.id.rG_qtn_2);
        radioGroup2.clearCheck();

        radioGroup3 = (RadioGroup) findViewById(R.id.rG_qtn_3);
        radioGroup3.clearCheck();

        radioGroup4 = (RadioGroup) findViewById(R.id.rG_qtn_4);
        radioGroup4.clearCheck();

        radioGroup5 = (RadioGroup) findViewById(R.id.rG_qtn_5);
        radioGroup5.clearCheck();

        radioGroup6 = (RadioGroup) findViewById(R.id.rG_qtn_6);
        radioGroup6.clearCheck();

        radioGroup7 = (RadioGroup) findViewById(R.id.rG_qtn_7);
        radioGroup7.clearCheck();

        radioGroup8 = (RadioGroup) findViewById(R.id.rG_qtn_8);
        radioGroup8.clearCheck();

        radioGroup9 = (RadioGroup) findViewById(R.id.rG_qtn_9);
        radioGroup9.clearCheck();

        radioGroup10 = (RadioGroup) findViewById(R.id.rG_qtn_10);
        radioGroup10.clearCheck();

        // Initializing the score textview
        //myScore = (TextView) findViewById(R.id.myScore);

        /* Attach CheckedChangeListener to radio group1 */
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selected = (RadioButton) findViewById(R.id.qtn1_rbtn_2);
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                outQtn++;
                if (rb == selected) {
                    Toast.makeText(MainActivity.this, rb.getText() + " is the correct answer.", Toast.LENGTH_SHORT).show();
                    myScore++;
                    displayScore(myScore);
                } else {
                    Toast.makeText(MainActivity.this, rb.getText() + " is not the correct answer.", Toast.LENGTH_SHORT).show();
                }
                displayOutQtn(outQtn);
            }
        });

        /* Attach CheckedChangeListener to radio group2 */
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selected = (RadioButton) findViewById(R.id.qtn2_rbtn_2);
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                outQtn++;
                if (rb == selected) {
                    Toast.makeText(MainActivity.this, rb.getText() + " is the correct answer.", Toast.LENGTH_SHORT).show();
                    myScore++;
                    displayScore(myScore);

                } else {
                    Toast.makeText(MainActivity.this, rb.getText() + " is not the correct answer.", Toast.LENGTH_SHORT).show();
                }
                displayOutQtn(outQtn);
            }
        });

        /* Attach CheckedChangeListener to radio group3 */
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selected = (RadioButton) findViewById(R.id.qtn3_rbtn_1);
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                outQtn++;
                if (rb == selected) {
                    Toast.makeText(MainActivity.this, rb.getText() + " is the correct answer.", Toast.LENGTH_SHORT).show();
                    myScore++;
                    displayScore(myScore);

                } else {
                    Toast.makeText(MainActivity.this, rb.getText() + " is not the correct answer.", Toast.LENGTH_SHORT).show();
                }
                displayOutQtn(outQtn);
            }
        });

        /* Attach CheckedChangeListener to radio group4 */
        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selected = (RadioButton) findViewById(R.id.qtn4_rbtn_2);
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                outQtn++;
                if (rb == selected) {
                    Toast.makeText(MainActivity.this, rb.getText() + " is the correct answer.", Toast.LENGTH_SHORT).show();
                    myScore++;
                    displayScore(myScore);

                } else {
                    Toast.makeText(MainActivity.this, rb.getText() + " is not the correct answer.", Toast.LENGTH_SHORT).show();
                }
                displayOutQtn(outQtn);
            }
        });

        /* Attach CheckedChangeListener to radio group5 */
        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selected = (RadioButton) findViewById(R.id.qtn5_rbtn_1);
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                outQtn++;
                if (rb == selected) {
                    Toast.makeText(MainActivity.this, rb.getText() + " is the correct answer.", Toast.LENGTH_SHORT).show();
                    myScore++;
                    displayScore(myScore);

                } else {
                    Toast.makeText(MainActivity.this, rb.getText() + " is not the correct answer.", Toast.LENGTH_SHORT).show();
                }
                displayOutQtn(outQtn);
            }
        });

        /* Attach CheckedChangeListener to radio group6 */
        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selected = (RadioButton) findViewById(R.id.qtn6_rbtn_2);
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                outQtn++;
                if (rb == selected) {
                    Toast.makeText(MainActivity.this, rb.getText() + " is the correct answer.", Toast.LENGTH_SHORT).show();
                    myScore++;
                    displayScore(myScore);

                } else {
                    Toast.makeText(MainActivity.this, rb.getText() + " is not the correct answer.", Toast.LENGTH_SHORT).show();
                }
                displayOutQtn(outQtn);
            }
        });

        /* Attach CheckedChangeListener to radio group7 */
        radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selected = (RadioButton) findViewById(R.id.qtn7_rbtn_2);
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                outQtn++;
                if (rb == selected) {
                    Toast.makeText(MainActivity.this, rb.getText() + " is the correct answer.", Toast.LENGTH_SHORT).show();
                    myScore++;
                    displayScore(myScore);

                } else {
                    Toast.makeText(MainActivity.this, rb.getText() + " is not the correct answer.", Toast.LENGTH_SHORT).show();
                }
                displayOutQtn(outQtn);
            }
        });

        /* Attach CheckedChangeListener to radio group8 */
        radioGroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selected = (RadioButton) findViewById(R.id.qtn8_rbtn_1);
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                outQtn++;
                if (rb == selected) {
                    Toast.makeText(MainActivity.this, rb.getText() + " is the correct answer.", Toast.LENGTH_SHORT).show();
                    myScore++;
                    displayScore(myScore);

                } else {
                    Toast.makeText(MainActivity.this, rb.getText() + " is not the correct answer.", Toast.LENGTH_SHORT).show();
                }
                displayOutQtn(outQtn);
            }
        });

        /* Attach CheckedChangeListener to radio group9 */
        radioGroup9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selected = (RadioButton) findViewById(R.id.qtn9_rbtn_1);
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                outQtn++;
                if (rb == selected) {
                    Toast.makeText(MainActivity.this, rb.getText() + " is the correct answer.", Toast.LENGTH_SHORT).show();
                    myScore++;
                    displayScore(myScore);

                } else {
                    Toast.makeText(MainActivity.this, rb.getText() + " is not the correct answer.", Toast.LENGTH_SHORT).show();
                }
                displayOutQtn(outQtn);
            }
        });

        /* Attach CheckedChangeListener to radio group10 */
        radioGroup10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selected = (RadioButton) findViewById(R.id.qtn10_rbtn_3);
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                outQtn++;
                if (rb == selected) {
                    Toast.makeText(MainActivity.this, rb.getText() + " is the correct answer.", Toast.LENGTH_SHORT).show();
                    myScore++;
                    displayScore(myScore);

                } else {
                    Toast.makeText(MainActivity.this, rb.getText() + " is not the correct answer.", Toast.LENGTH_SHORT).show();
                }
                displayOutQtn(outQtn);
            }
        });


    }

    private void displayScore(int score) {
        TextView viewScore = (TextView) findViewById(R.id.myScore);
        viewScore.setText("Score: " + score + "/10");


    }

    private void displayOutQtn(int attQtn) {
        TextView viewScore = (TextView) findViewById(R.id.outQtn);
        viewScore.setText("Question: " + attQtn + "/10");

    }


    public void reset(View view) {
        Intent intent = getIntent();
        finish();
        String mUser = intent.getStringExtra(FirstLogin.EXTRA_TEXT);
        TextView mainUsername = (TextView) findViewById(R.id.userName);
        mainUsername.setText(mUser);
        startActivity(intent);

    }


    public void result(View view) {
        Intent intent = new Intent(this, Result.class);
        int number = Integer.parseInt(String.valueOf(myScore));
        intent.putExtra(EXTRA_MESSAGE, number);
        startActivity(intent);
    }
}