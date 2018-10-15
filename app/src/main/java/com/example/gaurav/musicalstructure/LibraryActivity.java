package com.example.gaurav.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        //creating a custom toolbar.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string._library);
        setSupportActionBar(toolbar);

        final ArrayList<song_details> songDetails = new ArrayList<song_details>();
        songDetails.add(new song_details(R.drawable.palpal, "Pal Pal... Har Pal", "Sonu Nigam", "4:24"));
        songDetails.add(new song_details(R.drawable.girlslikeyou, "Girls Like You", "Maroon 5, Cardi B", "3:35"));
        songDetails.add(new song_details(R.drawable.youaremysonia, "You Are My Sonia", "Sonu Nigam", "5:14"));
        songDetails.add(new song_details(R.drawable.kemcho, "Kem Cho", "Ikka, Jyotica Tangri", "3:32"));
        songDetails.add(new song_details(R.drawable.lailalaila, "Laila Laila", "Amit Trivedi", "3:45"));
        songDetails.add(new song_details(R.drawable.woladki, "Wo Ladki", "Arijit Singh", "4:56"));
        songDetails.add(new song_details(R.drawable.pal, "Pal", "Arijit Singh", "4:36"));
        songDetails.add(new song_details(R.drawable.dodin, "Do Din", "Darshan Raval", "4:16"));
        songDetails.add(new song_details(R.drawable.kamariya, "Kamariya", "Aastha Gill", "4:19"));
        songDetails.add(new song_details(R.drawable.merapyarterapyar, "Mera Pyar Tera Pyar", "Jeet Gannguli", "3:26"));
        songDetails.add(new song_details(R.drawable.nainada, "Naina Da Kya Kasoor", "Amit Trivedi", "4:17"));
        songDetails.add(new song_details(R.drawable.thenight, "The Night We Met", "Lord Huron", "4:29"));

        song_details_adapter adapter = new song_details_adapter(this, songDetails);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(LibraryActivity.this, playSongActivity.class);
                intent.putExtra("album art", songDetails.get(position).getSongAlbumResourceId());
                intent.putExtra("song name", songDetails.get(position).getSongName());
                intent.putExtra("singer name", songDetails.get(position).getSingerName());
                startActivity(intent);
            }
        });

    }
}
