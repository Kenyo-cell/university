import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> cards1 = new ArrayList<>();
        cards1.add(1);
        cards1.add(3);
        cards1.add(7);
        cards1.add(9);
        cards1.add(4);

        ArrayList<Integer> cards2 = new ArrayList<>();
        cards2.add(2);
        cards2.add(6);
        cards2.add(5);
        cards2.add(0);
        cards2.add(8);

        Game game = new Game(
            new Player("John", cards1),
            new Player("Joshua", cards2)
            );
        game.Start();
    }
}