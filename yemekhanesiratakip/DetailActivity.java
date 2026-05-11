package com.example.yemekhanesiratakip; // Paket adın farklıysa burayı değiştirme

// Buradaki package satırına dokunma!
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tv = findViewById(R.id.txtNoteDetail);
        Button back = findViewById(R.id.btnBack);

        String gelenNot = getIntent().getStringExtra("kullanici_notu");
        tv.setText(gelenNot);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Sayfayı kapatır
            }
        });
    }
}