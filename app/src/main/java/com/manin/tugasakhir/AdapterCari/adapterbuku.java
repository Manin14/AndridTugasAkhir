package com.manin.tugasakhir.AdapterCari;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.manin.tugasakhir.R;

import java.util.ArrayList;

public class adapterbuku extends RecyclerView.Adapter<adapterbuku.CustomViewHolder> {

    private ArrayList<Integer> promo_saya;
    private Context context;

    public adapterbuku (Context context, ArrayList <Integer> promo_saya){
        this.promo_saya=promo_saya;
        this.context=context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup kepalanya, int modelnya) {
        LayoutInflater inisialInflater=LayoutInflater.from(kepalanya.getContext());
        View tampil=inisialInflater.inflate(R.layout.activity_item_buku,kepalanya,false);

        return new CustomViewHolder(tampil);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterbuku.CustomViewHolder inisialCustomnya, int model_model_nya) {

        inisialCustomnya.image_view.setImageResource(promo_saya.get(model_model_nya));
        //jika ada aksi klik disini,,coding disini
    }

    @Override
    public int getItemCount() {
        return promo_saya.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        AppCompatImageView image_view;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            image_view=itemView.findViewById(R.id.id_image_buku_diitembuku);
        }
    }
}

