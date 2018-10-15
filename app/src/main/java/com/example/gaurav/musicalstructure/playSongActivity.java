package com.example.gaurav.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class playSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);

        //creating a custom toolbar.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        toolbar.setTitle("Now Playing");
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        int albumArt = intent.getExtras().getInt("album art");
        String songName = intent.getExtras().getString("song name");
        String singerName = intent.getExtras().getString("singer name");

        TextView songname = (TextView) findViewById(R.id.songname);
        TextView singername = (TextView) findViewById(R.id.singername);
        ImageView albumart = (ImageView) findViewById(R.id.albumart);

        songname.setText(songName);
        singername.setText(singerName);
        albumart.setImageResource(albumArt);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }

}
