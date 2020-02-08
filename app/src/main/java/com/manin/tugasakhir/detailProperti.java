package com.manin.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

public class detailProperti extends AppCompatActivity {

    AppCompatEditText edjmlProperti=null;
    AppCompatButton btnbeliProperti=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_properti);
        deklarsiProperti();
        klikbeliProperti();
    }

    private void klikbeliProperti() {
        btnbeliProperti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String input=null;
                input=edjmlProperti.getText().toString();

                if(TextUtils.isEmpty(input)){
                    Toast.makeText(getApplicationContext(),"Jumlah tidak boleh kosong", Toast.LENGTH_LONG).show();}
                else {

                    double p = Double.parseDouble(input);
                    // double l = Double.parseDouble(lebar);
                    double hasil = p * 200;
                    // Kemudian Hasil di tampilkan di TextView
                    // txtLuas.setText("Hasil Luas  : " + hasil);
                    Toast.makeText(getApplicationContext(),"Bayar ="+hasil+" Juta", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(detailProperti.this, reviewTransaksiProperti.class);
                    //intent.putExtra("data1", edjumlah.getText().toString());
                    intent.putExtra("dataInputProperti",Double.toString(hasil));
                    startActivity(intent);
                    finish();

                }
            }
        });
    }

    private void deklarsiProperti() {

        edjmlProperti=findViewById(R.id.id_edittext_jumlah_properti);
        btnbeliProperti=findViewById(R.id.id_button_beli_properti);
    }
}
