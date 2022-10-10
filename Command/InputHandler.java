package Command;

import java.util.HashMap;
import javax.swing.text.Document;
/**
 * Takes input and redirects the user to the appropriate commmand prompt
 */
public class InputHandler {
    
    private HashMap<String, Command> commands;

    /**
     * Adds categories for the user to input to a hashmap
     * @param document
     */
    public InputHandler(Document document){
        commands = new HashMap<String, Command>();

        ViewCommand view = new ViewCommand(document);
        AppendCommand append = new AppendCommand(document);
        WriteCommand write = new WriteCommand(document);
        SaveCommand save = new SaveCommand(document);

        commands.put("view", view);
        commands.put("append", append);
        commands.put("write", write);
        commands.put("save", save);
    }

    /**
     * Reads the input
     * @param data
     */
    public void inputEntered(String data){
        if (data.equalsIgnoreCase("view")) {
            commands.get("View");
        } else if (data.equalsIgnoreCase("append")) {
            commands.get("Append");
        } else if (data.equalsIgnoreCase("write")) {
            commands.get("Write");
        } else if (data.equalsIgnoreCase("save")) {
            commands.get("Save");
        } else {
            return;
        }
    }
}
 