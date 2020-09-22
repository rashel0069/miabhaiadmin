package com.appshat.miabhaiadmin.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.appshat.miabhaiadmin.R;

public class MainActivity extends AppCompatActivity {
    EditText userid,userpassword;
    Button loginadmin;
    String name = "miabhaiadmin";
    String pass = "admin2020";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        userid = findViewById( R.id.userloginID );
        userpassword = findViewById( R.id.passwordID );
        loginadmin = findViewById( R.id.loginButtonID );

        loginadmin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!userid.getText().toString().trim().isEmpty() && !userpassword.getText().toString().trim().isEmpty()){
                    if (userid.getText().toString().trim().equals( name ) && userpassword.getText()
                    .toString().trim().equals( pass )){
                        Intent intent = new Intent( getApplicationContext(), MainInterface.class );
                        startActivity( intent );
                        finish();
                    }else {
                        Toast.makeText( MainActivity.this, "ID and Password Incorrect", Toast.LENGTH_SHORT ).show();
                        userid.setError( "Incorrect User ID" );
                        userpassword.setError( "Incorrect Password" );
                    }
                }else {
                    Toast.makeText( MainActivity.this, "Please Enter Id and Password", Toast.LENGTH_SHORT ).show();
                }
            }
        } );
    }
}
