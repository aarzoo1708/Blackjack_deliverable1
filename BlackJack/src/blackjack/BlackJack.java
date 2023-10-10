/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackjack;

/**
 *
 * @author aarzoo
 * date 09-10-23
 */
import java.util.Scanner;

public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Deck theDeck = new Deck (1, true);
        
        Player me = new Player("John"); //Create a player named "John".
        Player dealer = new Player("Dealer"); // Create a Dealer.
        
        
         // Deal two cards to the player and two cards to the dealer
        me.addCard(theDeck.nextCard());
        dealer.addCard(theDeck.nextCard());
        me.addCard(theDeck.nextCard());
        dealer.addCard(theDeck.nextCard());
        
        
        System.out.println("Cards are dealt\n");
        me.printHand(true); //Print the player's hand with the first card visible
        dealer.printHand(false); //Print the dealer's hand with the first card hidden
        System.out.println("\n");
        
        boolean meDone = false;
        boolean dealerDone = false;
        String ans;
        
        // Player's turn
        while (!meDone || !dealerDone){
            if (!meDone){
                System.out.print("Hit or Stay? ( Enter H or S): ");
                ans = sc.next();
                System.out.println();
                
                if ( ans.compareToIgnoreCase("H") == 0){
                    meDone = !me.addCard(theDeck.nextCard()); // Player hits and adds a card.
                    me.printHand(true); // Print the player's updated hand.
                    
                }else {
                    meDone = true; // Player stays
                    
                }
            }
            
            if (!dealerDone){
                if (dealer.getHandSum() < 17 ){
                    System.out.println("The Dealer Hits\n");
                    dealerDone = !dealer.addCard(theDeck.nextCard()); // Dealer hits and adds a card
                    dealer.printHand(false); // Print the dealer's updated hand with the first card hidden
                }else {
                    System.out.println("The Dealer Stays\n");
                    dealerDone = true; // Dealer stays
                }
            }
            
            System.out.println();
            
        }
            sc.close();
            
            me.printHand(true); //Print the player's final hand
            dealer.printHand(true); // Print the dealer's final hand with all cards visible

            
            int meSum = me.getHandSum(); // Calculate the player's hand sum
            int dealerSum = dealer.getHandSum(); // Calculate the dealer's hand sum
            
            
            // Determine the winner
            if (meSum > dealerSum && meSum <= 21 || dealerSum > 21){
                System.out.println("Congratulations! You Win.");
            }else {
                System.out.println("opps! You lose.");
            }
            
    }
    
}
