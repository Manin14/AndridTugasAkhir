package com.manin.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class reviewTransaksiBuku extends AppCompatActivity {
    AppCompatTextView tvBayar=null;
    AppCompatButton btnTutup=null;
    Bundle bundle=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_transaksi_buku);
        bundle=getIntent().getExtras();
        deklarasi();
        tampiltotal();
        kliktutup();
    }

    private void deklarasi() {
        tvBayar=findViewById(R.id.id_text_view_total_bayar);
        btnTutup=findViewById(R.id.id_button_tutup_buku);
    }

    private void tampiltotal() {
        if(bundle!=null){
            tvBayar.setText(bundle.getString("dataInisial"));

        }
        else {}
    }

    private void kliktutup() {
        btnTutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Kembali ke home", Toast.LENGTH_LONG).show();
                Intent a=new Intent (reviewTransaksiBuku.this,MainActivity.class);
                startActivity(a);
                finish();
            }
        });
    }
}
