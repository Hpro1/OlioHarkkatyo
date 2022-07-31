package com.example.harkkatyo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Daniel Hadaya
 */

public class Rating {

    public String title;
    public String comment;
    public float rating;
    public LocalDateTime reviewDate;

    public Rating()
    {}

    public Rating(String title, String comment, float rating, LocalDateTime reviewDate)
    {
        this.title = title;
        this.comment = comment;
        this.rating = rating;
        this.reviewDate = reviewDate;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Otsikko=");
        sb.append(title);
        sb.append(", ");
        sb.append("Kommentti=");
        sb.append(comment);
        sb.append(", ");
        sb.append("Arvostelu=");
        sb.append(rating);
        sb.append(", ");
        sb.append("Päivämäärä=");
        sb.append(reviewDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));
        return sb.toString();
    }


}
