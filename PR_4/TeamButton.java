import javax.swing.*;
import java.awt.*;

public class TeamButton extends JButton {
    private Team team;
    private MainFrame mainFrame;
    private final Font font = new Font("Calibri",Font.BOLD, 20);

    public TeamButton(Team team, MainFrame frame) {
        super();
        this.team = team;
        setText(team.getName());
        setFont(font);

        this.mainFrame = frame;

        this.addMouseListener(new TeamClickedListener(this));
    }

    public void notifyFrame() {
        mainFrame.updateScore();
        mainFrame.updateLastScorer(team.getName());
        mainFrame.updateWinner();
    }

    public void increaseScore() {
        team.setScore(team.getScore() + 1);
    }
}
