package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    private Button buttonMod,buttonGecis,button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonCarpma,buttonCıkarma,buttonBolme,buttonToplama,buttonVirgul,buttonHesapla,buttonTemizle;
    private TextView textView;
    private String oldText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        button0=findViewById(R.id.button0);
        buttonCarpma=findViewById(R.id.buttonCarpma);
        buttonBolme=findViewById(R.id.buttonBolme);
        buttonToplama=findViewById(R.id.buttonToplama);
        buttonCıkarma=findViewById(R.id.buttonCıkarma);
        buttonVirgul=findViewById(R.id.buttonVirgul);
        buttonHesapla=findViewById(R.id.buttonHesapla);
        buttonTemizle=findViewById(R.id.buttonTemizle);
        buttonGecis=findViewById(R.id.buttonGecis);
        buttonMod=findViewById(R.id.buttonMod);
        textView=findViewById(R.id.textView);

        buttonTemizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText=textView.getText().toString();
                textView.setText(oldText+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText=textView.getText().toString();
                textView.setText(oldText+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText=textView.getText().toString();
                textView.setText(oldText+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText=textView.getText().toString();
                textView.setText(oldText+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText=textView.getText().toString();
                textView.setText(oldText+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText=textView.getText().toString();
                textView.setText(oldText+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText=textView.getText().toString();
                textView.setText(oldText+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText=textView.getText().toString();
                textView.setText(oldText+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText=textView.getText().toString();
                textView.setText(oldText+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText=textView.getText().toString();
                textView.setText(oldText+"9");
            }
        });

        buttonToplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText=textView.getText().toString();
                textView.setText(oldText+"+");
            }
        });

        buttonCıkarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText=textView.getText().toString();
                textView.setText(oldText+"-");
            }
        });

        buttonCarpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText=textView.getText().toString();
                textView.setText(oldText+"x");
            }
        });

        buttonBolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText=textView.getText().toString();
                textView.setText(oldText+"÷");
            }
        });

        buttonVirgul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText=textView.getText().toString();
                textView.setText(oldText+".");
            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText=textView.getText().toString();
                textView.setText(oldText+"%");
            }
        });


        buttonHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText=textView.getText().toString();
                oldText=oldText.replaceAll("x","*");
                oldText=oldText.replaceAll("÷","/");

                Context rhino=Context.enter();
                rhino.setOptimizationLevel(-1);
                String sonuc="";
                Scriptable scriptable=rhino.initStandardObjects();
                sonuc= rhino.evaluateString(scriptable,oldText,"JavaScript",1,null).toString();
                textView.setText(sonuc);
            }
        });

        buttonGecis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Bilimsel.class);
                startActivity(intent);

            }
        });



    }
}