package com.redwood2magnet.experidagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "SUJAY";
    TextView textView;
    Button button;

    Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tvView);
        button = findViewById(R.id.get);

        mCar = DaggerCarComponent.create().getMyCar();

    }

    public void getData(View view) {
        String msg= mCar.getData();
        textView.setText(msg);
        Log.i(TAG, "getData: "+msg);
        
    }
}
