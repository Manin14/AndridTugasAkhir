package com.manin.tugasakhir.komponenMenuToolBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Toast;

import com.manin.tugasakhir.AdapterCari.adapterbuku;
import com.manin.tugasakhir.MainActivity;
import com.manin.tugasakhir.R;


import java.util.ArrayList;

public class cari extends AppCompatActivity {
    ArrayList<Integer> daftarbuku;

    AppCompatEditText edCari = null;
    RecyclerView recyclerView=null;
    adapterbuku book=null;


   AppCompatButton btnkambali=null;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari);


      deklarasi();
      klikkembali();


    }

    private void klikkembali() {
        btnkambali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Kembali",Toast.LENGTH_LONG).show();
                Intent a=new Intent (cari.this, MainActivity.class);
                startActivity(a);
                finish();
            }
        });
    }


    void deklarasi(){

        edCari = findViewById(R.id.id_editText_cari);
      recyclerView=findViewById(R.id.id_Rv_cari);
      btnkambali=findViewById(R.id.id_button_kembali_cari);


        daftarbuku=new ArrayList<>();
        daftarbuku.clear();
        daftarbuku.add(R.mipmap.buku);
        daftarbuku.add(R.mipmap.sayuran);
        daftarbuku.add(R.mipmap.properti);
        generatebuku( daftarbuku);



    }

    private void generatebuku (ArrayList<Integer> daftarbuku) {

        if (daftarbuku != null) {
            book= new adapterbuku(cari.this, daftarbuku);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(cari.this, LinearLayoutManager.VERTICAL, false);

            recyclerView.setAdapter(book);
            recyclerView.setLayoutManager(layoutManager);
            book.notifyDataSetChanged();

        } else {
            // tampilToast("data tidak ditemukan");
            Toast.makeText(getApplicationContext(), "Ini adalah contoh Toast di Android",Toast.LENGTH_LONG).show();
        }
    }

}



