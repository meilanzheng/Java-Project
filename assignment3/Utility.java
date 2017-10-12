/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zheng.cis4110.assignment3;

/**
 *
 * @author mzheng
 * 
 */
public class Utility {
    /**
     * change numbers to English
     * @param num numbers of beers
     * @return numbers in English
     */
    public static String transNumToEnglish(int num){
        switch (num) {
            case 10:
                return "Ten";
            case 9:
                return "Nine";
            case 8:
                return "Eight";
            case 7:
                return "Seven";
            case 6:
                return "Six";
            case 5:
                return "Five";
            case 4:
                return "Four";
            case 3:
                return "Three";
            case 2:
                return "Two";
            case 1:
                return "One";
            case 0:
                return "Zero";
            default:
                return " ";
        }
            
                
    }
}
