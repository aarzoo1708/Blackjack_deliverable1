/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

/**
 *
 * @author User
 */
public class Player {
    
    private String name;
    
    private Card[] hand = new Card[10];
    
    
    private int valueOfCard;
    
    public Player(String name){
        this.name = name;
        
        this.emptyHand();
    }
    
    public void emptyHand(){
        for (int c = 0; c< 10 ; c++){
            this.hand[c]= null;
            
        }
        this.valueOfCard = 0;
        
    }
    
    public boolean addCard(Card addCard){
        
        if (this.valueOfCard == 10){
            System.out.printf("%s's hand already has 10 cards: " + 
                    " cannot add another\n", this.name);
            System.exit(1);
            
        }
        this.hand[this.valueOfCard] = addCard;
        this.valueOfCard++;
        return(this.getHandSum() <= 21);
        
             
    }

        public int getHandSum(){
            int handSum = 0;
            int cardNum;
            int numOfAces = 0;
            
            for(int c= 0; c < this.valueOfCard; c++){
                cardNum = this.hand[c].getValue();
                
                if(cardNum == 1){
                    numOfAces++;
                    handSum += 11;
                    
                }else if (cardNum > 10) {
                    handSum += 10;
                }else {
                    handSum += cardNum;
                }
            }
            
            while (handSum > 21 && numOfAces > 0 ){
                handSum -= 10;
                numOfAces--;
                
            }
            
            return handSum;
        }
        
        public void printHand(boolean showFirstCard){
            System.out.printf("%s's cards:\n", this.name);
            for(int c = 0 ; c< this.valueOfCard; c++){
                if (c == 0 && !showFirstCard){
                    System.out.println("  [hidden]");
                }else {
                    System.out.printf("  %s\n", this.hand[c].toString());
                }
            }
        }


}
