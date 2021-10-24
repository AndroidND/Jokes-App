package com.example.jokesrthem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.jokesrus.JokesRUs;

import java.util.ArrayList;

public class JokeMainActivity extends AppCompatActivity {

    public static final String EXTRA_PARAM_JOKE = "joke";
    private String joke;
    TextView tv_joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_main);
        Intent intent = getIntent();
        ArrayList<String> jokes = intent.getStringArrayListExtra(EXTRA_PARAM_JOKE);
        if (jokes != null) {
            joke = jokes.get(0);
        } else  {
            JokesRUs jokesRUs = new JokesRUs();
            joke = jokesRUs.getJoke();
        }


        tv_joke = findViewById(R.id.tv_joke);
        tv_joke.setText(joke);


    }
}
