package net.bluemix.psda.psda2;

        import java.io.UnsupportedEncodingException;
        import java.net.URLEncoder;
        import java.util.ArrayList;
        import java.util.List;

        import org.apache.http.HttpResponse;
        import org.apache.http.NameValuePair;
        import org.apache.http.client.HttpClient;
        import org.apache.http.client.methods.HttpGet;
        import org.apache.http.impl.client.DefaultHttpClient;

        import android.annotation.SuppressLint;
        import android.annotation.TargetApi;
        import android.app.Activity;
        import android.app.AlertDialog;
        import android.content.Context;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.graphics.Color;
        import android.net.ConnectivityManager;
        import android.net.NetworkInfo;
        import android.os.Build;
        import android.os.Bundle;
        import android.os.StrictMode;
        import android.preference.PreferenceManager;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.view.Window;
        import android.view.WindowManager;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Spinner;
        import android.widget.TextView;


public class Addkit extends Activity {

    //declaration of widgets in layout
    Button savebutton;
    EditText occupation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set application screen into fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //set activity layout
        setContentView(R.layout.activity_addkit);

        //assinging buttons from layout
        savebutton = (Button) findViewById(R.id.savebutton);
        occupation = (EditText) findViewById(R.id.occupation);


        //on clicking logout button
        savebutton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub


                AlertDialog.Builder alertDialog2 = new AlertDialog.Builder(
                        Addkit.this);

                // Setting Dialog Title
                alertDialog2.setTitle("Saving....");

                // Setting Dialog Message
                alertDialog2.setMessage("Are you sure you want to save?");


                // Setting Positive "Yes" Btn
                alertDialog2.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Write your code here to execute after dialog
                                startActivity(new Intent(Addkit.this, Prepare.class));
                                finish();
                            }
                        }
                );
                // Setting Negative "NO" Btn
                alertDialog2.setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Write your code here to execute after dialog

                                dialog.cancel();
                            }
                        }
                );

                // Showing Alert Dialog
                alertDialog2.show();


            }
        });
    }
}