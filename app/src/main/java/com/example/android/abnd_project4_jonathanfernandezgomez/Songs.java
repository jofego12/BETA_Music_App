package com.example.android.abnd_project4_jonathanfernandezgomez;

public class Songs {


    private String mSongName;

    private String mAuthorName;

    public Songs(String songName, String authorName) {
        mSongName = songName;
        mAuthorName = authorName;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getAuthorName() {
        return mAuthorName;
    }
}