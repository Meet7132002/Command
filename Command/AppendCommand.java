package Command;

import java.util.Scanner;
/**
 * Adds a line to the existing document
 */
public class AppendCommand extends Command {
    private Scanner in;

    public AppendCommand(Document doc){
        super(doc);
    }

    public String execute(){
        return null;
    }
}
