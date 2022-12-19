package com.example.waveform_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;

import java.nio.file.Path;

public class graph extends AppCompatActivity {
//private LineGraphSeries<DataPoint> series1;
PointsGraphSeries<DataPoint> series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        System.out.println("R");
        int[] array = getIntent().getIntArrayExtra("key");
        GraphView graph;
        PointsGraphSeries<DataPoint> series;       //an Object of the PointsGraphSeries for plotting scatter graphs
        graph = (GraphView) findViewById(R.id.graph);
        series= new PointsGraphSeries<>(data(array));   //initializing/defining series to get the data from the method 'data()'
        series.setShape(PointsGraphSeries.Shape.POINT);
        series.setSize(5);
        graph.addSeries(series);                   //adding the series to the GraphView
    }
    public DataPoint[] data(int[]array){
        double y, x=0;
        DataPoint[] values = new DataPoint[array.length];     //creating an object of type DataPoint[] of size 'n'
        for(int i=0;i<array.length;i++){
            DataPoint v = new DataPoint(x, Double.parseDouble(String.valueOf(array[i])));
            x = x+1;
            values[i] = v;
        }
        return values;
    }
}