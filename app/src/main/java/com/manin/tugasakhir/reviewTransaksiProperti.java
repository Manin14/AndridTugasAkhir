package com.manin.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class reviewTransaksiProperti extends AppCompatActivity {
    AppCompatTextView tvTampilTotalBayarProperti=null;
    AppCompatButton btnTutupProperti=null;
    Bundle bundle=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_transaksi_properti);
        bundle=getIntent().getExtras();
        deklarasi();
        tampilBayar();
        klikTutup();
    }

    private void klikTutup() {
        btnTutupProperti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Kembali ke home", Toast.LENGTH_LONG).show();
                Intent a=new Intent (reviewTransaksiProperti.this,MainActivity.class);
                startActivity(a);
                finish();
            }
        });
    }

    private void tampilBayar() {
        if(bundle!=null){
            tvTampilTotalBayarProperti.setText(penghias(bundle.getString("dataInputProperti")));

        }
        else {}
    }

    private void deklarasi() {
        tvTampilTotalBayarProperti=findViewById(R.id.id_text_view_total_bayar_properti);
        btnTutupProperti=findViewById(R.id.id_button_tutup_properti);
    }

    private String penghias(String tampilanNominal){
        return tampilanNominal+" Juta";}
}
