import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

public class MainFrame extends JFrame {
    private ImagePanel image;

    public MainFrame() throws IOException {
        super("animation");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(350, 350);

        image = new ImagePanel();

        add(image);

        setVisible(true);

        image.animate(this.getGraphics());
    }
}
