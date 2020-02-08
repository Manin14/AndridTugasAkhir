package com.manin.tugasakhir;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.manin.tugasakhir.Adapter.adapterPromo;
import com.manin.tugasakhir.komponenMenuToolBar.akun;
import com.manin.tugasakhir.komponenMenuToolBar.cari;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView_penampung;
    ArrayList<Integer> daftarPromo;
    adapterPromo adapterbaru = null;

    AppCompatImageView imgsayur,imgbuku,imgproperti=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deklarssi();
        kliksayur();
        klikbuku();
        klikproperti();
    }

    private void deklarssi() {
        recyclerView_penampung=findViewById(R.id.id_recyler_view);
        daftarPromo=new ArrayList<>();
        daftarPromo.clear();
            daftarPromo.add(R.drawable.promo1);
            daftarPromo.add(R.drawable.promo2);
            daftarPromo.add(R.drawable.promo3);
            generatePromo(daftarPromo);


            imgsayur=findViewById(R.id.id_image_nav_satu);
            imgbuku=findViewById(R.id.id_image_nav_dua);
            imgproperti=findViewById(R.id.id_image_nav_tiga);
    }

    private void generatePromo(ArrayList<Integer> daftarPromo) {
        if (daftarPromo != null) {
           adapterbaru = new adapterPromo(MainActivity.this, daftarPromo);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);

            recyclerView_penampung.setAdapter(adapterbaru);
            recyclerView_penampung.setLayoutManager(layoutManager);
          adapterbaru.notifyDataSetChanged();

        } else {
            // tampilToast("data tidak ditemukan");
            Toast.makeText(getApplicationContext(), "Ini adalah contoh Toast di Android",Toast.LENGTH_LONG).show();
        }



    }


    private void kliksayur(){
        imgsayur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Sayur", Toast.LENGTH_LONG).show();
                Intent a=new Intent (MainActivity.this,detailSayur.class);
                startActivity(a);
                finish();
            }
        });
    }

    private void klikbuku(){
        imgbuku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Buku", Toast.LENGTH_LONG).show();
                Intent b=new Intent (MainActivity.this,detailBuku.class);
                startActivity(b);
                finish();
            }
        });
    }

    private void klikproperti(){
        imgproperti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Properti", Toast.LENGTH_LONG).show();
                Intent b=new Intent (MainActivity.this,detailProperti.class);
                startActivity(b);
                finish();
            }
        });
    }

  //buat menu di tool bar,,akun, cari
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.akun,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case  R.id.id_item_akun:
                Toast.makeText(getApplicationContext(),"Akun", Toast.LENGTH_LONG).show();
                Intent b=new Intent (MainActivity.this, akun.class);
                startActivity(b);
               // finish();
                return true;
            case  R.id.id_item_cari:
                Toast.makeText(getApplicationContext(),"Cari", Toast.LENGTH_LONG).show();
                Intent beb=new Intent (MainActivity.this, cari.class);
                startActivity(beb);
               // finish();
                return true;

                default:  return super.onOptionsItemSelected(item);
        }




    }
}
