package com.example.crowsandcats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mHelloTextView;
    private Button mCrowsCounterButton;
    private int mCountCrown = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextView = findViewById(R.id.HelloWorld);
        mHelloTextView.setText("");
        mCrowsCounterButton = findViewById(R.id.CrowsButton);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHelloTextView.setText("Я нарахував " + ++mCountCrown+ " ворон");
            }
        });
    }

    public void clickButton(View view) {
        mHelloTextView.setText("Привітулі!");
    }
}
