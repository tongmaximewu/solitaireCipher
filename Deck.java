Skip to content
tongmaximewu
/
solitaireCipher

Type / to search

Code
Issues
Pull requests
Actions
Projects
Wiki
Security
Insights
Settings
Creating a new file in solitaireCipher
BreadcrumbssolitaireCipher
/
Deck.java
in
main

Edit

Preview
Indent mode

Spaces
Indent size

2
Line wrap mode

No wrap
Editing Deck.java file contents
🤝

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
/**
* Your name here: tong wu
* Your McGill ID here: 261137152
**/
package assignment2;

import java.util.Random;

public class Deck {
    public static String[] suitsInOrder = {"clubs", "diamonds", "hearts", "spades"};
    public static Random gen = new Random();

    public int numOfCards; // contains the total number of cards in the deck
    public Card head; // contains a pointer to the card on the top of the deck

    /*
     * TODO: Initializes a Deck object using the inputs provided
     */
    public Deck(int numOfCardsPerSuit, int numOfSuits) {
        numOfCards = 0;
        if( numOfCardsPerSuit > 13 || numOfCardsPerSuit < 1 ){
            throw new IllegalArgumentException("Invalid number of cards per suit");
        }
        if( numOfSuits < 1 || numOfSuits > suitsInOrder.length ){
            throw new IllegalArgumentException("Invalid number of suits");
        }
        head= null;
        Card current = null;
        for( int i = 0; i < numOfSuits ; i++ ){
            for( int j = 1; j <= numOfCardsPerSuit; j++){
                PlayingCard c = new PlayingCard(suitsInOrder[i], j);
                if (head == null) {
                    head = c;
                    current = c;
                    head.prev = c;
                    head.next = c;
                } else {
                    current.next = c;
                    c.prev=current;
                    head.prev = c;
                    c.next = head;

                    current = c;



                }
                numOfCards++;
            }
        }
        this.addCard(new Joker("red"));
        this.addCard(new Joker("black"));
    }
    /*
     * TODO: Implements a copy constructor for Deck using Card.getCopy().
     * This method runs in O(n), where n is the number of cards in d.
     */
    public Deck(Deck d) {
        /**** ADD CODE HERE ****/
        if (d == null){
            throw new IllegalArgumentException("input null");
        }
        if (d.numOfCards == 1){
            addCard(d.head);
        }
        else{
            this.numOfCards = d.numOfCards;
            Card current = d.head;
            this.head = current.getCopy();
            Card copyCurrent = this.head;

Use Control + Shift + m to toggle the tab key moving focus. Alternatively, use esc then tab to move to the next interactive element on the page.
