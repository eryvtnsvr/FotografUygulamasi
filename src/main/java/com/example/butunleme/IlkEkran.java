package com.example.butunleme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class IlkEkran extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilk_ekran);

        FirebaseUser son_kullanici = FirebaseAuth.getInstance().getCurrentUser();
        if(son_kullanici!=null){
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }

        Button giris = findViewById(R.id.giris);
        giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IlkEkran.this, GirisYap.class);
                startActivity(intent);
            }
        });

        Button kayit = findViewById(R.id.kayit);
        kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IlkEkran.this, KayitOl.class);
                startActivity(intent);
            }
        });

    }
}