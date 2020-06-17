package com.hackernight.quotesfordeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hackernight.controller.AppController;
import com.hackernight.data.QuoteModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new QuoteModel().getQuote();
    }
}