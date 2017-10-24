package com.example.junaid.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private ColorWheel mColor = new ColorWheel();
    private FactBook mFactBook = new FactBook();
    // Declare our view veriable
    private TextView mTextView;
    private Button mButton;

    private RelativeLayout mRelativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from the layout file to corresponding variable

        mTextView = (TextView)findViewById(R.id.fatcsTextView);
        mButton = (Button)findViewById(R.id.showFactsButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fact = mFactBook.getFacts();
                int color = mColor.getColors();

                // update the screen with our dynamic fact
                mTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mButton.setTextColor(color);



            }
        };
        mButton.setOnClickListener(listener);
        //Toast.makeText(FunFactsActivity.this,"Yay! Our activity was created!",Toast.LENGTH_SHORT).show();

        Log.d(TAG, "We are longging from the on create() Method");
    }


}