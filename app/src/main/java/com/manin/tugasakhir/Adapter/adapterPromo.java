package com.manin.tugasakhir.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.manin.tugasakhir.DetailPromo.detailPromoItem;
import com.manin.tugasakhir.R;
import com.manin.tugasakhir.komponenMenuToolBar.akun;

import java.util.ArrayList;

public class adapterPromo extends RecyclerView.Adapter<adapterPromo.CustomViewHolder> {

    private ArrayList<Integer> promo_saya;
    private Context context;

    public adapterPromo (Context context, ArrayList <Integer> promo_saya){
        this.promo_saya=promo_saya;
        this.context=context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup kepalanya, int modelnya) {
        LayoutInflater inisialInflater=LayoutInflater.from(kepalanya.getContext());
        View tampil=inisialInflater.inflate(R.layout.activity_item_promo_slide,kepalanya,false);

        return new CustomViewHolder(tampil);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterPromo.CustomViewHolder inisialCustomnya, final int model_model_nya) {

        inisialCustomnya.image_view.setImageResource(promo_saya.get(model_model_nya));
        //jika ada aksi klik disini,,coding disini

        inisialCustomnya.image_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // final daftarPromo hero=promo_saya.get(model_model_nya);

                //Toast.makeText(getItemCount(context), "Ini adalah contoh Toast di Android",Toast.LENGTH_LONG).show();
              /*  Intent gotoPromo = new Intent(context, akun.class);
                gotoPromo.putExtra("data1", promo_saya.get(model_model_nya));
                   context.startActivity(gotoPromo); */
              Intent intent=new Intent(context, detailPromoItem.class);
              intent.putExtra("nama",promo_saya.getClass());
              //  intent.putExtra("nama",daftarPromo.getId());
              context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return promo_saya.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        AppCompatImageView image_view;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            image_view=itemView.findViewById(R.id.id_image_viewnya);
        }
    }
}
