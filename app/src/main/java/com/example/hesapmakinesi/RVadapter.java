package com.example.hesapmakinesi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Date;
import java.util.List;

public class RVadapter extends RecyclerView.Adapter<RVadapter.CardViewTasarim> {
private Context context;
private List<String> liste;
private  List<String> tarihler;

    public RVadapter(Context context, List<String> liste,List<String> tarihler) {
        this.context = context;
        this.liste = liste;
        this.tarihler=tarihler;
    }

    @NonNull
    @Override
    public CardViewTasarim onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_tasarim,parent,false);

        return new CardViewTasarim(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewTasarim holder, int position) {
           String islem=liste.get(position);
           String tarih=tarihler.get(position);
           holder.textView3.setText(islem);
           holder.textView4.setText(tarih);


    }

    @Override
    public int getItemCount() {
        return liste.size();
    }

    public class CardViewTasarim extends RecyclerView.ViewHolder{
        public TextView textView3;
        public TextView textView4;
        public CardView cardView;

        public CardViewTasarim(View view){
            super(view);
            textView3=view.findViewById(R.id.textView3);
            textView4=view.findViewById(R.id.textView4);
            cardView=view.findViewById(R.id.cardView);

        }
    }
}
