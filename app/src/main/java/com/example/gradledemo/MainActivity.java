package com.example.gradledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvText;
    private Button btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvText = (TextView) findViewById(R.id.tvText);

        btnCheck = (Button) findViewById(R.id.btnCheck);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkDebug();
            }
        });
    }

    public void checkDebug(){

        if(BuildConfig.isDebug){
            tvText.setText("專案 package name: "+ BuildConfig.APPLICATION_ID);
        }else {
            tvText.setText("專案 package name: "+ BuildConfig.APPLICATION_ID);
        }

        Toast.makeText(this,getString(R.string.mString),Toast.LENGTH_LONG).show();
    }

}
