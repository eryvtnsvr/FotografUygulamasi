package com.example.butunleme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class GirisYap extends AppCompatActivity {

    EditText emailText, sifreText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris_yap);

        emailText = findViewById(R.id.email2);
        sifreText = findViewById(R.id.sifre2);

        Button giris_yap = findViewById(R.id.giris_yap);
        giris_yap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailText.getText().toString().trim();
                String sifre = sifreText.getText().toString().trim();

                FirebaseAuth mAuth = FirebaseAuth.getInstance();

                mAuth.signInWithEmailAndPassword(email,sifre)
                        .addOnCompleteListener(GirisYap.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    Toast.makeText(GirisYap.this, "Başarılı bir şekilde giriş yapıldı", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(GirisYap.this, MainActivity.class);
                                    startActivity(intent);
                                }
                                else {
                                    Toast.makeText(GirisYap.this, "Giriş Yapılamadı", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

            }
        });

        Button kayit_ol = findViewById(R.id.kayit_ol);
        kayit_ol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(GirisYap.this, KayitOl.class);
                startActivity(intent2);
            }
        });
    }
}