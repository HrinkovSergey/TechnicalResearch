package com.example.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListService {

    private List<String> playlist;

    private static final String SEPARATOR = "------------------";

    public void workWithLinkedList() {
        System.out.println("-----------------------\n    LinkedList:    \n-----------------------");
        add();
        insert();
        remove();
    }

    private void add() {
        // Using LinkedList to manage a playlist
        playlist = new LinkedList<>();

        // Add songs to the playlist
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        // Print the playlist
        System.out.println("Initial Playlist: " + playlist);

        // Add a new song to the beginning
        playlist.addFirst("BEGINNING");
        System.out.println("After adding a song at the beginning: " + playlist);

        // Add a new song to the end
        playlist.addLast("END");
        System.out.println("After adding a song at the end: " + playlist);
    }

    private void insert() {
        // Insert a song in the middle of the playlist
        playlist.add(3, "MIDDLE");
        System.out.println("After adding a song in the middle: " + playlist);
    }

    private void remove() {
        // Remove the first song
        playlist.removeFirst();
        System.out.println("After removing the first song: " + playlist);

        // Remove the last song
        playlist.removeLast();
        System.out.println("After removing the last song: " + playlist);

        // Remove a song from the middle
        playlist.remove("MIDDLE");
        System.out.println("After removing a song from the middle: " + playlist + "\n" + SEPARATOR);
    }
}
