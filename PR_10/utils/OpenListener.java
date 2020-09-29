package utils;

import Docs.IDocument;
import Docs.TextDocument;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenListener implements ActionListener {
    private boolean isNew = false;
    private MainFrame frame;
    private MainFrame.supportedDocs doc;

    public OpenListener(MainFrame.supportedDocs doc, boolean isNew) {
        this.isNew = isNew;
        this.doc = doc;
        frame = MainFrame.getInstance();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String path = new JOptionPane("File Path?").showInputDialog(null, "Input file name");
        if (path == null || path.equals("")) return;
        IDocument document = frame.getDocFactory().create(doc, path, isNew);
        frame.setDoc(document);
        frame.setActivePanel(new TextPanel((TextDocument)document));
    }
}
