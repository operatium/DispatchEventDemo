package com.dispatcheventdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private Button bt;
    private ImageView iv;
    private ImageView iv2;
    private ImageView iv3;
    private ScrollView scrollView;
    private LinearLayout line;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv =(TextView) findViewById(R.id.textView);
        bt = (Button)findViewById(R.id.button2);
        iv = (ImageView)findViewById(R.id.imageView);
        iv2 = (ImageView)findViewById(R.id.imageView2);
        iv3 = (ImageView)findViewById(R.id.imageView3);
        scrollView = (ScrollView)findViewById(R.id.scrollView);
        line = (LinearLayout)findViewById(R.id.line);

//        setViewEvent(tv,"TextView");
//        setViewEvent(bt,"Button");
//        setViewEvent(iv,"imageView");
//        setViewEvent(iv2,"imageView2");
//        setViewEvent(iv3,"imageView3");
        setViewEvent(scrollView,"scrollView");
//        setViewEvent(line,"LinearLayout");
    }

    public void setViewEvent(View view,String show)
    {
        view.setOnClickListener(v -> Log.e(show,"Click"));
        view.setOnTouchListener((v, event) -> {
            if (event.getAction() == MotionEvent.ACTION_DOWN)
            {
                Log.e(show,"ACTION_DOWN");
            }
            if (event.getAction() == MotionEvent.ACTION_UP)
                Log.e(show,"ACTION_UP");
            return false;
        });
    }
}
