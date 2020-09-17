import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel {
    private BufferedImage currentImage;
    private int imagesCount = 12;

    public ImagePanel() {
        super();
        try {
            currentImage = ImageIO.read(new File("src/1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(currentImage, 0, 50, null);
    }

    public void animate(Graphics g) {
        int i = 1;
        while (true) {

            try {
                currentImage = ImageIO.read(new File(String.format("src/%d.png", i)));
            } catch (IOException e) {
                e.printStackTrace();
            }

            i = (i % imagesCount) + 1;

            try {
                Thread.sleep(100); // спать 1000 милисекунд.
            } catch(Exception e){
                System.out.println("Что-то пошло не так, но бог здесь не причём, ибо его нет. Это просто какой-то косяк, который можно объяснить.");
            }

            this.paintComponent(g);
        }
    }
}
