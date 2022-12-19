package com.example.waveform_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;
public class graph1 extends AppCompatActivity {

  //  PointsGraphSeries<DataPoint> series1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph1);
        System.out.println("R");
//        int[] array = getIntent().getIntArrayExtra("key1");
//        GraphView graph;
//        PointsGraphSeries<DataPoint> series1;       //an Object of the PointsGraphSeries for plotting scatter graphs
//        graph = (GraphView) findViewById(R.id.graph1);
//        series1 = new PointsGraphSeries<>(data(array));   //initializing/defining series to get the data from the method 'data()'
//        series1.setShape(PointsGraphSeries.Shape.POINT);
//        series1.setSize(5);
//        graph.addSeries(series1);                   //adding the series to the GraphView
    }

    public DataPoint[] data(int[] array) {
        double y, x = 0;
        DataPoint[] values1 = new DataPoint[array.length];     //creating an object of type DataPoint[] of size 'n'
        for (int i = 0; i < array.length; i++) {
            DataPoint p = new DataPoint(x, Double.parseDouble(String.valueOf(array[i])));
            x = x + 1;
            values1[i] = p;
        }
        return values1;
    }
}