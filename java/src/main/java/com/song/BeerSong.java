package com.song;

public class BeerSong {

    public String sing(int bottlesNumber, int versesNumber) {
        if (bottlesNumber == 0) {
            return "No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";
        }
        if (bottlesNumber ==1){
            return "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                    "Take it down and pass it around, no more bottles of beer on the wall.\n\n";
        }
        String frase = "%s bottles of beer on the wall, %s bottles of beer.\n" +
                "Take one down and pass it around, %s %s of beer on the wall.\n\n";
        String bottleWord = bottlesNumber == 2 ? "bottle" : "bottles";

        String result = String.format(frase, bottlesNumber, bottlesNumber, bottlesNumber-1, bottleWord);

        if (versesNumber == 2) {
            result += "98 bottles of beer on the wall, 98 bottles of beer.\n" + "Take one down and pass it around, 97 bottles of beer on the wall.\n\n";
        }
        if (versesNumber == 3) {
            result +="1 bottle of beer on the wall, 1 bottle of beer.\n" +
                    "Take it down and pass it around, no more bottles of beer on the wall.\n\n" +
                    "No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";
        }

        return result;
    }

    public String singSong() {
        return null;
    }
}