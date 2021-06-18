package com.example.randomnumbergen;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnGenerate;
    TextView generateNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random myRandom= new Random();

        btnGenerate=  (Button)findViewById(R.id.btnGenerate);
        final TextView generateNo= (TextView)findViewById(R.id.generateNo);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateNo.setText(String.valueOf(myRandom.nextInt(100)));
            }
        });


    }
}