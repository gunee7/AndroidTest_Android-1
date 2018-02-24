package kr.co.idealidea.androidtest;

import android.os.Bundle;
import android.widget.Button;


/*
    문제 : 별찍기.

    1) 기본 별찍기
    *
    **
    ***
    ****
    *****

    2) 역순 별찍기
    *****
    ****
    ***
    **
    *

    3) 우측 정방향

         *
        **
       ***
      ****
     *****

    4) 우측 역순
     *****
      ****
       ***
        **
         *

 */

public class MakeStartActivity extends BaseActivity {

    private android.widget.Button leftBottomStarBtn;
    private android.widget.Button leftTopStarBtn;
    private android.widget.Button rightBottomStarBtn;
    private android.widget.Button rightTopStarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_start);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.rightTopStarBtn = (Button) findViewById(R.id.rightTopStarBtn);
        this.rightBottomStarBtn = (Button) findViewById(R.id.rightBottomStarBtn);
        this.leftTopStarBtn = (Button) findViewById(R.id.leftTopStarBtn);
        this.leftBottomStarBtn = (Button) findViewById(R.id.leftBottomStarBtn);

    }
}
