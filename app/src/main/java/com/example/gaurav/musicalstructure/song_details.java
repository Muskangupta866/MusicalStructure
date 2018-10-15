package com.example.gaurav.musicalstructure;

public class song_details {

    //gives the resource id for song album.
    private int mSongAlbumResourceId;

    //gives the song name.
    private String mSongName;

    //gives the singer name.
    private String mSingerName;

    //gives the song duration.
    private String mSongDuration;


    public song_details(int SongAlbumResourceId, String SongName, String SingerName, String SongDuration) {
        mSongAlbumResourceId = SongAlbumResourceId;
        mSongName = SongName;
        mSingerName = SingerName;
        mSongDuration = SongDuration;
    }

    //get the song album resource id by calling this method.
    public int getSongAlbumResourceId() {
        return mSongAlbumResourceId;
    }

    //get the song name by calling this method.
    public String getSongName() {
        return mSongName;
    }

    //get the singer name by calling this method.
    public String getSingerName() {
        return mSingerName;
    }

    //get the song duration by calling this method.
    public String getSongDuration() {
        return mSongDuration;
    }


}
