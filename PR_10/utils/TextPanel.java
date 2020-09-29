package utils;

import Docs.TextDocument;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    private JTextArea textArea;
    private String msg;

    public TextPanel() {}

    public TextPanel(TextDocument document) {
        super();
        super.setBackground(Color.black);
        super.setSize(500, 500);

        msg = document.getContent();

        textArea = new JTextArea(msg.equals("null") ? "Write here :)" : msg,
                25, 10);
        textArea.setSize(400, 400);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        super.add(textArea);
    }
    public String getText() {
        return textArea.getText();
    }
}
