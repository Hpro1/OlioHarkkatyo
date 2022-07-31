package com.example.harkkatyo;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Daniel Hadaya
 */

public class eventListener extends Activity implements AdapterView.OnItemSelectedListener {

    private AppCompatActivity parent;

    public eventListener()
    {}

    public eventListener(AppCompatActivity parent)
    {
        this.parent = parent;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Event event = (Event) adapterView.getItemAtPosition(i);
        System.out.println("Olet valinnut: "+event.OriginalTitle);
        MainActivity.selectedEvent = event;
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}