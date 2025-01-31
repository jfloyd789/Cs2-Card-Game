import java.util.ArrayList;
public class Player {
    
    private String name;
    private ArrayList<Card> hand;
    private int points;
    
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
        this.points = 0;
    }
    
    public Player(String name, ArrayList<Card> hand) {
        this.name = name;
        this.hand = hand;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public void addCard(Card card) {
        hand.add(card);
    }
    public void clearHand() {
        this.hand = new ArrayList<Card>();
    }

    public String toString() {
        return name + " has " + points + " points\n " + 
        name + "has" + hand;
    }
}
