import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontItem extends JMenuItem {
    private Font font;
    public FontItem(String name, Font font) {
        super(name);
        this.font = font;
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextPanel.setTextFont(font);
            }
        });
    }
}
