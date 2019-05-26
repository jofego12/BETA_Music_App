package com.example.android.abnd_project4_jonathanfernandezgomez;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {

    @NonNull
    private static final String LOG_TAG = SongsAdapter.class.getSimpleName();

    public SongsAdapter(Activity context, ArrayList<Songs> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.library_items, parent, false);
        }

        Songs currentSong = getItem(position);

        TextView songTextView = listItemView.findViewById(R.id.song_name);
        songTextView.setText(currentSong.getSongName());

        TextView authorTextView = listItemView.findViewById(R.id.author_name);
        authorTextView.setText(currentSong.getAuthorName());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}