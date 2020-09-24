import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Player {
    private String name;
    private Queue<Integer> cards;

    public Player(String name, List<Integer> cardSet) {
        this.name = name;
        cards = new LinkedList<>(cardSet);
    }

    public Integer getCardValue() {
        return cards.peek();
    }

    public Integer getCard() {
        return cards.poll();
    }

    public void winIteration(Integer first, Integer second) {
        cards.add(first);
        cards.add(second);
    }

    public boolean isLose() {
        return cards.size() == 0;
    }

    public String toString() {
        return name + " " + cards.toString();
    }
}
