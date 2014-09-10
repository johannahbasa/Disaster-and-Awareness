package net.bluemix.psda.psda2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tsunami extends ActionBarActivity {

    //declaration of widgets in layout
    Button guidelines, firstaid, prepare;
    TextView line,line1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        //set activity layout
        setContentView(R.layout.activity_flooding);

        //assinging buttons from layout

        guidelines =(Button) findViewById(R.id.guidelines);
        firstaid = (Button) findViewById(R.id.firstaid);
        prepare = (Button) findViewById(R.id.prepare);
        line = (TextView) findViewById(R.id.line);
        line1 = (TextView) findViewById(R.id.line1);


        //assigning background color of buttons
        prepare.setBackgroundColor(Color.GRAY);
        guidelines.setBackgroundColor(Color.GRAY);
        firstaid.setBackgroundColor(Color.RED);
        line.setBackgroundColor(Color.BLACK);
        line1.setBackgroundColor(Color.BLACK);


        //on clicking guidelines button
        guidelines.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Tsunami.this, Guidelines.class));
                finish();
            }
        });

        //on clicking firstaid button
        firstaid.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Tsunami.this, Firstaid.class));
                finish();
            }
        });

        //on clicking firstaid button
        prepare.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Tsunami.this, Prepare.class));
                finish();
            }
        });




    }



}

