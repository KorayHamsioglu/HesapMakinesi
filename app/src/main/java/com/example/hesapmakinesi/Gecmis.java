package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Gecmis extends AppCompatActivity {
  private RecyclerView rv;
  private ArrayList<String> islemlerListe;
  private  ArrayList<String> islemlerTarih;
  private RVadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gecmis);
        rv=findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);

        String[] text=getIntent().getStringArrayExtra("aktar");
        String[] tarih=getIntent().getStringArrayExtra("tarihaktar");
        islemlerListe=new ArrayList<String>();
        islemlerTarih=new ArrayList<String>();
        for(String s: text){
            islemlerListe.add(s);

        }
       for (String s: tarih){
            islemlerTarih.add(s);
       }


        adapter=new RVadapter(this,islemlerListe,islemlerTarih);


        rv.setAdapter(adapter);




    }
}