package com.example.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    /**Resource Id for background color for this list of words */
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent,false);
        }
        //return super.getView(position, convertView, parent);
        Word currentWord = getItem(position);

        TextView defaultTranslation = listItemView.findViewById(R.id.default_text_view);
        defaultTranslation.setText(currentWord.getDefaultTranslation());

        TextView miwokTranslation = listItemView.findViewById(R.id.miwok_text_view);
        miwokTranslation.setText(currentWord.getMiwokTranslation());

        ImageView imageView = listItemView.findViewById(R.id.image_view);
        //imageView.setImageResource(currentWord.getImageResourceId());

        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else
            imageView.setVisibility(View.GONE);

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;

    }

}
