package com.example.waveform_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class home extends AppCompatActivity {
//private Button button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void OpenActivity1(View view){
        Toast.makeText(this, "XOR Gate selected", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, xor.class);
        startActivity(intent);
    }
    public void OpenActivity2(View view){
        Toast.makeText(this, "NOR Gate selected", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, nor.class);
        startActivity(intent);
    }
    public void OpenActivity3(View view){
//        Toast.makeText(this, "NOT Gate selected", Toast.LENGTH_SHORT).show();
        System.out.println("H");
        Intent intent = new Intent(this, not.class);
        System.out.println("Hs");

        startActivity(intent);
    }


}