package com.example.android.jokedisplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.Joker;

public class Joke extends AppCompatActivity {

    static TextView joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        joke = (TextView) findViewById(R.id.joke);
    }

    static public void showJoke() {
        if (Joker.getJoke() != null) {
            joke.setText(Joker.getJoke());
        }
    }
}
