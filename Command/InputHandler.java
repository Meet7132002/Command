package Command;

import java.util.HashMap;
import javax.swing.text.Document;
/**
 * Takes input and redirects the user to the appropriate commmand prompt
 */
public class InputHandler {
    
    private HashMap<String, Command> commands= new HashMap<>();

    /**
     * Adds categories for the user to input to a hashmap
     * @param document
     */
    public InputHandler(Document document){
        commands.put("View", ViewCommand(document));
        commands.put("Append", AppendCommand(document));
        commands.put("Write", WriteCommand(document));
        commands.put("Save", SaveCommand(document));
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
 