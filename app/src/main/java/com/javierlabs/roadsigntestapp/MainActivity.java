package com.javierlabs.roadsigntestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button ansA_Btn, ansB_Btn, ansC_Btn, ansD_Btn;
    Button submitBtn;
    Button previousBtn;
    ImageView imageQuestion;
    TextView totalQuestionsTextView;

    String selectedAnswerStr = "";
    int score = 0;
    int totalProblems = Problem.question.length;
    int questionsIndex = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiate all UI elements
        totalQuestionsTextView = findViewById(R.id.total_questions);
        imageQuestion = findViewById(R.id.image_question);
        ansA_Btn = findViewById(R.id.ans_A);
        ansB_Btn = findViewById(R.id.ans_B);
        ansC_Btn = findViewById(R.id.ans_C);
        ansD_Btn = findViewById(R.id.ans_D);
        submitBtn = findViewById(R.id.submit);
        previousBtn = findViewById(R.id.previous);

        ansA_Btn.setOnClickListener(this);
        ansB_Btn.setOnClickListener(this);
        ansC_Btn.setOnClickListener(this);
        ansD_Btn.setOnClickListener(this);
        submitBtn.setOnClickListener(this);
        previousBtn.setOnClickListener(this);

        totalQuestionsTextView.setText("Question " + (questionsIndex + 1)); //add one for readability. doesn't start at 0.

        loadQuestion();
    }

    @Override
    public void onClick(View view) {
        ansA_Btn.setBackgroundColor(Color.WHITE);
        ansB_Btn.setBackgroundColor(Color.WHITE);
        ansC_Btn.setBackgroundColor(Color.WHITE);
        ansD_Btn.setBackgroundColor(Color.WHITE);



        Button clicked = (Button) view;
        if(clicked.getId() == R.id.submit){ //if the user clicked submit
            if (selectedAnswerStr.equals(Problem.answer[questionsIndex])) { //if the selected answer = the correct answer
                score++; //add one to score
            }
            questionsIndex++; //add one to question index
            totalQuestionsTextView.setText("Question " + (questionsIndex + 1));
            loadQuestion(); //go to next question after adding

        } else if (clicked.getId() == R.id.previous){
            if (questionsIndex > 0) {
                questionsIndex--;
                score--;
                totalQuestionsTextView.setText("Question " + (questionsIndex + 1));
                loadQuestion();
            }

        } else { //if choices are clicked
            selectedAnswerStr = clicked.getText().toString();
            clicked.setBackgroundColor(Color.GREEN);
        }
    }

     public void loadQuestion(){
        if(questionsIndex == totalProblems){
            quizEnd();
            return;
        }

        imageQuestion.setImageResource(Problem.question[questionsIndex]); //set the image to the current questionsIndex

        //set text for each button to the respective question index @ indexes 0-3
        ansA_Btn.setText(Problem.choice[questionsIndex][0]);
        ansB_Btn.setText(Problem.choice[questionsIndex][1]);
        ansC_Btn.setText(Problem.choice[questionsIndex][2]);
        ansD_Btn.setText(Problem.choice[questionsIndex][3]);

    }


    public void quizEnd(){
        totalQuestionsTextView.setText("Question " + (questionsIndex));
        new AlertDialog.Builder(this)
                .setTitle("Score")
                .setMessage("Score is " + score + "/" + totalProblems)
                .setPositiveButton("Restart",(dialogInterface, i) -> restart() )
                .setCancelable(false)
                .show();
    }

    public void restart(){
        score = 0;
        questionsIndex = 0;
        totalQuestionsTextView.setText("Question " + (questionsIndex + 1));
        loadQuestion();
    }
}