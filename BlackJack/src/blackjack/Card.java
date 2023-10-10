/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

/**
 * playing card with a suit and a value.
 * The value of cards is defined as follows: Ace (1), Jack-King (11-13).
 * This class provides methods to get the card's value, suit, and a string representation.
 * @author aarzoo
 * @date 09-10-23
 */

public class Card {
    private Suit suit;
    private int value; 
    
    /**
     * @param suit The suit of the card (e.g., Hearts, Diamonds, etc.).
     * @param value The value of the card (1 for Ace, 2-10, 11 for Jack, 12 for Queen, 13 for King).
     */
    
    public Card(Suit suit, int value ){
        this.suit = suit;
        
        if (value >= 1 && value<=13){
            this.value = value;
        }else {
            System.out.println(value + "is not a valid Card Value ");
            System.exit(1);

        }
    }
    /**
     * Gets the value of the card.
     * @return The card's value.
     */
    
    public int getValue(){
        return value;
    }
    
    /**
     * Gets the suit of the card.
     * @return The card's suit.
     */
    
    public Suit getsuit(){
        return suit;
    }
    
    @Override
    public String toString(){
        String num = "Error";
        
        switch(this.value){
                case 1:
                num = "Ace";
                break;
        
                case 2:
                num = "Two";
                break;
                
                case 3:
                num = "Three";
                break;
        
                case 4:
                num = "Four";
                break;
        
                case 5:
                num = "Five";
                break;
        
                case 6:
                num = "six";
                break;
        
                case 7:
                num = "Seven";
                break;
        
                case 8:
                num = "Eight";
                break;
        
                case 9:
                num = "Nine";
                break;
        
                case 10:
                num = "Ten";
                break;
        
                case 11:
                num = "Jack";
                break;
        
                case 12:
                num = "Queen";
                break;
        
                case 13:
                num = "King";
                break;
                
                
        }
        return num + " of " + suit.toString(); 
        
     /**
     * Generates a string representation of the card.
     * @return A string in the format "Value of Suit" (e.g., "Ace of Hearts").
     */
        }
        
        }
    

