package com.example.waveform_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class nor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nor);
        Button button=(Button) findViewById(R.id.button8);
        button.setOnClickListener(this::OpenActivity5);
    }
    public void OpenActivity5(View view){
        System.out.println("aa");
        int []arr7;
        EditText ed4 = (EditText) findViewById(R.id.editTextTextPersonName2);
        String[] text = ed4.getText().toString().split(" ");
        int[] arr = new int[text.length];//Assuming no spaces and user is using one comma between numbers
        int i=0;
        for(int o=0;o<text.length;o++) {
            arr[o] = Integer.parseInt(text[o]);
            // text = text.substring(text.indexOf(",") + 1);
        }
        EditText ed5 = (EditText) findViewById(R.id.editTextTextPersonName3);
        String[] text1 = ed5.getText().toString().split("");
        int[] arr2 = new int[text1.length];
        for (int j=0;j< text1.length;j++){
            arr2[j] = Integer.parseInt(text1[j]);
        }

        int ans;
        // int[5] arr1;
        // int arr1[5];

        arr7 = new int[arr.length];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && arr2[i] == 0)
                ans = 1;
            else
                ans = 0;
            arr7[i] = ans;
        }
//        for (i = 0; i < 5; i++) {
//            ans = !(arr[i] + arr2[i]);
//
//
//        }
        System.out.println("sa");
        for(i = 0; i < arr.length; i++){
            System.out.println(arr7[i]);
        }
        System.out.println("ss");
        Toast.makeText(this, "Showing output Waveform", Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(this, graph.class);
//        startActivity(intent);
        Intent v=new Intent(nor.this,graph3.class);
        v.putExtra("key2",arr7);
        startActivity(v);
    }
}