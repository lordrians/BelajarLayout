package com.example.belajarlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout llAyamBakar, llIkanBakar, llRendang;
    TextView tvAyamBakar, tvIkanBakar, tvRendang;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llAyamBakar = findViewById(R.id.ll_ayam_bakar);
        llIkanBakar = findViewById(R.id.ll_ikan_bakar);
        llRendang = findViewById(R.id.ll_rendang);

        tvAyamBakar = findViewById(R.id.tv_ayam_bakar);
        tvIkanBakar = findViewById(R.id.tv_ikan_bakar);
        tvRendang = findViewById(R.id.tv_rendang);

        llAyamBakar.setOnClickListener(this);
        llIkanBakar.setOnClickListener(this);
        llRendang.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ll_ayam_bakar:
                toMain(tvAyamBakar.getText().toString());
                break;

            case R.id.ll_ikan_bakar:
                toMain(tvIkanBakar.getText().toString());
                break;

            case R.id.ll_rendang:
                toMain(tvRendang.getText().toString());
                break;
        }
    }

    private void toMain(String pesanan) {
        Intent intent = new Intent(MainActivity.this, OrderActivity.class);
        intent.putExtra("pesanan", pesanan);
        startActivity(intent);
    }
}
