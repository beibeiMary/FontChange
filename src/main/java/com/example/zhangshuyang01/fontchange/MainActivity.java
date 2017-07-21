package com.example.zhangshuyang01.fontchange;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_sec;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CommonUtils.initData(this);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        btn_sec = (Button) findViewById(R.id.btn_second);

        btn_sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FontActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

}
