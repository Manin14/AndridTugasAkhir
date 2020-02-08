package com.manin.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    AppCompatEditText edusername,edpassword=null;
    AppCompatButton btnmasuk=null;

    private String username_constant="admin";
    private String password_constant="admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        deklarasi();
        klikmasuk();
    }

    private void klikmasuk() {
        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                prosesLogin(edusername.getText().toString(), edpassword.getText().toString());
            }
        });
    }

    private void deklarasi() {
        edusername=findViewById(R.id.id_ed_username);
        edpassword=findViewById(R.id.id_ed_password);
        btnmasuk=findViewById(R.id.id_btn_login);
    }

    private void prosesLogin (String username, String password){


        if(username==null){
            edusername.setError("username tidak boleh kosong");
        }
        else  if(password==null){
            edpassword.setError("passwordtidak boleh kosong");
        }
        else if (username.isEmpty()){
            edusername.setError("username tidak boleh kosong");
        }
        else if (password.isEmpty()){
            edpassword.setError("password tidak boleh kosong");
        }
        else if (username.equals(username_constant)&& password.equals(password_constant)){

            Intent m=new Intent(Login.this, MainActivity.class);
            startActivity(m);
            finish();


        }
        else {
            Toast.makeText(getApplicationContext(),"Sandi dan password salah",Toast.LENGTH_LONG).show();
        }

    }
}
