public class Team {
    private String name;
    private int score;

    public Team(String name) {
        this.name = name;
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }
}
