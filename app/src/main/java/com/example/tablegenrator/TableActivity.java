package com.example.tablegenrator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TableActivity extends AppCompatActivity {
//    Declaring the Views and Variables
    TextView TableContainer;
    String Table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
//        Iniiiling the Views
        TableContainer = findViewById(R.id.tableContainer);

//        Getting the Required Strings from MainActivity and converting to Integer
        Intent i = getIntent();
        int TableNo = Integer.parseInt(i.getStringExtra(MainActivity.TableNoString));
        int LastNo = Integer.parseInt(i.getStringExtra(MainActivity.LastNoString));

        GenrateTable(TableNo,LastNo);
    }

//    Creating a function to create a  Table and add the table to the TextView
    public void GenrateTable( int TableNo, int LastNo){
        for(int i = 1; i<=LastNo;i++){

            if (Table !=null){
            Table = Table + TableNo+"x"+i+"="+TableNo*i+"\n";}

            else{
            Table = TableNo+"x"+i+"="+TableNo*i+"\n";}
        }
            TableContainer.setText(Table);
        }
    }
