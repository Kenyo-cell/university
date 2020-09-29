package Factories;

import Docs.IDocument;
import Docs.TextDocument;
import utils.MainFrame;

public class CreateDocument implements ICreateDocument{
    @Override
    public IDocument create(MainFrame.supportedDocs doc, String name, boolean isNew) {
        return isNew ? createNew(doc, name) : createOpen(doc, name);
    }

    @Override
    public IDocument createNew(MainFrame.supportedDocs docs, String name) {
        if (docs == MainFrame.supportedDocs.TEXT)
            return createTextDocument(name, true);
        return createTextDocument(name, true);
    }

    @Override
    public IDocument createOpen(MainFrame.supportedDocs docs, String name) {
        if (docs == MainFrame.supportedDocs.TEXT)
            return createTextDocument(name, false);
        return createTextDocument(name, false);
    }

    public IDocument createTextDocument(String name, boolean isNew) {
        return isNew ? new TextDocument(name) : new TextDocument().open(name);
    }
}
