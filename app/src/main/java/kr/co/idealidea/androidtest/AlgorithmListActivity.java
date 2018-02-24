package kr.co.idealidea.androidtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlgorithmListActivity extends BaseActivity {


    private Button multipleBtn;
    private Button starBtn;
    private Button gugudanBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm_list);
        bindViews();
        setupEvents();
        setValues();
    }


    @Override
    public void setupEvents() {

        multipleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, FindMultipleActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.gugudanBtn = (Button) findViewById(R.id.gugudanBtn);
        this.starBtn = (Button) findViewById(R.id.starBtn);
        this.multipleBtn = (Button) findViewById(R.id.multipleBtn);

    }
}
