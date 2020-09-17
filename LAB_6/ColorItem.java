import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorItem extends JMenuItem {
    private Color color;
    public ColorItem(String name, Color color) {
        super(name);
        this.color = color;
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextPanel.setColor(color);
            }
        });
    }
}
