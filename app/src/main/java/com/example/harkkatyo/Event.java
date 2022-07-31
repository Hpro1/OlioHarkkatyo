package com.example.harkkatyo;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


/**
 * Daniel Hadaya
 * Hae XML tiedostosta Event
 * */

@Root(name="Event", strict = false)
public class Event {


    @Element
    public String OriginalTitle;

    @Override
    public String toString()
    {
        return OriginalTitle;
    }

}
