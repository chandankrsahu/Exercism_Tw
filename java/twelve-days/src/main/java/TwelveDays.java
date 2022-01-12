class TwelveDays {
   

     private static String[] number = {
        "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
    };
    private static String[] xmasGifts={
       "twelve Drummers Drumming, ", "eleven Pipers Piping, ", "ten Lords-a-Leaping, ", "nine Ladies Dancing, ", "eight Maids-a-Milking, ", "seven Swans-a-Swimming, ","six Geese-a-Laying, " ,"five Gold Rings, " ,"four Calling Birds, ", "three French Hens, ", "two Turtle Doves, and " ,"a Partridge in a Pear Tree." 
    };
    String verse(int verseNumber) {
     String afterDay=" day of Christmas my true love gave to me: ";
       
    String st="On the "+number[verseNumber-1]+afterDay;
    // if(verseNumber==1){
    //     return st+" a Partridge in a Pear Tree.";
    // }
        
    for(int i=12-verseNumber;i<12;i++){
        st+=xmasGifts[i];
    }
    return st+"\n";
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
