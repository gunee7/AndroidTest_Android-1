package kr.co.idealidea.androidtest;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


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

public class MakeStarActivity extends BaseActivity {

    private android.widget.Button leftBottomStarBtn;
    private android.widget.Button leftTopStarBtn;
    private android.widget.Button rightBottomStarBtn;
    private android.widget.Button rightTopStarBtn;
    private android.widget.TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_star);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        leftBottomStarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                printNormalStar();

            }
        });

        leftTopStarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printReverseStart();
            }
        });

        rightBottomStarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printRightStart();
            }
        });


    }

    private void printRightStart() {
        String starStr = "";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                starStr = starStr + "*";
            }
            starStr = starStr + "\n";
        }

        resultTxt.setText(starStr);
        resultTxt.setGravity(Gravity.RIGHT);
    }

    private void printReverseStart() {
        String starStr = "";

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                starStr = starStr + "*";
            }
            starStr = starStr + "\n";
        }

        resultTxt.setText(starStr);
    }

    private void printNormalStar() {

//        기본형 별찍기

        String starStr = "";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                starStr = starStr + "*";
            }
            starStr = starStr + "\n";
        }

        resultTxt.setText(starStr);
        resultTxt.setGravity(Gravity.LEFT);

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.resultTxt = (TextView) findViewById(R.id.resultTxt);
        this.rightTopStarBtn = (Button) findViewById(R.id.rightTopStarBtn);
        this.rightBottomStarBtn = (Button) findViewById(R.id.rightBottomStarBtn);
        this.leftTopStarBtn = (Button) findViewById(R.id.leftTopStarBtn);
        this.leftBottomStarBtn = (Button) findViewById(R.id.leftBottomStarBtn);

    }
}
