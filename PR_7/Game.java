public class Game {
    private Player firstPlayer;
    private Player secondPlayer;
    private int moves;
    private boolean isBotva = true;

    public Game(Player p1, Player p2) {
        firstPlayer = p1;
        secondPlayer = p2;
    }

    public void Start() {
        for (moves = 1; moves < 106; moves++) {
            Iteration();
            if (firstPlayer.isLose() || secondPlayer.isLose()) {
                isBotva = false;
                break;
            }
        }
        End();
    }

    public void End() {
        System.out.println(isBotva ? "botva" : "Winner is " +
            (firstPlayer.isLose() ? secondPlayer : firstPlayer) + " by " + moves);
    }

    private void Iteration() {
        if (isFirstWin()) {
            firstPlayer.winIteration(firstPlayer.getCard(), secondPlayer.getCard());
        } else {
            secondPlayer.winIteration(firstPlayer.getCard(), secondPlayer.getCard());
        }
        System.out.println(moves + ": " + firstPlayer + " " + secondPlayer);
    }

    private boolean isFirstWin() {
        Integer f1 = firstPlayer.getCardValue();
        Integer f2 = secondPlayer.getCardValue();
        return ((f1 == 0 || f1 == 9) && (f2 == 0 || f2 == 9)) ? f1 < f2 : f1 > f2;
    }
}
