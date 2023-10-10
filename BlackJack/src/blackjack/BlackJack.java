/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackjack;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Deck theDeck = new Deck (1, true);
        
        Player me = new Player("John");
        Player dealer = new Player("Dealer");
        
        me.addCard(theDeck.nextCard());
        dealer.addCard(theDeck.nextCard());
        me.addCard(theDeck.nextCard());
        dealer.addCard(theDeck.nextCard());
        
        
        System.out.println("Cards are dealt\n");
        me.printHand(true);
        dealer.printHand(false);
        System.out.println("\n");
        
        boolean meDone = false;
        boolean dealerDone = false;
        String ans;
        
        while (!meDone || !dealerDone){
            if (!meDone){
                System.out.print("Hit or Stay? ( Enter H or S): ");
                ans = sc.next();
                System.out.println();
                
                if ( ans.compareToIgnoreCase("H") == 0){
                    meDone = !me.addCard(theDeck.nextCard());
                    me.printHand(true);
                    
                }else {
                    meDone = true;
                    
                }
            }
            
            if (!dealerDone){
                if (dealer.getHandSum() < 17 ){
                    System.out.println("The Dealer Hits\n");
                    dealerDone = !dealer.addCard(theDeck.nextCard());
                    dealer.printHand(false);
                }else {
                    System.out.println("The Dealer Stays\n");
                    dealerDone = true;
                }
            }
            
            System.out.println();
            
        }
            sc.close();
            
            me.printHand(true);
            dealer.printHand(true);
            
            int meSum = me.getHandSum();
            int dealerSum = dealer.getHandSum();
            
            if (meSum > dealerSum && meSum <= 21 || dealerSum > 21){
                System.out.println("Congratulations! You Win.");
            }else {
                System.out.println("opps! You lose.");
            }
            
    }
    
}
