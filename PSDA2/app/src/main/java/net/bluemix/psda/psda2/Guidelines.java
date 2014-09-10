package net.bluemix.psda.psda2;

import android.content.Intent;

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

public class Guidelines extends ActionBarActivity {

    //declaration of widgets in layout
    Button guidelines, firstaid, prepare;
    TextView line,line1, earthquake, flooding, tsunami, volcano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //set activity layout
        setContentView(R.layout.activity_guidelines);

        //assinging buttons from layout

        guidelines =(Button) findViewById(R.id.guidelines);
        firstaid = (Button) findViewById(R.id.firstaid);
        prepare = (Button) findViewById(R.id.prepare);
        line = (TextView) findViewById(R.id.line);
        line1 = (TextView) findViewById(R.id.line1);


        flooding = (TextView) findViewById(R.id.flooding);
        earthquake = (TextView) findViewById(R.id.earthquake);
        tsunami = (TextView) findViewById(R.id.tsunami);
        volcano = (TextView) findViewById(R.id.volcano);


        //assigning background color of buttons
        guidelines.setBackgroundColor(Color.RED);
        firstaid.setBackgroundColor(Color.GRAY);
        prepare.setBackgroundColor(Color.GRAY);
        line.setBackgroundColor(Color.BLACK);
        line1.setBackgroundColor(Color.BLACK);


        //on clicking firstaid button
        firstaid.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Guidelines.this, Firstaid.class));
                finish();
            }
        });

        //on clicking prepare button
        prepare.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Guidelines.this, Prepare.class));
                finish();
            }
        });

        //on clicking prepare button
        earthquake.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Guidelines.this, Earthquake.class));
                finish();
            }
        });

        flooding.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Guidelines.this, Flooding.class));
                finish();
            }
        });

        tsunami.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Guidelines.this, Tsunami.class));
                finish();
            }
        });

       volcano.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Guidelines.this, Volcano.class));
                finish();
            }
        });

    }


}

