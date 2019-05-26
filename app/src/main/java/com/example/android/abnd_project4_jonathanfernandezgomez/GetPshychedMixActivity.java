package com.example.android.abnd_project4_jonathanfernandezgomez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class GetPshychedMixActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library);

        ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("You Give Love A Bad Name", "Bon Jovi"));
                        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("I Wanna Rock", "Twisted Sister"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("Lick It Up", "Kiss"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("Paradise City", "Guns'N'Roses"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("Dancing with Myself","Billy Idol"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("Rock You Like a Hurricane","The Scorpions"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("Panama", "Van Halen"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("Talk Dirty to Me","Poison"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("Cherry Bomb", "The Runaways"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("Dr. Feelgood","Mötley Crüe"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("Round and Round","Ratt"));

        SongsAdapter adapter = new SongsAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
        TextView rockButton = findViewById(R.id.lets_rock_button);

        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rockButtonIntent = new Intent(GetPshychedMixActivity.this, PlayingScreen.class);
                startActivity(rockButtonIntent);
            }
        });
    }
}
