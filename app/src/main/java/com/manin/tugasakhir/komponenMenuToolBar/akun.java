package com.manin.tugasakhir.komponenMenuToolBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.manin.tugasakhir.MainActivity;
import com.manin.tugasakhir.R;

public class akun extends AppCompatActivity {

    AppCompatButton bbtnkembali=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);

        deklarasi();
        klikkembali();
    }

    private void klikkembali() {
        bbtnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Kembali",Toast.LENGTH_LONG).show();
                Intent a=new Intent (akun.this, MainActivity.class);
                startActivity(a);
                finish();
            }
        });
    }

    private void deklarasi() {
        bbtnkembali=findViewById(R.id.id_button_kembali_akun);
    }
}
