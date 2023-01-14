package com.example.android.musicplayer;

public class Word {

    private String mSongName;

    private String mArtistName;

    public Word (String songName, String ArtistName) {
        mSongName = songName;
        mArtistName = ArtistName;
    }

    public String getSongName() {return mSongName;}
    public String getArtistName() {return mArtistName;}
}
