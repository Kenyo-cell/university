package utils;

import Docs.IDocument;
import Factories.CreateDocument;
import Factories.ICreateDocument;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private static MainFrame instance = new MainFrame();
    private ICreateDocument docFactory = new CreateDocument();
    private TextPanel panel = new TextPanel();
    IDocument doc;

    public enum supportedDocs {
        TEXT,
        IMAGE,
        MUSIC
    }

    private JMenuBar menu;

    public static MainFrame getInstance() {
        if (instance == null) {
            new MainFrame();
        }
        return instance;
    }

    public ICreateDocument getDocFactory() {
        return docFactory;
    }

    public String getTextContent(){
        return panel.getText();
    }

    private MainFrame() {
        super("redactor");
        setSize(500, 500);

        setLayout(new FlowLayout());
        setResizable(false);

        instance = this;
    }

    public void createMainFrame() {
        createMenu();
        add(panel);

        setVisible(true);
    }

    private void createMenu() {
        menu = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu create = new JMenu("Create");
        JMenu openFile = new JMenu("Open");
        JMenuItem saveFile = new JMenuItem("Save");
        saveFile.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Saved");
                        doc.save();
                    }
                }
        );

        file.add(create);
        file.add(openFile);
        file.add(saveFile);

        for (supportedDocs doc : supportedDocs.values()) {
            create.add(new FileMenuItem(doc, true));
            openFile.add(new FileMenuItem(doc, false));
        }

        menu.add(file);

        setJMenuBar(menu);
    }

    public void setActivePanel(TextPanel panel) {
        remove(this.panel);
        this.panel = panel;
        add(this.panel);
    }

    public void setDoc(IDocument doc) {
        this.doc = doc;
    }
}
