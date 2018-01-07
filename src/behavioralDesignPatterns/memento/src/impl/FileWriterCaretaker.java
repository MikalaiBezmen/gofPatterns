package behavioralDesignPatterns.memento.src.impl;

/**
 * FileWriterCaretaker.
 * Date: 01/07/2018
 *
 * @author Mikalai Bezmen
 */
public class FileWriterCaretaker {

    private Object obj;

    public void save(FileWriterUtil fileWriter) {
        this.obj = fileWriter.save();
    }

    public void undo(FileWriterUtil fileWriter) {
        fileWriter.undoToLastSave(obj);
    }
}
