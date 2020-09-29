package Factories;

import Docs.IDocument;
import utils.MainFrame;


public interface ICreateDocument {
    public IDocument create(MainFrame.supportedDocs docs, String name, boolean isNew);
    public IDocument createNew(MainFrame.supportedDocs docs, String name);
    public IDocument createOpen(MainFrame.supportedDocs docs, String name);
}
