package kz.course.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonDel, button1, button2, button3, button4, button5, button6,  button7, button8, button9, buttone, buttont, buttonm;
    Button buttony, buttonj, buttonk, buttonl, buttonn;
    TextView tvSan, tvZapis;
    String birinshiSan, ekinshiSan, znak, zapisText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        buttone = findViewById(R.id.btne);
        buttont = findViewById(R.id.btnt);
        buttonm = findViewById(R.id.btnm);


        tvSan = findViewById(R.id.tv_san);
        tvZapis = findViewById(R.id.tv_zapis);


        View.OnClickListener buttonOperation = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }
        buttony = findViewById(R.id.btny);
        buttonj = findViewById(R.id.btnj);
        buttonk = findViewById(R.id.btnk);
        buttonl = findViewById(R.id.btnl);
        buttonn = findViewById(R.id.btnn);


        buttonn. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                birinshiSan = tvSan.getText().toString();
            }
             znak = "="
            zapisText = birinshiSan + "znak";
            tvZapis .setText(zapisText);
            tvSan. setText("0");
            }
        });
        buttony. setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ekinshiSan = tvSan.getText().toString();
            if (znak.equals("+")){
                int san1 = Integer.parseInt(birinshiSan);
                int san2 = Integer.parseInt(ekinshiSan);
                int res = san1 + san2;
                zapisText = birinshiSan + znak + ekinshiSan + "="+ res;
                zapisText = birinshiSan + "znak";
                tvZapis .setText(zapisText);
                tvSan.setText(""+res);
            }
        }
        znak = "="
        zapisText = birinshiSan + "znak";
        tvZapis .setText(zapisText);
        tvSan. setText("0");
    }
});







        View.OnClickListener buttonSandar = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (View.getId()) {
                    case R.id.btn1:
                        String aldingiSan = tvSan.getText().toString();
                        if (aldingiSan.equals("0")) {
                            tvSan.setText("1");
                        } else {
                            tvSan.setText(aldingiSan + "1");
                        }
                        break;

                    case R.id.btn2:
                    String aldingiSan = tvSan.getText().toString();
                        if (aldingiSan.equals("0")) {
                            tvSan.setText("2");
                        } else {
                        tvSan.setText(aldingiSan+"2");
                        break;
                    case R.id.btn3;
                        String aldingiSan = tvSan.getText().toString();
                        if (aldingiSan.equals("0")) {
                            tvSan.setText("3");
                        } else {
                        tvSan.setText(aldingiSan+"3");
                        tvSan.setText("3");
                        break;
                            case R.id.btn4:
                        String aldingiSan = tvSan.getText().toString();
                                if (aldingiSan.equals("0")) {
                                    tvSan.setText("4");
                                } else {
                        tvSan.setText(aldingiSan+"4");
                        tvSan.setText("4");
                        break;
                                    case R.id.btn5:
                        String aldingiSan = tvSan.getText().toString();
                                        if (aldingiSan.equals("0")) {
                                            tvSan.setText("5");
                                        } else {
                        tvSan.setText(aldingiSan+"5");
                        tvSan.setText("5");
                        break;
                                            case R.id.btn6:
                        String aldingiSan = tvSan.getText().toString();
                        if (aldingiSan.equals("0")) {
                            tvSan.setText("6");
                        } else {
                        tvSan.setText(aldingiSan+"6");
                        tvSan.setText("6");
                        break;

                            case R.id.btn7:
                        String aldingiSan = tvSan.getText().toString();
                                if (aldingiSan.equals("0")) {
                                    tvSan.setText("7");
                                } else {
                        tvSan.setText(aldingiSan+"7");
                        tvSan.setText("7");
                        break;
                                    case R.id.btn8:
                        String aldingiSan = tvSan.getText().toString();
                                        if (aldingiSan.equals("0")) {
                                            tvSan.setText("8");
                                        } else {
                        tvSan.setText(aldingiSan+"8");
                        tvSan.setText("8");
                        break;
                                            case R.id.btn9:
                        String aldingiSan = tvSan.getText().toString();
                                                if (aldingiSan.equals("0")) {
                                                    tvSan.setText("9");
                                                } else {
                        tvSan.setText(aldingiSan+"9");
                        tvSan.setText("9");
                        break;

                                                    case R.id.btne:
                        tvSan.setText(".");
                        break;
                                                    case R.id.btnt:
                        String aldingiSan = tvSan.getText().toString();
                                                        if (aldingiSan.equals("0")) {
                                                            tvSan.setText("0");
                                                        } else {
                        tvSan.setText(aldingiSan+"0");
                        tvSan.setText("0");
                        break;
                                                            case R.id.btnm:
                        tvSan.setText("%");
                        break;
                        33333333333333333333333333333333333333333333333


                }

            }
        };

        buttonDel .setOnClickListener(buttonSandar);
        buttony .setOnClickListener(buttonSandar);
        button1 .setOnClickListener(buttonSandar);
        button2 .setOnClickListener(buttonSandar);
        button3 .setOnClickListener(buttonSandar);
        buttonj .setOnClickListener(buttonSandar);
        button4 .setOnClickListener(buttonSandar);
        button5 .setOnClickListener(buttonSandar);
        button6 .setOnClickListener(buttonSandar);
        buttonk .setOnClickListener(buttonSandar);
        button7 .setOnClickListener(buttonSandar);
        button8 .setOnClickListener(buttonSandar);
        button9 .setOnClickListener(buttonSandar);
        buttonl .setOnClickListener(buttonSandar);
        buttone .setOnClickListener(buttonSandar);
        buttont .setOnClickListener(buttonSandar);
        buttonm .setOnClickListener(buttonSandar);
        buttonn .setOnClickListener(buttonSandar);
    }
}