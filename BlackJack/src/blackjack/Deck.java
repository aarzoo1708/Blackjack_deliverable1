/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

import java.util.Random;

/**
 *
 * @author User
 */
public class Deck {
     
    private Card[] myCards;
    
    private int valueOfCards;
    //overloading 
    public Deck(){
        
        this (1, false);}
    
    
    public Deck(int valueOfDeck, boolean shuffle){
        
         this.valueOfCards = valueOfDeck * 52;
        this.myCards = new Card[this.valueOfCards];
        
        int c = 0;
        
        for (int d = 0; d < valueOfDeck; d++){ 
            // for every Deck 
            
            for (int s = 0; s < 4; s++){ // for every Suit 
                
                for (int v = 1; v <= 13; v++){ // For every value 
                    
                    // add new card to Deck
                    this.myCards[c] = new Card(Suit.values()[s], v);
                    c++;
                }
            }
        }
    if (shuffle){
        this.shuffle();
    }
    
    
    
    }

        public void shuffle(){
            
        
        //to generate random number Random method used
        Random rmd = new Random();
        
        Card temporary;
        
        int j;
        for (int i=0; i < this.valueOfCards; i++){
            
            j = rmd.nextInt(this.valueOfCards);
            
            temporary = this.myCards[i];
            this.myCards[i] = this.myCards[j];
            this.myCards[j] = temporary;
        }
    }
        
        public Card nextCard(){
            Card top = this.myCards[0];
            
            for (int c=1; c < this.valueOfCards; c++){
                this.myCards[c-1] = this.myCards[c];
                
            }
            this.myCards[this.valueOfCards-1] = null;
            this.valueOfCards--;
            
            return top;
        }
        
        public void printDeck(int valueToPrint) {
            for (int c=0; c< valueToPrint; c++){
                System.out.printf("% 3d/%d %s\n", c+1, this.valueOfCards,
                
                    this.myCards[c].toString());
                
            }
            System.out.printf("\t\t[%d other}\n", this.valueOfCards-valueToPrint);
            
        }

    
}



    



                    
           
            
               