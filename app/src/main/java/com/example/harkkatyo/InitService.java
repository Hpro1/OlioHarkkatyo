package com.example.harkkatyo;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Daniel Hadaya
 * Etusivun nappuloiden funktiot
 */

public class InitService {

    public static void initialise(final AppCompatActivity ref)
    {

        //Avaa välilehti, jossa on arvostelut
        Button button = (Button) ref.findViewById(R.id.reviewView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ratingSite.currentMovie = MainActivity.selectedEvent.OriginalTitle;
                Intent it = new Intent(ref, ratingSite.class);
                ref.startActivity(it);
            }
        });

        //Avaa arvostelu välilehti
        button = (Button) ref.findViewById(R.id.List);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ref, displayView.class);
                ref.startActivity(it);
            }
        });

        try {
            finnkinoGet.setMovies(ref);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }



}
