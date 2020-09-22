package com.appshat.miabhaiadmin.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.appshat.miabhaiadmin.R;

import java.util.Timer;

public class NewScreen extends AppCompatActivity {
    ProgressBar splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_new_screen );
        splash = findViewById( R.id.splashscreenId );
        splash.setVisibility( View.VISIBLE );

        final Thread timer = new Thread( ){
            @Override
            public void run() {
                try {
                    sleep( 2000 );
                    Intent intent = new Intent( getApplicationContext(),MainActivity.class );
                    startActivity( intent );
                    finish();
                    super.run();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        };
        timer.start();
    }
}
