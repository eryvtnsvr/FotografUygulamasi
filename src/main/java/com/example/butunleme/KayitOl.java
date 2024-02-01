package com.example.butunleme;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class KayitOl extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private Button kayitol;
    EditText isimText, soyisimText, emailText, sifreText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit_ol);

        mAuth = FirebaseAuth.getInstance();
        isimText = findViewById(R.id.isim);
        soyisimText = findViewById(R.id.soyisim);
        emailText = findViewById(R.id.email);
        sifreText = findViewById(R.id.sifre);
        kayitol= findViewById(R.id.kayitol);

        kayitol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String isim = isimText.getText().toString().trim();
                String soyisim = soyisimText.getText().toString().trim();
                String email = emailText.getText().toString().trim();
                String sifre = sifreText.getText().toString().trim();

                if (TextUtils.isEmpty(isim) || TextUtils.isEmpty(soyisim) || TextUtils.isEmpty(email) || TextUtils.isEmpty(sifre)) {
                    Toast.makeText(KayitOl.this, "Lütfen tüm alanları doldurun", Toast.LENGTH_SHORT).show();
                    return;
                }

                mAuth.createUserWithEmailAndPassword(email,sifre)
                        .addOnCompleteListener(KayitOl.this, task -> {
                            if(task.isSuccessful()){
                                Toast.makeText(KayitOl.this, "Kayıt Başarılı", Toast.LENGTH_SHORT).show();

                                FirebaseFirestore veritabani = FirebaseFirestore.getInstance();
                                Map<String, Object> kullanici = new HashMap<>();
                                kullanici.put("isim", isim);
                                kullanici.put("soyisim", soyisim);
                                veritabani.collection("kullanicilar").document(mAuth.getUid())
                                        .set(kullanici)
                                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                                            @Override
                                            public void onSuccess(Void unused) {
                                                Log.d(TAG, "iŞLEM BAŞARILI");
                                            }
                                        })
                                        .addOnFailureListener(new OnFailureListener() {
                                            @Override
                                            public void onFailure(@NonNull Exception e) {
                                                Log.w(TAG, "İŞLEMDE HATA OLDU");
                                            }
                                        });
                            }
                            else {
                                Exception e = task.getException();
                                if(e!=null){
                                    Toast.makeText(KayitOl.this, "Hata Oluştu "+e.getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

        Button girisyap = findViewById(R.id.girisyap);
        girisyap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(KayitOl.this, GirisYap.class);
                startActivity(intent2);
            }
        });
    }
}