package com.manin.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

public class detailBuku extends AppCompatActivity {

    AppCompatEditText edjmlhYangDibeli=null;
    AppCompatButton btnBeli=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buku);
        deklarasi();
        klikbeli();
    }

    private void klikbeli() {
      btnBeli.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              validsiData();
          }
      });
    }

    private void deklarasi() {
        edjmlhYangDibeli=findViewById(R.id.id_edit_text_jmlah_buku);
        btnBeli=findViewById(R.id.id_button_beli_buku);
    }

    private void validsiData(){

        String input=null;
        input=edjmlhYangDibeli.getText().toString();

        if(TextUtils.isEmpty(input)){
            Toast.makeText(getApplicationContext(),"Jumlah tidak boleh kosong", Toast.LENGTH_LONG).show();}
        else {

            double p = Double.parseDouble(input);

            double hasil = p * 35000;

            Toast.makeText(getApplicationContext(),"Bayar ="+hasil, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(detailBuku.this, reviewTransaksiBuku.class);
            //intent.putExtra("data1", edjumlah.getText().toString());
            intent.putExtra("dataInisial",Double.toString(hasil));
            startActivity(intent);
            finish();

        }
    }
}
