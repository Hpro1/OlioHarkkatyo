package com.example.harkkatyo;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;

/**
 * Daniel Hadaya
 * XML Tiedoston header
 */

@Root(name="Events", strict=false)
public class Events {

    @ElementList(inline = true)
    public List<Event> events;





}