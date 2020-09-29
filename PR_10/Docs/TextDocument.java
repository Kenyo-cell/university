package Docs;

import utils.MainFrame;

import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TextDocument implements IDocument{
    private File file;
    private String content = "";

    public TextDocument() {
    }

    public TextDocument(String name) {
        try {
            getFileContent(name, true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void getFileContent(String name, boolean isNew) throws Exception {
        try {
            file = new File(System.getProperty("user.dir"), name + ".txt");
            if (!file.exists()) {
                if (isNew) file.createNewFile();
                else throw new Exception("File not found");
            } else {
                if (isNew) throw new Exception("File also exists");
            }
            content = readContent(file);

        } catch (Exception e) {
            new JOptionPane().showMessageDialog(null, e.getMessage());
        }
    }

    private String readContent(File file) {
        try {
            FileReader reader = new FileReader(file);
            int c;
            while ((c = reader.read()) != -1) {
                content += (char) c;
            }
            System.out.println("Content = " + content);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public IDocument open(String name) {
        try {
            getFileContent(name, false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return this;
    }

    @Override
    public void save() {
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(MainFrame.getInstance().getTextContent());
            fw.append("\n");
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
