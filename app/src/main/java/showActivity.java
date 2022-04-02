package com.example.simpleparadox.listycity;

import androidx.appcompat.app.AppCompatActivity;
// 1707115
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        textView = findViewById(R.id.cityViewId);
        Intent it = getIntent();
        String cityName = it.getStringExtra("cityName");
        ArrayList<String> cityList = it.getStringArrayListExtra("cityList");
        textView.setText(cityName);

        final Button backBtn = findViewById(R.id.backBtnId);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShowActivity.this, MainActivity.class);
                intent.putExtra("cityList", cityList);
                ShowActivity.this.startActivity(intent);
            }
        });
    }
}