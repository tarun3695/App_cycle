package com.example.appcycle;

import static android.widget.Toast.*;

import static com.example.appcycle.R.string.onpause_is_called;
import static com.example.appcycle.R.string.onrestart_is_called;
import static com.example.appcycle.R.string.onresume_is_called;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Initialize UI Element and Variable Here

    Toast.makeText(this, R.string.onstart_is_called,
                LENGTH_SHORT).show();


    }

    @Override
    protected void onStart() {
        super.onStart();
// start Animation or UI- Relate task

        makeText(this, R.string.onstart_is_called,
                LENGTH_SHORT).show();




    }


    @Override
    protected void onResume() {
        super.onResume();

        // start Senors , location updates , etc

        Toast.makeText(this, onresume_is_called,
                LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, onpause_is_called,
                LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, onrestart_is_called,
                LENGTH_SHORT).show();
    }
}

