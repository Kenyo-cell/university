import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JPanel panel;
    private final Font font = new Font("Calibri", Font.BOLD, 20);
    private final Team real = new Team("Real Madrid");
    private final Team milan = new Team("AC Milan");
    private JLabel score = new JLabel();
    private JLabel lastScorer = new JLabel();
    private JLabel winner = new JLabel();


    public MainFrame() {
        super("My App");
        setLayout(new BorderLayout());
        setSize(500, 300);
        setFont(font);

        add(new TeamButton(real, this), BorderLayout.WEST);
        add(new TeamButton(milan, this), BorderLayout.EAST);

        panel = new JPanel();
        add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(3, 0));

        updateScore();
        updateLastScorer("N/A");
        updateWinner();

        setLabelDefault(score);
        setLabelDefault(lastScorer);
        setLabelDefault(winner);

        panel.add(score);
        panel.add(lastScorer);
        panel.add(winner);

        setVisible(true);
    }

    public void updateScore() {
        score.setText(String.format("Result %d:%d", real.getScore(), milan.getScore()));
    }

    public void updateWinner() {
        if (real.getScore() > milan.getScore()) {
            winner.setText(real.getName());
        } else if (real.getScore() < milan.getScore()) {
            winner.setText(milan.getName());
        } else {
            winner.setText("DREW");
        }
    }

    public void updateLastScorer(String scorer) {
        lastScorer.setText("Last Scorer: " + scorer);
    }

    private void setLabelDefault(JLabel label) {
        label.setFont(font);
        label.setHorizontalAlignment(0);
    }
}
