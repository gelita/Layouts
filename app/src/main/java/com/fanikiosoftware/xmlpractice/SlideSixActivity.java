package com.fanikiosoftware.xmlpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SlideSixActivity extends AppCompatActivity {

        @BindView(R.id.btn1) Button btn1;
        @BindView(R.id.btn2) Button btn2;
        @BindView(R.id.btn3) Button btn3;
        @BindView(R.id.btn4) Button btn4;
        @BindView(R.id.btn5) Button btn5;
        @BindView(R.id.btn6) Button btn6;


        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout_slide_6);
            ButterKnife.bind(this);
        }
}
