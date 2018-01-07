package behavioralDesignPatterns.memento.src;

import behavioralDesignPatterns.memento.src.impl.FileWriterCaretaker;
import behavioralDesignPatterns.memento.src.impl.FileWriterUtil;

/**
 * MementoMain.
 * Date: 01/07/2018
 *
 * @author Mikalai Bezmen
 */
public class MementoMain {

    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();
        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First Set of Data\n");
        System.out.println(fileWriter + "\n");
        // lets save the file
        caretaker.save(fileWriter);
        //now write something else
        fileWriter.write("Second Set of Data\n");
        //checking file contents
        System.out.println(fileWriter + "\n");
        //lets undo to last save
        caretaker.undo(fileWriter);
        //checking file content again
        System.out.println(fileWriter + "\n");
    }
}
