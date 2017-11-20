package com.example.denis.yandextranslater;

// api key - trnsl.1.1.20171019T103019Z.33bc61db98d2d31b.192870bcc912c1ea2a46d94dd1d88d59cab507a2

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R2.id.textEn) EditText textEn;
    @BindView(R2.id.textRu) EditText textRu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }
}
