import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TeamClickedListener implements MouseListener {
    private TeamButton btn;

    public TeamClickedListener(TeamButton btn) {
        this.btn = btn;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        btn.increaseScore();
        btn.notifyFrame();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
