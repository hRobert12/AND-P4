package com.example.android.jokedisplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.Joker;

public class Joke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
    }

    void showJoke() {
        TextView joke = (TextView) findViewById(R.id.joke);
        if (Joker.getJoke() != null) {
            joke.setText(Joker.getJoke());
        }
    }
}
