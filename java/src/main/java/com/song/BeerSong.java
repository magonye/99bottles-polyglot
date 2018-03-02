package com.song;

public class BeerSong {

    public String sing(int bottlesNumber, int versesNumber) {
        if (bottlesNumber ==1){
            return "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                    "Take it down and pass it around, no more bottles of beer on the wall.\n\n";
        }
        String frase = "%s bottles of beer on the wall, %s bottles of beer.\n" +
                "Take one down and pass it around, %s %s of beer on the wall.\n\n";
        String bottleWord = bottlesNumber == 2 ? "bottle" : "bottles";

        return String.format(frase, bottlesNumber, bottlesNumber, bottlesNumber-1, bottleWord);
    }

    public String singSong() {
        return null;
    }
}