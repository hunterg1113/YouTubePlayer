package com.example.huntergreer.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnInApp).setOnClickListener(this);
        findViewById(R.id.btnStandalone).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        int id = v.getId();

        if (id == R.id.btnInApp) intent = new Intent(this, YoutubeActivity.class);
        else if (id == R.id.btnStandalone) intent = new Intent(this, StandaloneActivity.class);

        if (intent != null) startActivity(intent);
    }
}
