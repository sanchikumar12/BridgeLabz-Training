package com.linkedlist.singlylinkedlist;

class SongNodee {
    String songName;
    String artist;
    double duration;
    SongNode next;
    SongNode prev; 

    public SongNodee(String songName, String artist, double duration) {
        this.songName = songName;
        this.artist = artist;
        this.duration = duration;
        this.next = this; 
        this.prev = this; 
    }
}

class Playlist {
    private SongNode head = null;
    private SongNode current = null;


    public void addAtBeginning(String name, String artist, double duration) {
        SongNode newNode = new SongNode(name, artist, duration);

        if (head == null) {
            head = newNode;
            current = head;
            return;
        }

        SongNode last = head.prev;

        newNode.next = head;
        newNode.prev = last;

        last.next = newNode;
        head.prev = newNode;

        head = newNode;
    }

    // Add at end
    public void addAtEnd(String name, String artist, double duration) {
        if (head == null) {
            addAtBeginning(name, artist, duration);
            return;
        }

        SongNode newNode = new SongNode(name, artist, duration);
        SongNode last = head.prev;

        newNode.next = head;
        newNode.prev = last;

        last.next = newNode;
        head.prev = newNode;
    }

    // Add at specific position (1-indexed)
    public void addAtPosition(String name, String artist, double duration, int pos) {
        if (pos <= 1 || head == null) {
            addAtBeginning(name, artist, duration);
            return;
        }

        SongNode temp = head;
        int count = 1;

        while (count < pos - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        if (temp.next == head) {
            addAtEnd(name, artist, duration);
            return;
        }

        SongNode newNode = new SongNode(name, artist, duration);

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Delete song by name
    public void deleteSong(String name) {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        SongNode temp = head;

        // If head needs to be deleted
        if (temp.songName.equals(name)) {

            if (temp.next == head) { // only one element
                head = null;
                current = null;
                return;
            }

            SongNode last = head.prev;
            head = head.next;

            last.next = head;
            head.prev = last;

            if (current == temp) current = head;
            return;
        }

        // For any other node
        SongNode prev = null;
        do {
            prev = temp;
            temp = temp.next;

            if (temp.songName.equals(name)) {
                prev.next = temp.next;
                temp.next.prev = prev;

                if (current == temp) current = temp.next;

                return;
            }
        } while (temp != head);

        System.out.println("Song not found.");
    }

    // Play next song
    public void playNext() {
        if (current != null) {
            current = current.next;
            System.out.println("Playing: " + current.songName);
        }
    }

    // Play previous song
    public void playPrevious() {
        if (current != null) {
            current = current.prev;
            System.out.println("Playing: " + current.songName);
        }
    }

    // Display playlist
    public void display() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        SongNode temp = head;
        System.out.println("Playlist:");
        do {
            System.out.println("🎵 " + temp.songName + " | " + temp.artist + " | " + temp.duration + " min");
            temp = temp.next;
        } while (temp != head);
    }
}

public class SongNodee {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addAtEnd("Believer", "Imagine Dragons", 3.2);
        playlist.addAtEnd("Perfect", "Ed Sheeran", 4.1);
        playlist.addAtBeginning("Numb", "Linkin Park", 3.0);

        playlist.display();
        System.out.println();

        playlist.playNext();
        playlist.playNext();
        playlist.playPrevious();

        System.out.println("\nDeleting 'Perfect'...\n");
        playlist.deleteSong("Perfect");
        playlist.display();
    }
}
