package com.example.waveform_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;

import java.util.Arrays;

public class graph3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph3);
        int[] array = getIntent().getIntArrayExtra("key2");
        System.out.println(Arrays.toString(array));
        GraphView graph3;
        PointsGraphSeries<DataPoint> series2;       //an Object of the PointsGraphSeries for plotting scatter graphs
        graph3 = (GraphView) findViewById(R.id.graph3);
        series2 = new PointsGraphSeries<>(data(array));   //initializing/defining series to get the data from the method 'data()'
        series2.setShape(PointsGraphSeries.Shape.POINT);
        series2.setSize(5);
        graph3.addSeries(series2);
    }
    public DataPoint[] data(int[]array){
        double y, x=0;
        DataPoint[] values2 = new DataPoint[array.length];     //creating an object of type DataPoint[] of size 'n'
        for(int i=0;i<array.length;i++){
            DataPoint v = new DataPoint(x, Double.parseDouble(String.valueOf(array[i])));
            x = x+1;
            values2[i] = v;
        }
        return values2;
    }
}