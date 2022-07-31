package com.example.harkkatyo;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Daniel Hadaya
 * Arvostelunäkymä
 */

public class displayView extends AppCompatActivity {

    private List<Rating> ratings;

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.listlayout);

        this.ratings  = ratingSite.getRatingFileContent(this.getBaseContext());

        TableLayout ratingEntries = findViewById(R.id.ratingEntries);
        TableRow tr = new TableRow(this);

        TextView title = new TextView(this);
        title.setText("Otsikko");
        title.setTextColor(Color.BLACK);
        title.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG | Paint.FAKE_BOLD_TEXT_FLAG);
        tr.addView(title);

        TextView comment = new TextView(this);
        comment.setPadding(0, 0, 4, 0);
        comment.setText("Kommentti");
        comment.setTextColor(Color.BLACK);
        comment.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG | Paint.FAKE_BOLD_TEXT_FLAG);
        tr.addView(comment);

        TextView ratingTH = new TextView(this);
        ratingTH.setPadding(8,0,4,0);
        ratingTH.setText("Arvostelu");
        ratingTH.setTextColor(Color.BLACK);
        ratingTH.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG | Paint.FAKE_BOLD_TEXT_FLAG);
        tr.addView(ratingTH);

        TextView reviewDate = new TextView(this);
        reviewDate.setPadding(8,0,4,0);
        reviewDate.setText("Päivämäärä");
        reviewDate.setTextColor(Color.BLACK);
        reviewDate.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG | Paint.FAKE_BOLD_TEXT_FLAG);
        tr.addView(reviewDate);

        ratingEntries.addView(tr);

        for(Rating rating : ratings)
        {
            TableRow row = new TableRow(this);
            TextView titleTD = new TextView(this);
            TextView commentTD = new TextView(this);
            TextView ratingTD = new TextView(this);
            TextView reviewDateTD = new TextView(this);

            titleTD.setText(rating.title);
            commentTD.setText(rating.comment);
            ratingTD.setText(rating.rating+"");
            reviewDateTD.setText(rating.reviewDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy - HH:mm:ss")));
            row.addView(titleTD);
            row.addView(commentTD);
            row.addView(ratingTD);
            row.addView(reviewDateTD);
            ratingEntries.addView(row);
        }

        button = (Button) findViewById(R.id.Return);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEntry();
            }
        });
    }

    public void openEntry() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}