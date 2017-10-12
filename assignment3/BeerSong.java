/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zheng.cis4110.assignment3;

/**
 *
 * @author mzheng
 */
public class BeerSong {
    /**
     * @maxNumOfBeer maximum numbers of beers entered 
     * @placeBeerHangOn place where beer bottle hang on
     * return Beersong
     */
    private int maxNumOfBeer;
    private String placeBeerHangOn;
    private static int numSongs=0;
   
    public BeerSong(int maxNum, String placeBeerHangOn){
    maxNumOfBeer = maxNum;
    this.placeBeerHangOn = placeBeerHangOn;
     setNumSongs();
    }
    
/**
 * This function set MaxNumOfBeer and increment numbers of songs
 * @param maxNumOfBeer 
 */
    public void setNumSongs(){
    numSongs++;
}



public static int getNumSongs(){
    /**
     * this method return incremented numbers of songs
     */
    return numSongs;
}


//public void printSong(){
    /**
     * this method decrement the remaining number of bottles of beers on the wall
     */
public String toString() {
    String s = "";
        for(int i = maxNumOfBeer;i>=0;i--)
            s += lyricBlock(i, placeBeerHangOn);
    return s;
}

public String lyricBlock(int numOfBeer, String place){
    /**
     * this method return a block of the Beersong
     */
        System.out.println("\n" + Utility.transNumToEnglish(numOfBeer) + " bottles of beers on the " +place + ",");
        System.out.println("take one down, pass it around");
        System.out.println(Utility.transNumToEnglish(numOfBeer-1) + " bottles of beers on the " +place + "\n");
        return "\n" + Utility.transNumToEnglish(numOfBeer) + " bottles of beers on the " + place + "," 
                + "take one down, pass it around\n" + 
                Utility.transNumToEnglish(numOfBeer-1) + " bottles of beers on the " +place + "\n";
    }
    
}

