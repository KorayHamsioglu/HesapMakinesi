package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import org.mariuszgromada.math.mxparser.Expression;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bilimsel extends AppCompatActivity {
    private TextView textView2;
    private Button btnGecmis,btnKare,buttonGecis2,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnSin,btnCos,btnTan,btnFakt,btnClear,btnExp,btnLn,btnLog,btnKok,btnUs,btnParantezAc,btnParantezKapa,btnCarp,btnBol,btnTopla,btnCıkar,btnMod,btnNokta,btnHesapla;
    private String oldText2;
    private String sonuc;
    private String[] str=new String[20];
    private String[] tarih=new String[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilimsel);
        buttonGecis2=findViewById(R.id.buttonGecis2);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnSin=findViewById(R.id.btnSin);
        btnCos=findViewById(R.id.btnCos);
        btnTan=findViewById(R.id.btnTan);
        btnFakt=findViewById(R.id.btnFakt);
        btnClear=findViewById(R.id.btnClear);
        btnExp=findViewById(R.id.btnExp);
        btnLn=findViewById(R.id.btnLn);
        btnLog=findViewById(R.id.btnLog);
        btnKok=findViewById(R.id.btnKok);
        btnUs=findViewById(R.id.btnUs);
        btnParantezAc=findViewById(R.id.btnParantezAc);
        btnParantezKapa=findViewById(R.id.btnParantezKapa);
        btnCarp=findViewById(R.id.btnCarp);
        btnBol=findViewById(R.id.btnBol);
        btnTopla=findViewById(R.id.btnTopla);
        btnCıkar=findViewById(R.id.btnCıkar);
        btnMod=findViewById(R.id.btnMod);
        btnNokta=findViewById(R.id.btnNokta);
        btnKare=findViewById(R.id.btnKare);
        btnHesapla=findViewById(R.id.btnHesapla);
        btnGecmis=findViewById(R.id.btnGecmis);
        textView2=findViewById(R.id.textView2);


        buttonGecis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Bilimsel.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"9");
            }
        });

        btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"+");
            }
        });

        btnCıkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"-");
            }
        });

        btnCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"x");
            }
        });

        btnBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"÷");
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"%");
            }
        });

        btnNokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+".");
            }
        });

        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"sin(");
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"cos(");
            }
        });

        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"tan(");
            }
        });

        btnFakt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"!");
            }
        });

        btnExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"exp(");
            }
        });

        btnLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"ln(");
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"log(");
            }
        });

        btnKok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"sqrt(");
            }
        });

        btnKare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"^(2)");
            }
        });

        btnUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"^(");
            }
        });


        btnParantezKapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+")");
            }
        });

        btnParantezAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldText2=textView2.getText().toString();
                textView2.setText(oldText2+"(");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText("");
            }
        });

        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               oldText2=textView2.getText().toString();
               oldText2=oldText2.replaceAll("x","*");
               oldText2=oldText2.replaceAll("÷","/");
               Expression expression=new Expression(oldText2);
                Date currentTime= Calendar.getInstance().getTime();
                SimpleDateFormat formatter=new SimpleDateFormat("dd.MM.yyyy");
                String date=formatter.format(currentTime);
               sonuc=String.valueOf(expression.calculate());
               int i;
               for(i=0;i<15;i++){
                   if (str[i]==null){
                       str[i]=oldText2+"="+sonuc;
                       tarih[i]=date;
                       i=15;
                   }
               }


               textView2.setText(sonuc);
            }
        });

        btnGecmis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Bilimsel.this,Gecmis.class);
                String islem= String.valueOf(textView2.getText());
                intent.putExtra("aktar",str);
                intent.putExtra("tarihaktar",tarih);
                startActivity(intent);
            }
        });


    }
}