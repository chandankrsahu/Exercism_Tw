class TwelveDays {
    //  private static String[] number = {
    //     "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
    // };
    // private static String[] gifts = {
    //     "twelve Drummers Drumming, ", "eleven Pipers Piping, ",
    //     "ten Lords-a-Leaping, ", "nine Ladies Dancing, ",
    //     "eight Maids-a-Milking, ", "seven Swans-a-Swimming, ",
    //     "six Geese-a-Laying, ", "five Gold Rings, ", "four Calling Birds, ",
    //     "three French Hens, ", "two Turtle Doves, and ",
    //     "a Partridge in a Pear Tree"
    // };
    // String verse(int verseNumber) {
    //    int n = verseNumber-1;
    //    int m = gifts.length - verseNumber;
    //    String s = 
    //    "On the " + number[n] + " day of Christmas my true love gave to me: ";

    //    for (int i=m;i<gifts.length;++i){
    //        s += gifts[i];
    //    }
    //    return s+".\n";
    // }

    // String verses(int startVerse, int endVerse) {
    //    String s = "";
    //    for (int i=startVerse;i<=endVerse;++i){
    //         s+=verse(i);
    //         if (i==endVerse) break;
    //         s+="\n";
    //    }
    //    return s;
    // }
    
    // String sing() {
    //     return verses(1, 12);
    // }


     private static String[] number = {
        "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
    };
    private static String[] xmasGifts={
       "twelve Drummers Drumming, ", "eleven Pipers Piping, ", "ten Lords-a-Leaping, ", "nine Ladies Dancing, ", "eight Maids-a-Milking, ", "seven Swans-a-Swimming, ","six Geese-a-Laying, " ,"five Gold Rings, " ,"four Calling Birds, ", "three French Hens, ", "two Turtle Doves, and " ,"a Partridge in a Pear Tree" 
    };
    String verse(int verseNumber) {
     String afterDay=" day of Christmas my true love gave to me: ";
        int x=verseNumber-1;
    String st="On the "+number[x]+afterDay;
    // if(verseNumber==1){
    //     return st+" a Partridge in a Pear Tree.";
    // }
        int l=xmasGifts.length-verseNumber;
    for(int i=l;i<xmasGifts.length;i++){
        st+=xmasGifts[i];
    }
    return st+".\n";
    }

    String verses(int startVerse, int endVerse) {
        String st="";
       for(int i=startVerse;i<=endVerse;i++){
           st+=verse(i);if(i==endVerse)break;st+="\n";
       }return st;
    }
    
    String sing() {
        return verses(1,12);
    }
}
