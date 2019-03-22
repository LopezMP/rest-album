package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public class Album {
    private String name;
    private String id;
    private LinkedList<Track> track;

    public Album(){this.id= RandomUtils.getId();}

    public Album (String id, String name, LinkedList<Track> track){
        this();
        this.name = name;
        this.track = track;
    }
    public String getName() {
        return name;
    }

    public LinkedList<Track> getTrack() {
        return track;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTrack(LinkedList<Track> track) {
        this.track = track;
    }
}
