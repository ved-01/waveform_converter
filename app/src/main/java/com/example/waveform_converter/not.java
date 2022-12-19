package com.example.waveform_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class not extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not);
        System.out.println("qw");
        Button button=(Button) findViewById(R.id.button5);
        button.setOnClickListener(this::OpenActivity4);
    }

    public void OpenActivity4(View view){
        System.out.println("aa");
        int []arr1;
        EditText ed = (EditText) findViewById(R.id.editTextTextPersonName);
        String[] text = ed.getText().toString().split(" ");
        int[] arr = new int[text.length];//Assuming no spaces and user is using one comma between numbers
        int i=0;
        for(int o=0;o<text.length;o++) {
            arr[o] = Integer.parseInt(text[o]);
            // text = text.substring(text.indexOf(",") + 1);
        }
        int ans;
        // int[5] arr1;
        // int arr1[5];

        arr1 = new int[arr.length];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                ans = 1;
            else
                ans = 0;
            arr1[i] = ans;
        }
        System.out.println("sa");
        for(i = 0; i < arr.length; i++){
           System.out.println(arr1[i]);
        }
        System.out.println("ss");
        Toast.makeText(this, "Showing Output Waveform", Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(this, graph.class);
//        startActivity(intent);
        Intent z=new Intent(not.this,graph.class);
        z.putExtra("key",arr1);
        startActivity(z);
    }
}

//    public static void setinputnot(Context context, String notinput) {
//        SharedPreferences prefs = context.getSharedPreferences("myAppPackage", 0);
//        SharedPreferences.Editor editor = prefs.edit();
//        editor.putString("notinput", notinput);
//        editor.commit();
//    }
//
//    public static String getinputnot(Context context) {
//        SharedPreferences prefs = context.getSharedPreferences("myAppPackage", 0);
//        return prefs.getString("notinput", "");
//        static void traverseString (notinput)
//
//    }
//}