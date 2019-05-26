package com.example.android.abnd_project4_jonathanfernandezgomez;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AwesomeMix1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library);

        ArrayList<com.example.android.abnd_project4_jonathanfernandezgomez.Songs> songs = new ArrayList<>();
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("Hooked on a Feeling", "Blue Swede"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("All the Way", "Raspberries"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("Spirit in the Sky", "Norman Greenbaum"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("Moonage Daydream", "David Bowie"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("Fooled Around and Fell in Love", "Elvin Bishop"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("I Want You Back", "The Jackson 5"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("I'm Not in Love", "10cc"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("Come and Get Your Love", "Redbone"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("Cherry Bomb", "The Runaways"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("Escape (The Piña Colada Song)", "Rupert Holmes"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("O-o-h Child", "Five Stairsteps"));
        songs.add(new com.example.android.abnd_project4_jonathanfernandezgomez.Songs("Ain't No Mountain High Enough", "Marvin Gaye and Tammi Terrell"));

        SongsAdapter adapter = new SongsAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
        TextView rockButton = findViewById(R.id.lets_rock_button);

        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rockButtonIntent = new Intent(AwesomeMix1Activity.this, PlayingScreen.class);
                startActivity(rockButtonIntent);
            }
        });
    }
}
