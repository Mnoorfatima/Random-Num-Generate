package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText= (EditText) findViewById(R.id.text3);
                TextView textView=(TextView) findViewById(R.id.label);
                int Range = Integer.parseInt(editText.getText().toString());
                Random r = new Random();
                int rand_no=r.nextInt(Range - 0)+0;
                textView.setText(rand_no+" ");


            }
        });


    }
}