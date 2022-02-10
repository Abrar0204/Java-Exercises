class TwelveDays {

     String getDayInString(int dayInNumber){
        String day = "";
        switch(dayInNumber){
            case 1:
                day = "first";
                break;
            case 2:
                day = "second";
                break;
            case 3:
                day = "third";
                break;
            case 4:
                day = "fourth";
                break;
            case 5:
                day = "fifth";
                break;
            case 6:
                day = "sixth";
                break;
            case 7:
                day = "seventh";
                break;
            case 8:
                day = "eighth";
                break;
            case 9:
                day = "ninth";
                break;
            case 10:
                day = "tenth";
                break;
            case 11:
                day = "eleventh";
                break;
            case 12:
                day = "twelfth";
                break;
        }
        return day;
    }

    String getItem(int day){
        String item = "";
        switch(day){
            case 1:
                item = "a Partridge in a Pear Tree";
                break;
            case 2:
                item = "two Turtle Doves";
                break;
            case 3:
                item = "three French Hens";
                break;
            case 4:
                item = "four Calling Birds";
                break;
            case 5:
                item = "five Gold Rings";
                break;
            case 6:
                item = "six Geese-a-Laying";
                break;
            case 7:
                item = "seven Swans-a-Swimming";
                break;
            case 8:
                item = "eight Maids-a-Milking";
                break;
            case 9:
                item = "nine Ladies Dancing";
                break;
            case 10:
                item = "ten Lords-a-Leaping";
                break;
            case 11:
                item = "eleven Pipers Piping";
                break;
            case 12:
                item = "twelve Drummers Drumming";
                break;
        }
        return item;
    }

    String verse(int verseNumber) {
        String dayInString = getDayInString(verseNumber);
        String verse_of_song = "On the " + dayInString + " day of Christmas my true love gave to me: ";

        for(int dayInNumber = verseNumber ; dayInNumber > 0 ; dayInNumber--) {
            verse_of_song += getItem(dayInNumber);
            verse_of_song += dayInNumber == 2 ? ", and " : dayInNumber == 1 ? "." : ", ";
        }
        verse_of_song += "\n";
        return verse_of_song;
    }

    String verses(int startVerse, int endVerse) {
        String verses_of_song = "";
        for(int verseNumber = startVerse ; verseNumber <=  endVerse ; verseNumber++){
            verses_of_song += verse(verseNumber);
            verses_of_song += verseNumber == endVerse ? "" : "\n";
        }
        return verses_of_song;
    }
    
    String sing() {
        String verses_of_song = "";
        for(int verseNumber = 1 ; verseNumber <=  12 ; verseNumber++){
            verses_of_song += verse(verseNumber);
            verses_of_song += verseNumber == 12 ? "" : "\n";
        }
        return verses_of_song;
    }
}
