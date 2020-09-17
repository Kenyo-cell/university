import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JMenuBar menuBar;

    public MainFrame() {
        super("Text Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 250);
        setLayout(new BorderLayout());

        add(new TextPanel(), BorderLayout.CENTER);

        menuBar = new JMenuBar();
        menuBar.add(createMenu());
        setJMenuBar(menuBar);


        setVisible(true);
    }

    private JMenu createMenu() {
        JMenu TextMenu = new JMenu("Text");

        JMenu areaColorMenu = new JMenu("Color");

        areaColorMenu.add(new ColorItem("BLUE", Color.BLUE));
        areaColorMenu.add(new ColorItem("BLACK", Color.BLACK));
        areaColorMenu.add(new ColorItem("RED", Color.RED));

        JMenu areaFontMenu = new JMenu("Font");

        areaFontMenu.add(new FontItem("Times New Roman", TextPanel.times));
        areaFontMenu.add(new FontItem("Courier", TextPanel.MSSans));
        areaFontMenu.add(new FontItem("MS Sans Serif", TextPanel.courier));

        TextMenu.add(areaColorMenu);
        TextMenu.add(areaFontMenu);
        return TextMenu;
    }
}
