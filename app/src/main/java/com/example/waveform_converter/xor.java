package com.example.waveform_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class xor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xor);
        Button button=(Button) findViewById(R.id.button9);
        button.setOnClickListener(this::OpenActivity6);
    }
    public void OpenActivity6(View view){
        System.out.println("aa");
        int []arr3;
        EditText ed2 = (EditText) findViewById(R.id.editTextTextPersonName7);
        String[] text = ed2.getText().toString().split(" ");
        int[] arr = new int[text.length];//Assuming no spaces and user is using one comma between numbers
        int i=0;
        for(int o=0;o<text.length;o++) {
            arr[o] = Integer.parseInt(text[o]);
            // text = text.substring(text.indexOf(",") + 1);
        }
        EditText ed3 = (EditText) findViewById(R.id.editTextTextPersonName8);
        String[] text1 = ed3.getText().toString().split("");
        int[] arr2 = new int[text1.length];
        for (int j=0;j< text1.length;j++){
            arr2[j] = Integer.parseInt(text1[j]);
        }

        int ans;
        // int[5] arr1;
        // int arr1[5];

        arr3 = new int[arr.length];
        for (i = 0; i < arr.length; i++) {
            int t = arr[i];
            // string s = arr2[i];
            int s = arr2[i];
            ans = (arr[i] & (~arr2[i])) | ((~arr[i] )& arr2[i]);
            arr3[i] = ans;
        }
//        for (i = 0; i < 5; i++) {
//            ans = !(arr[i] + arr2[i]);
//
//
//        }
        System.out.println("ss");
        Toast.makeText(this, "Showing Output Waveform", Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(this, graph.class);
//        startActivity(intent);
        Intent p=new Intent(this,graph1.class);
        p.putExtra("key1",arr3);
        startActivity(p);
    }
}