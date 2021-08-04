package com.example.tablegenrator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

//    Declaring all the variaables and viwes
    private EditText TableNo;
    public static final String TableNoString = "com.examdple.android.TableGenarator.TableNo.String";
    public static final String LastNoString = "com.examdple.android.TableGenarator.LastNo.String";
    private EditText LastNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Initializing the views with Id
        TableNo = findViewById(R.id.TableNo);
        LastNo = findViewById(R.id.lastNo);
    }

        public void genrateTable(View view){

//        Extracting the Strings From the EditText Views
            String tableNoStr = TableNo.getText().toString();
            String lastNoStr = LastNo.getText().toString();
//
//            Creating the Intent in Order To Change THe Activity
            Intent i = new Intent(this, TableActivity.class);
//
//            Sending The required strings to the Table Activity
            i.putExtra(TableNoString, tableNoStr);
            i.putExtra(LastNoString, lastNoStr);
//
//            Starting the TableActivity
            startActivity(i);
        }
}