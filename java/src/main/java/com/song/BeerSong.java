package com.song;

public class BeerSong {

    public String sing(int bottlesNumber, int versesNumber) {
        String frase = "%s bottles of beer on the wall, %s bottles of beer.\n" +
                "Take one down and pass it around, %s %s of beer on the wall.\n\n";
        String bottleWord = bottlesNumber == 2 ? "bottle" : "bottles";

        return String.format(frase, bottlesNumber, bottlesNumber, bottlesNumber-1, bottleWord);
    }

    public String singSong() {
        return null;
    }
}