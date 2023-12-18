/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import blackjack.Card;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NewEmptyJUnitTest {

    private Deck deck;

    @BeforeEach
    void setUp() {
        // Initialize a new deck before each test
        deck = new Deck(1, false); // Create a non-shuffled deck with 1 set of cards
    }

    @Test
    void testDeckCreation() {
        // Check if the deck is created with the correct number of cards
        assertEquals(52, deck.getValueOfCards(), "Unexpected number of cards in the deck");
    }

    @Test
    void testShuffle() {
        // Create a shuffled deck
        Deck shuffledDeck = new Deck(1, true);

        // Check if the shuffled deck has the same number of cards as the original deck
        assertEquals(deck.getValueOfCards(), shuffledDeck.getValueOfCards(),
                "Shuffled deck should have the same number of cards");

        // Check if the shuffled deck is not equal to the original deck (highly unlikely due to randomness)
        assertNotEquals(deck, shuffledDeck, "Shuffled deck should not be equal to the original deck");
    }

    @Test
    void testNextCard() {
        // Check if the nextCard method returns a card and decreases the number of cards in the deck
        Card card = deck.nextCard();
        assertNotNull(card, "nextCard should return a non-null card");
        assertEquals(51, deck.getValueOfCards(), "Number of cards in the deck should decrease after calling nextCard");
    }

    @Test
    void testPrintDeck() {
        // Check if the printDeck method prints the expected number of cards
        // This is more of a visual inspection test
        deck.printDeck(5); // Print the first 5 cards
        // Manually inspect the output to ensure correctness
    }
}
