package edu.upc.dsa.models;

import java.awt.*;
import java.util.LinkedList;

public class Autor {
    private String name;
    private LinkedList<Track> Track;

    public Autor(String name, LinkedList Track ){
        this.name=name;
        this.Track=Track;
    }

    public LinkedList<edu.upc.dsa.models.Track> getTrack() {
        return Track;
    }

    public String getName() {
        return name;
    }

    public void setTrack(LinkedList<edu.upc.dsa.models.Track> track) {
        Track = track;
    }

    public void setName(String name) {
        this.name = name;
    }
}
