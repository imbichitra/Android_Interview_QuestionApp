package com.example.bpradhan.androidinterview;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button answer1,answer2,answer3,answer4;
    TextView score,question;

    private Questions nQuestions=new Questions();
    private String nAnswer;
    private int nScore=0;
    private int nQuestionsLength=nQuestions.nQuestions.length;

    private int no=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        answer1=(Button)findViewById(R.id.ans1);
        answer2=(Button)findViewById(R.id.ans2);
        answer3=(Button)findViewById(R.id.ans3);
        answer4=(Button)findViewById(R.id.ans4);

        score=(TextView) findViewById(R.id.score);
        question=(TextView)findViewById(R.id.question);

        score.setText("Score: "+nScore);


        updateQuestion(no);
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.getText()==nAnswer){
                    nScore++;
                    score.setText("Score: "+nScore);

                    updateQuestion(no);
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                } else{
                    nScore--;
                    score.setText("Score: "+nScore);
                    updateQuestion(no);
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                }

            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2.getText()==nAnswer){
                    nScore++;
                    score.setText("Score: "+nScore);

                    updateQuestion(no);
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                } else{
                    nScore--;
                    score.setText("Score: "+nScore);
                    updateQuestion(no);
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                }

            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(answer3.getText()==nAnswer){
                    nScore++;
                    score.setText("Score: "+nScore);

                    updateQuestion(no);
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                } else{
                    nScore--;
                    score.setText("Score: "+nScore);
                    updateQuestion(no);
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();


                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer4.getText()==nAnswer){
                    nScore++;
                    score.setText("Score: "+nScore);

                    updateQuestion(no);
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                } else{
                    nScore--;
                    score.setText("Score: "+nScore);
                    updateQuestion(no);
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();

                }

            }
        });


    }
    private void updateQuestion(int num){
        if(no<=8) {

            question.setText(nQuestions.getQuestion(num));
            answer1.setText(nQuestions.getChoice1(num));
            answer2.setText(nQuestions.getChoice2(num));
            answer3.setText(nQuestions.getChoice3(num));
            answer4.setText(nQuestions.getChoice4(num));

            nAnswer = nQuestions.getCorrectAnswer(num);
            no++;
        }else{
            gameOver();
        }

    }
    private void gameOver(){
        AlertDialog.Builder al=new AlertDialog.Builder(MainActivity.this);
        al.setMessage("Game Over: Your score is "+nScore+"points.")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            }
                        })
                .setNegativeButton("EXIT",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        AlertDialog all=al.create();
        all.show();

    }
}
