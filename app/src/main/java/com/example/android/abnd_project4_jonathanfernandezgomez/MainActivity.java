package com.example.android.abnd_project4_jonathanfernandezgomez;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView library_awm1 = findViewById(R.id.awesome_mix_1_text_view);

        library_awm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent awm1Intent = new Intent(MainActivity.this, AwesomeMix1Activity.class);

                startActivity(awm1Intent);
            }
        });

        TextView library_gpm = findViewById(R.id.get_psyched_mix_text_view);

        library_gpm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent gpmIntent = new Intent(MainActivity.this, GetPshychedMixActivity.class);

                startActivity(gpmIntent);
            }
        });

    }
}