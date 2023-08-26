package com.android.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    String cross = "X";
    String noll = "O";

    int pp = 0;
    int cp = 0;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    TextView textView;

    TextView playerPoints;

    TextView pcPoints;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        textView = findViewById(R.id.winner);
        textView.setText("");

        playerPoints = findViewById(R.id.PlayerPoints);

        pcPoints = findViewById(R.id.PCPoints);

        sharedPreferences = this.getSharedPreferences("tic_tac_toe", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();



    }


    public void clcbtn1(View view) {
        if (button1.getText() == "" && textView.getText() == "") {
            button1.setText(cross);
            playerWinner();
            if(textView.getText()==""){
            movePC();}
        }
    }

    public void clcbtn2(View view) {
        if (button2.getText() == "" && textView.getText() == "") {
            button2.setText(cross);
            playerWinner();
            if(textView.getText()==""){
                movePC();}
        }
    }

    public void clcbtn3(View view) {
        if (button3.getText() == "" && textView.getText() == "") {
            button3.setText(cross);
            playerWinner();
            if(textView.getText()==""){
                movePC();}
        }
    }

    public void clcbtn4(View view) {
        if (button4.getText() == "" && textView.getText() == "") {
            button4.setText(cross);
            playerWinner();
            if(textView.getText()==""){
                movePC();}
        }
    }

    public void clcbtn5(View view) {
        if (button5.getText() == "" && textView.getText() == "") {
            button5.setText(cross);
            playerWinner();
            if(textView.getText()==""){
                movePC();}
        }
    }

    public void clcbtn6(View view) {
        if (button6.getText() == "" && textView.getText() == "") {
            button6.setText(cross);
            playerWinner();
            if(textView.getText()==""){
                movePC();}
        }
    }

    public void clcbtn7(View view) {
        if (button7.getText() == "" && textView.getText() == "") {
            button7.setText(cross);
            playerWinner();
            if(textView.getText()==""){
                movePC();}
        }
    }

    public void clcbtn8(View view) {
        if (button8.getText() == "" && textView.getText() == "") {
            button8.setText(cross);
            playerWinner();
            if(textView.getText()==""){
                movePC();}
        }
    }

    public void clcbtn9(View view) {
        if (button9.getText() == "" && textView.getText() == "") {
            button9.setText(cross);
            playerWinner();
            if(textView.getText()==""){
                movePC();}
        }
    }

    public void movePC() {
        Random random = new Random();
        int buttonPCClick = 1 + random.nextInt(8);
//        Log.i("movePC","buttonPCClick " + buttonPCClick);
        switch (buttonPCClick) {
            case (1):
                if (button1.getText() == "") {
                    button1.setText(noll);
                    computerWinner();
                } else {
                    movePC();
                }
                break;
            case (2):
                if (button2.getText() == "") {
                    button2.setText(noll);
                    computerWinner();
                } else {
                    movePC();
                }
                break;
            case (3):
                if (button3.getText() == "") {
                    button3.setText(noll);
                    computerWinner();
                } else {
                    movePC();
                }
                break;
            case (4):
                if (button4.getText() == "") {
                    button4.setText(noll);
                    computerWinner();
                } else {
                    movePC();
                }
                break;
            case (5):
                if (button5.getText() == "") {
                    button5.setText(noll);
                    computerWinner();
                } else {
                    movePC();
                }
                break;
            case (6):
                if (button6.getText() == "") {
                    button6.setText(noll);
                    computerWinner();
                } else {
                    movePC();
                }
                break;
            case (7):
                if (button7.getText() == "") {
                    button7.setText(noll);
                    computerWinner();
                } else {
                    movePC();
                }
                break;
            case (8):
                if (button8.getText() == "") {
                    button8.setText(noll);
                    computerWinner();
                } else {
                    movePC();
                }
                break;
            case (9):
                if (button9.getText() == "") {
                    button9.setText(noll);
                    computerWinner();
                } else {
                    movePC();
                }
                break;
        }
    }


    public void playerWinner() {
        if (button1.getText() == cross && button2.getText() == cross && button3.getText() == cross) {
            textView.setText(R.string.winner_message);
            pp++;
            playerPoints.setText("" + pp);
            button1.setBackgroundColor(Color.BLUE);
            button2.setBackgroundColor(Color.BLUE);
            button3.setBackgroundColor(Color.BLUE);
        } else if (button4.getText() == cross && button5.getText() == cross && button6.getText() == cross) {
            textView.setText(R.string.winner_message);
            pp++;
            playerPoints.setText("" + pp);
            button4.setBackgroundColor(Color.BLUE);
            button5.setBackgroundColor(Color.BLUE);
            button6.setBackgroundColor(Color.BLUE);
        } else if (button7.getText() == cross && button8.getText() == cross && button9.getText() == cross) {
            textView.setText(R.string.winner_message);
            pp++;
            playerPoints.setText("" + pp);
            button7.setBackgroundColor(Color.BLUE);
            button8.setBackgroundColor(Color.BLUE);
            button9.setBackgroundColor(Color.BLUE);
        } else if (button1.getText() == cross && button4.getText() == cross && button7.getText() == cross) {
            textView.setText(R.string.winner_message);
            pp++;
            playerPoints.setText("" + pp);
        } else if (button2.getText() == cross && button5.getText() == cross && button8.getText() == cross) {
            textView.setText(R.string.winner_message);
            pp++;
            playerPoints.setText("" + pp);
            button2.setBackgroundColor(Color.BLUE);
            button5.setBackgroundColor(Color.BLUE);
            button8.setBackgroundColor(Color.BLUE);
        } else if (button3.getText() == cross && button6.getText() == cross && button9.getText() == cross) {
            textView.setText(R.string.winner_message);
            pp++;
            playerPoints.setText("" + pp);
            button3.setBackgroundColor(Color.BLUE);
            button6.setBackgroundColor(Color.BLUE);
            button9.setBackgroundColor(Color.BLUE);
        } else if (button1.getText() == cross && button5.getText() == cross && button9.getText() == cross) {
            textView.setText(R.string.winner_message);
            pp++;
            playerPoints.setText("" + pp);
            button1.setBackgroundColor(Color.BLUE);
            button5.setBackgroundColor(Color.BLUE);
            button9.setBackgroundColor(Color.BLUE);
        } else if (button7.getText() == cross && button5.getText() == cross && button3.getText() == cross) {
            textView.setText(R.string.winner_message);
            pp++;
            playerPoints.setText("" + pp);
            button7.setBackgroundColor(Color.BLUE);
            button5.setBackgroundColor(Color.BLUE);
            button3.setBackgroundColor(Color.BLUE);


        } else if (button1.getText() != "" && button2.getText() != "" && button3.getText() != "" &&
                button4.getText() != "" && button5.getText() != "" && button6.getText() != "" &&
                button7.getText() != "" && button8.getText() != "" && button9.getText() != "") {
            textView.setText(R.string.dead_heat);
        }
    }

    public void computerWinner() {
        if (button1.getText() == noll && button2.getText() == noll && button3.getText() == noll) {
            textView.setText(R.string.computer_win);
            cp++;
            pcPoints.setText("" + cp);
            button1.setBackgroundColor(Color.BLUE);
            button2.setBackgroundColor(Color.BLUE);
            button3.setBackgroundColor(Color.BLUE);
        } else if (button4.getText() == noll && button5.getText() == noll && button6.getText() == noll) {
            textView.setText(R.string.computer_win);
            cp++;
            pcPoints.setText("" + cp);
            button4.setBackgroundColor(Color.BLUE);
            button5.setBackgroundColor(Color.BLUE);
            button6.setBackgroundColor(Color.BLUE);
        } else if (button7.getText() == noll && button8.getText() == noll && button9.getText() == noll) {
            textView.setText(R.string.computer_win);
            cp++;
            pcPoints.setText("" + cp);
            button7.setBackgroundColor(Color.BLUE);
            button8.setBackgroundColor(Color.BLUE);
            button9.setBackgroundColor(Color.BLUE);
        } else if (button1.getText() == noll && button4.getText() == noll && button7.getText() == noll) {
            textView.setText(R.string.computer_win);
            cp++;
            pcPoints.setText("" + cp);
            button1.setBackgroundColor(Color.BLUE);
            button4.setBackgroundColor(Color.BLUE);
            button7.setBackgroundColor(Color.BLUE);
        } else if (button2.getText() == noll && button5.getText() == noll && button8.getText() == noll) {
            textView.setText(R.string.computer_win);
            cp++;
            pcPoints.setText("" + cp);
            button2.setBackgroundColor(Color.BLUE);
            button5.setBackgroundColor(Color.BLUE);
            button8.setBackgroundColor(Color.BLUE);
        } else if (button3.getText() == noll && button6.getText() == noll && button9.getText() == noll) {
            textView.setText(R.string.computer_win);
            cp++;
            pcPoints.setText("" + cp);
            button3.setBackgroundColor(Color.BLUE);
            button6.setBackgroundColor(Color.BLUE);
            button9.setBackgroundColor(Color.BLUE);
        } else if (button1.getText() == noll && button5.getText() == noll && button9.getText() == noll) {
            textView.setText(R.string.computer_win);
            cp++;
            pcPoints.setText("" + cp);
            button1.setBackgroundColor(Color.BLUE);
            button5.setBackgroundColor(Color.BLUE);
            button9.setBackgroundColor(Color.BLUE);
        } else if (button7.getText() == noll && button5.getText() == noll && button3.getText() == noll) {
            textView.setText(R.string.computer_win);
            cp++;
            pcPoints.setText("" + cp);
            button7.setBackgroundColor(Color.BLUE);
            button5.setBackgroundColor(Color.BLUE);
            button3.setBackgroundColor(Color.BLUE);
        }
    }


    public void restart(View view) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        textView.setText("");

        button1.setBackgroundColor(button1.getContext().getResources().getColor(R.color.purple_500));
        button2.setBackgroundColor(button1.getContext().getResources().getColor(R.color.purple_500));
        button3.setBackgroundColor(button1.getContext().getResources().getColor(R.color.purple_500));
        button4.setBackgroundColor(button1.getContext().getResources().getColor(R.color.purple_500));
        button5.setBackgroundColor(button1.getContext().getResources().getColor(R.color.purple_500));
        button6.setBackgroundColor(button1.getContext().getResources().getColor(R.color.purple_500));
        button7.setBackgroundColor(button1.getContext().getResources().getColor(R.color.purple_500));
        button8.setBackgroundColor(button1.getContext().getResources().getColor(R.color.purple_500));
        button9.setBackgroundColor(button1.getContext().getResources().getColor(R.color.purple_500));
    }
}