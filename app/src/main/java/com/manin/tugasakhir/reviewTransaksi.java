package com.manin.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class reviewTransaksi extends AppCompatActivity {
    Bundle bundle=null;
    AppCompatTextView textViewtotal=null;
    AppCompatButton btntutup=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_transaksi);
        bundle=getIntent().getExtras();
        deklarsi();
        tampiltotal();
        kliktutup();
    }

    private void kliktutup() {
        btntutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Kembali ke home", Toast.LENGTH_LONG).show();
                Intent a=new Intent (reviewTransaksi.this,MainActivity.class);
                startActivity(a);
                finish();
            }
        });
    }

    private void tampiltotal() {
        if(bundle!=null){
            textViewtotal.setText(bundle.getString("data1"));

        }
        else {}
    }

    private void deklarsi() {
        textViewtotal=findViewById(R.id.id_text_view);
        btntutup=findViewById(R.id.id_button_tutup);


    }
}
