package com.example.nettech.scanqrcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
Button btngenerate,btnscan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btngenerate=findViewById(R.id.btngenerate);
        btnscan=findViewById(R.id.btnscan);

        btngenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,GenerateQRActivity.class);
                startActivity(intent);
            }
        });

        btnscan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,ScanQRActivity.class);
                startActivity(intent);
            }
        });
    }
}
