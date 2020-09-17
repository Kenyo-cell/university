import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    private static JTextArea textArea = new JTextArea("Enter message", 7, 30);

    public static Font times = new Font("Times New Roman", Font.PLAIN, 20);
    public static Font MSSans = new Font("MS Sans Serif", Font.PLAIN, 20);
    public static Font courier = new Font("Courier New", Font.PLAIN, 20);

    public TextPanel() {
        textArea.setSize(500, 300);
        setLayout(new FlowLayout());
        add(textArea);
        textArea.setBackground(Color.WHITE);
        textArea.setFont(times);
        textArea.setForeground(Color.BLACK);
    }

    public static void setColor(Color color) {
        textArea.setForeground(color);
    }

    public static void setTextFont(Font font) {
        textArea.setFont(font);
    }
}
