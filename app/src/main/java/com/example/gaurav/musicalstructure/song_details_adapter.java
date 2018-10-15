package com.example.gaurav.musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class song_details_adapter extends ArrayAdapter<song_details> {

    public song_details_adapter(Activity context, ArrayList<song_details> songDetails) {
        super(context, 0, songDetails);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        song_details current_song_details = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID version_name
        ImageView albumImageView = (ImageView) listItemView.findViewById(R.id.album_img);
        albumImageView.setImageResource(current_song_details.getSongAlbumResourceId());

        // Find the TextView in the list_item.xml layout with the song name
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name);
        songNameTextView.setText(current_song_details.getSongName());

        // Find the TextView in the list_item.xml layout with the singer name.
        TextView singerNameTextView = (TextView) listItemView.findViewById(R.id.singer_name);
        singerNameTextView.setText(current_song_details.getSingerName());

        // Find the TextView in the list_item.xml layout with the song duration
        TextView songDurationTextView = (TextView) listItemView.findViewById(R.id.song_duration);
        songDurationTextView.setText(current_song_details.getSongDuration());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;


    }
}
