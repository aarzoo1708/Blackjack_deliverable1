/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

/**
 *
 * @author User
 */
public class Card {
    private Suit suit;
    private int value; // value of the cards is where Ace:1, jack-King = 11-13

    public Card(Suit suit, int value ){
        this.suit = suit;
        
        if (value >= 1 && value<=13){
            this.value = value;
        }else {
            System.out.println(value + "is not a valid Card Value ");
            System.exit(1);

        }
    }
    
    public int getValue(){
        return value;
    }
    
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
        }
        
        }
    

