package com.fanikiosoftware.xmlpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SlideFiveActivity extends AppCompatActivity {

        @BindView(R.id.btn1) Button btn1;
        @BindView(R.id.btn2) Button btn2;
        @BindView(R.id.btn3) Button btn3;
        @BindView(R.id.btn4) Button btn4;

        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout_slide_5);
            ButterKnife.bind(this);
        }
}
