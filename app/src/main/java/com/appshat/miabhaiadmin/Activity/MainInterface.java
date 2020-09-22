package com.appshat.miabhaiadmin.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.appshat.miabhaiadmin.R;

public class MainInterface extends AppCompatActivity {
ImageButton memberprofile,mealorder,account,memberreg;
    boolean doubleBackpress = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main_interface );
        memberprofile = findViewById( R.id.memberprofileId );
        mealorder = findViewById( R.id.mealorderId );
        account = findViewById( R.id.accountingId );
        memberreg = findViewById( R.id.newregistrationID );

        memberprofile.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( MainInterface.this, "Member Profile", Toast.LENGTH_SHORT ).show();
            }
        } );
        mealorder.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( MainInterface.this, "Meal Order", Toast.LENGTH_SHORT ).show();
            }
        } );
        account.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( MainInterface.this, "Accounting", Toast.LENGTH_SHORT ).show();
            }
        } );
        memberreg.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getApplicationContext(),MemberRegisration.class );
                startActivity( intent );
            }
        } );
    }
    @Override
    public void onBackPressed() {
        if(doubleBackpress){
            super.onBackPressed();
            return;
        }
        this.doubleBackpress = true;
        Toast.makeText( this, "Please click back Again to Exit", Toast.LENGTH_SHORT ).show();
        new Handler( ).postDelayed( new Runnable() {
            @Override
            public void run() {
                doubleBackpress = false;
            }
        },2000 );
    }
}
