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

import net.bluemix.psda.psda2.Allergies;
import net.bluemix.psda.psda2.Asthma;
import net.bluemix.psda.psda2.Bleeding;
import net.bluemix.psda.psda2.R;


public class Firstaid extends ActionBarActivity {

    //declaration of widgets in layout
    Button guidelines, firstaid, prepare;
    TextView line,line1, line3, line4, line5, line7, line8, line9, line10, line11, allergies, asthma, bleeding, burns, choking, diabetic, heartattack, distress;    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set activity layout
        setContentView(R.layout.activity_firstaid);

        //assinging buttons from layout

        guidelines =(Button) findViewById(R.id.guidelines);
        firstaid = (Button) findViewById(R.id.firstaid);
        prepare = (Button) findViewById(R.id.prepare);
        line = (TextView) findViewById(R.id.line);
        line1 = (TextView) findViewById(R.id.line1);
        line3 = (TextView) findViewById(R.id.line3);
        line4 = (TextView) findViewById(R.id.line4);
        line5 = (TextView) findViewById(R.id.line5);

        line7 = (TextView) findViewById(R.id.line7);
        line8 = (TextView) findViewById(R.id.line8);
        line9 = (TextView) findViewById(R.id.line9);
        line10 = (TextView) findViewById(R.id.line10);
        line11 = (TextView) findViewById(R.id.line11);

        allergies = (TextView) findViewById(R.id.allergies);
        asthma = (TextView) findViewById(R.id.asthma);
        bleeding = (TextView) findViewById(R.id.bleeding);

       burns = (TextView) findViewById(R.id.burns);
        choking = (TextView) findViewById(R.id.choking);
        diabetic = (TextView) findViewById(R.id.diabetic);
        distress = (TextView) findViewById(R.id.distress);
        heartattack = (TextView) findViewById(R.id.heartattack);

        //assigning background color of buttons
        guidelines.setBackgroundColor(Color.GRAY);
        firstaid.setBackgroundColor(Color.RED);
        prepare.setBackgroundColor(Color.GRAY);
        line.setBackgroundColor(Color.BLACK);
        line1.setBackgroundColor(Color.BLACK);
        line3.setBackgroundColor(Color.LTGRAY);
        line4.setBackgroundColor(Color.LTGRAY);
        line5.setBackgroundColor(Color.LTGRAY);

        line7.setBackgroundColor(Color.LTGRAY);
        line8.setBackgroundColor(Color.LTGRAY);
        line9.setBackgroundColor(Color.LTGRAY);
        line10.setBackgroundColor(Color.LTGRAY);
        line11.setBackgroundColor(Color.LTGRAY);


        //on clicking guidelines button
        guidelines.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Guidelines.class));
                finish();
            }
        });

        //on clicking allergies
        allergies.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Allergies.class));
                finish();
            }
        });

        //on clicking allergies
        asthma.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Asthma.class));
                finish();
            }
        });

        //on clicking allergies
        bleeding.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Bleeding.class));
                finish();
            }
        });


        prepare.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Prepare.class));
                finish();
            }
        });


        //on clicking allergies
        burns.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Burns.class));
                finish();
            }
        });


        //on clicking allergies
        choking.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Choking.class));
                finish();
            }
        });

        //on clicking allergies
        diabetic.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Diabetic.class));
                finish();
            }
        });

        //on clicking allergies
        distress.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Distress.class));
                finish();
            }
        });

        //on clicking allergies
        heartattack.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Firstaid.this, Heartattack.class));
                finish();
            }
        });






    }



}
