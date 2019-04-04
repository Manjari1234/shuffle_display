package com.example.shuffle_display;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etWord;
    private Button btnShuffle;
    private TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWord = findViewById(R.id.etWord);
        btnShuffle = findViewById(R.id.btnShuffel);
        tvOutput = findViewById(R.id.tvOutput);

        btnShuffle.setOnClickListener(this);

    }

    private String shuffel(String str) {

        ArrayList<Character> charArray = new ArrayList<>();
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            charArray.add(str.toCharArray()[i]);

        }

        Collections.shuffle(charArray);
        for (char c : charArray) {
            output += c;
        }
        return output;
    }

    @Override
    public void onClick(View v) {
tvOutput.setText(shuffel(etWord.getText().toString()));
    }

}

