package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;



public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void BuClick(View view) {
        Button buSelected=(Button)view;

        int CellId=0;
        switch ((buSelected.getId())){

            case R.id.bu1:
                CellId=1;
                break;
            case R.id.bu2:
                CellId=2;
                break;
            case R.id.bu3:
                CellId=3;
                break;
            case R.id.bu4:
                CellId=4;
                break;
            case R.id.bu5:
                CellId=5;
                break;
            case R.id.bu6:
                CellId=6;
                break;
            case R.id.bu7:
                CellId=7;
                break;
            case R.id.bu8:
                CellId=8;
                break;
            case R.id.bu9:
                CellId=9;
                break;



        }
        PlayGame(CellId,buSelected);
    }

    int ActivePlayer=1;
    ArrayList<Integer> Player1=new  ArrayList<Integer>();
    ArrayList<Integer>Player2=new  ArrayList<Integer>();


    void PlayGame(int CellId,Button buSelected){

        Log.d("Player" , String.valueOf(CellId));
        if(ActivePlayer==1){

            buSelected.setText("X");
            buSelected.setBackgroundColor(Color.GREEN);
            Player1.add(CellId);
            ActivePlayer=2;
        }

        else if(ActivePlayer==2){

            buSelected.setText("0");
            buSelected.setBackgroundColor(Color.BLUE);
            Player2.add(CellId);
            ActivePlayer=1;
        }
        buSelected.setEnabled(false);
        CheckWinner();
    }


    void CheckWinner(){
        int winner=-1;

        //row1
        if(Player1.contains(1)&&Player1.contains(2)&&Player1.contains(3)){
            winner=1;
        }

        if(Player2.contains(1)&&Player2.contains(2)&&Player2.contains(3)){
            winner=2;
        }

        //row2
        if(Player1.contains(4)&&Player1.contains(5)&&Player1.contains(6)){
            winner=1;
        }

        if(Player2.contains(4)&&Player2.contains(5)&&Player2.contains(6)){
            winner=2;
        }

        //row3
        if(Player1.contains(7)&&Player1.contains(8)&&Player1.contains(9)){
            winner=1;
        }

        if(Player2.contains(7)&&Player2.contains(8)&&Player2.contains(9)){
            winner=2;
        }

        //col 1
        if(Player1.contains(1)&&Player1.contains(4)&&Player1.contains(7)){
            winner=1;
        }

        if(Player2.contains(1)&&Player2.contains(4)&&Player2.contains(7)){
            winner=2;
        }

        //col 2
        if(Player1.contains(2)&&Player1.contains(5)&&Player1.contains(8)){
            winner=1;
        }

        if(Player2.contains(2)&&Player2.contains(5)&&Player2.contains(8)){
            winner=2;
        }

        //col 3
        if(Player1.contains(3)&&Player1.contains(6)&&Player1.contains(9)){
            winner=1;
        }

        if(Player2.contains(3)&&Player2.contains(6)&&Player2.contains(9)){
            winner=2;
        }

        //diag 1
        if(Player1.contains(1)&&Player1.contains(5)&&Player1.contains(9)){
            winner=1;
        }

        if(Player2.contains(1)&&Player2.contains(5)&&Player2.contains(9)){
            winner=2;
        }

        //diag 2
        if(Player1.contains(3)&&Player1.contains(5)&&Player1.contains(7)){
            winner=1;
        }

        if(Player2.contains(3)&&Player2.contains(5)&&Player2.contains(7)){
            winner=2;
        }
        if(winner!=-1){

            if(winner==1){
                Toast.makeText(this,"Player 1 is a winner",Toast.LENGTH_LONG).show();
            }
            if(winner==2) {
                Toast.makeText(this, "Player 2 is a winner", Toast.LENGTH_LONG).show();
            }
        }
    }

}
