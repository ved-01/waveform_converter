package com.example.waveform_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OpenActivity(View view){
        Toast.makeText(this, "Taking you to Home page", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}