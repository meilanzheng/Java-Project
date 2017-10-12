/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zheng.cis4110.assignment3;

import java.util.Scanner;

/**
 *
 * @author mzheng
 */
public class ZhengCIS4110Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        /**
         * maximum numbers of beers and place entered by user
         * return entire song
         */
        int maxNum;
        String place;
        
        System.out.println("Enter a number between 0-10 ");
        maxNum=Integer.parseInt(input.nextLine());
        
        System.out.println("Enter a place ");
        place=input.nextLine();
        
       
        BeerSong BeerSongObj= new BeerSong(maxNum, place);
        BeerSong BeerSongObj2= new BeerSong(maxNum, place);
        BeerSongObj.toString();
        
        System.out.println(BeerSong.getNumSongs() + "beer songs have been created");
    }
    
}
