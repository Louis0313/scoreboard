
package com.android.example.scoreboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final int THREE = 3;
    private final int TWO = 2;
    private final int ONE = 1;
    int a = 0;
    int b = 0;
    TextView textTeamBPoint = null;
    TextView textTeamAPoint = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mThreePointA = (Button) findViewById(R.id.three_point_a);
        mThreePointA.setOnClickListener(this);
        Button mTwoPointA = (Button) findViewById(R.id.two_point_a);
        mTwoPointA.setOnClickListener(this);
        Button mOnePointA = (Button) findViewById(R.id.one_point_a);
        mOnePointA.setOnClickListener(this);
        Button mThreePointB = (Button) findViewById(R.id.three_point_b);
        mThreePointB.setOnClickListener(this);
        Button mTwoPointB = (Button) findViewById(R.id.two_point_b);
        mTwoPointB.setOnClickListener(this);
        Button mOnePointB = (Button) findViewById(R.id.one_point_b);
        mOnePointB.setOnClickListener(this);
        Button reset = (Button) findViewById(R.id.reset_zero);
        reset.setOnClickListener(this);

        textTeamBPoint = (TextView) findViewById(R.id.team_b_point);
        textTeamAPoint = (TextView) findViewById(R.id.team_a_point);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.three_point_a:
                a += THREE;
                Toast.makeText(MainActivity.this, "A팀 3점 추가", Toast.LENGTH_SHORT).show();
                break;
            case R.id.two_point_a:
                a += TWO;
                Toast.makeText(MainActivity.this, "A팀 2점 추가", Toast.LENGTH_SHORT).show();
                break;
            case R.id.one_point_a:
                a += ONE;
                Toast.makeText(MainActivity.this, "A팀 1점 추가", Toast.LENGTH_SHORT).show();
                break;
            case R.id.three_point_b:
                b += THREE;
                Toast.makeText(MainActivity.this, "B팀 3점 추가", Toast.LENGTH_SHORT).show();
                break;
            case R.id.two_point_b:
                b += TWO;
                Toast.makeText(MainActivity.this, "B팀 2점 추가", Toast.LENGTH_SHORT).show();
                break;
            case R.id.one_point_b:
                b += ONE;
                Toast.makeText(MainActivity.this, "B팀 1점 추가", Toast.LENGTH_SHORT).show();
                break;
            case R.id.reset_zero:
                System.out.print("ddd");
                a = 0;
                b = 0;
                Toast.makeText(MainActivity.this, "점수 초기화", Toast.LENGTH_SHORT).show();
                break;
        }
        textTeamAPoint.setText("" + a);
        textTeamBPoint.setText("" + b);

    }
}
