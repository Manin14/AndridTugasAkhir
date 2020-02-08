package com.manin.tugasakhir.DetailPromo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.manin.tugasakhir.R;

public class detailPromoItem extends AppCompatActivity {

    AppCompatImageView iv=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_promo_item);

        Intent intent = getIntent();
        iv=findViewById(R.id.id_image_detai_item_promo);

        //cara ambil gambar yaitu pake glide
        Glide.with(this)
                .load(intent.getIntExtra("nama",0))
                .apply(new RequestOptions().override(100,100))
                .into(iv);

    }
}
