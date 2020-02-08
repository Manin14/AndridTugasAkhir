package com.manin.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

public class detailSayur extends AppCompatActivity {

    AppCompatButton btnbeli=null;
    AppCompatEditText edjumlah=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sayur);

        deklarasi();
        klikBeli();
    }

    private void klikBeli() {
        btnbeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"Beli", Toast.LENGTH_LONG).show();
                validasi();
                //Intent a=new Intent (detailSayur.this,reviewTransaksi.class);
                //startActivity(a);


            }
        });
    }

    private void deklarasi() {
        btnbeli=findViewById(R.id.id_button_beli);
        edjumlah=findViewById(R.id.id_edittext_jumlah);
    }

    private void validasi(){
      String input=null;
      input=edjumlah.getText().toString();

      if(TextUtils.isEmpty(input)){Toast.makeText(getApplicationContext(),"Jumlah tidak boleh kosong", Toast.LENGTH_LONG).show();}
      else {

          double p = Double.parseDouble(input);
         // double l = Double.parseDouble(lebar);
          double hasil = p * 20000;
          // Kemudian Hasil di tampilkan di TextView
         // txtLuas.setText("Hasil Luas  : " + hasil);
          Toast.makeText(getApplicationContext(),"Bayar ="+hasil, Toast.LENGTH_LONG).show();
          Intent intent = new Intent(detailSayur.this, reviewTransaksi.class);
          //intent.putExtra("data1", edjumlah.getText().toString());
          intent.putExtra("data1",Double.toString(hasil));
          startActivity(intent);
           finish();

      }
    }
}
