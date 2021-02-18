package kz.course.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonDel, buttony, button1, button2, button3, buttonj, button4, button5, button6, buttonk, button7, button8, button9, buttonl, buttone, buttont, buttonm, buttonn;
    TextView tvSan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonDel = findViewById(R.id.btnDel);
        buttony = findViewById(R.id.btny);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        buttonj = findViewById(R.id.btnj);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        buttonk = findViewById(R.id.btnk);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        buttonl = findViewById(R.id.btnl);
        buttone = findViewById(R.id.btne);
        buttont = findViewById(R.id.btnt);
        buttonm = findViewById(R.id.btnm);
        buttonn = findViewById(R.id.btnn);
        tvSan = findViewById(R.id.tv_san);
        buttonDel .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText("Del");
            }
        });
        buttony .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText("=");
            }
        });
        button1 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText("1");
            }
        });
        button2 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText("2");
            }
        });
        button3 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText("3");
            }
        });
        buttonj .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText("/");
            }
        });
        button4 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText("4");
            }
        });
        button5 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText("5");
            }
        });
        button6 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText("6");
            }
        });
        buttonk .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText("-");
            }
        });
        button7 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText("7");
            }
        });
        button8 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText("8");
            }
        });
        button9 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText("9");
            }
        });
        buttonl .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText("*");
            }
        });
        buttone .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText(".");
            }
        });
        buttont .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText("0");
            }
        });
        buttonm .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText("%");
            }
        });
        buttonn .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan.setText("+");
            }
        });
    }
}