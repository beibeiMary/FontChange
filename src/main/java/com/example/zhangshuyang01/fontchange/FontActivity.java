package com.example.zhangshuyang01.fontchange;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FontActivity extends AppCompatActivity
{
    private Button font_size;
    private Button font_style;
    private String[] areas = new String[]{"小号字体","中号字体", "大号字体"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CommonUtils.initData(this);
        setContentView(R.layout.activity_font);
        font_size = (Button) findViewById(R.id.btn_fontsize);
        font_style = (Button) findViewById(R.id.btn_fontstyle);
        font_size.setOnClickListener(new AlertClickListener());
        font_style.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Typeface newFont = Typeface.createFromAsset(FontActivity.this.getAssets(),
                        "fonts/mao.ttf");
                font_style.setTypeface(newFont);
            }
        });
    }

    class AlertClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Dialog dialog=	new AlertDialog.Builder(FontActivity.this).setTitle("选择区域")
                    .setItems(areas, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Log.d("zhsy", " which = "+which);
                            switch (which) {
                                case 0:
                                    Log.d("zhsy", " case 1 which = " + which);
                                    SpUtils.spSaveFontSize(FontActivity.this, "fontSize", 1);
                                    break;
                                case 1:
                                    Log.d("zhsy", " case 2 which = " + which);
                                    SpUtils.spSaveFontSize(FontActivity.this, "fontSize", 2);
                                    break;
                                case 2:
                                    Log.d("zhsy", " case 3 which = " + which);
                                    SpUtils.spSaveFontSize(FontActivity.this, "fontSize", 3);
                                    break;
                                default:
                                    break;
                            }
                            Intent intent = new Intent(FontActivity.this,MainActivity.class);
//                            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            finish();
                            startActivity(intent);
                            dialog.dismiss();
                        }
                    }).show();
        }
    }
}
