/*

25. Media Player 
Scenario: A media player can play both Audio and Video files. 
Problem Statement: 
● Interface AudioPlayer → method playAudio(String song) 
● Interface VideoPlayer → method playVideo(String movie) 
● Class MediaPlayer implements both → provides implementation for both methods 
Sample Input: 
Audio → song="Shape of You" 
Video → movie="Inception" 
Sample Output: 
Playing Audio: Shape of You 
Playing Video: Inception 

*/


interface AudioPlayer {
    void playAudio(String song);
}

interface VideoPlayer {
    void playVideo(String movie);
}

class MediaPlayer implements AudioPlayer, VideoPlayer {
    @Override
    public void playAudio(String song) {
        System.out.println("Playing Audio: " + song);
    }

    @Override
    public void playVideo(String movie) {
        System.out.println("Playing Video: " + movie);
    }
}

public class MediaTest {
    public static void main(String[] args) {
        MediaPlayer mp = new MediaPlayer();

        mp.playAudio("Shape of You");
        mp.playVideo("Inception");
    }
}

/*
C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>javac MediaTest.java

C:\Users\AKANKSHA\OneDrive\Desktop\cdac\Git hub repository\OOPJ ASSIGNMENT\OOPJ assignemtnt 3>java MediaTest
Playing Audio: Shape of You
Playing Video: Inception

*/
