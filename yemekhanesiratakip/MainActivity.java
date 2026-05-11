package com.example.yemekhanesiratakip; // BURAYI KENDİ PAKET ADINLA DEĞİŞTİR VEYA DOKUNMA

// Buradaki package satırına dokunma!
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // İsimlerin XML ile aynı olması şart!
        EditText etNote = findViewById(R.id.editTextNote);
        Button btn = findViewById(R.id.btnSave);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String not = etNote.getText().toString();
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("kullanici_notu", not);
                startActivity(intent);
            }
        });
    }
}