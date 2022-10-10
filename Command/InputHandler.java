package Command;

import java.util.HashMap;
import javax.swing.text.Document;

public class InputHandler {
    
    private HashMap<String, Command> commands= new HashMap<>();

    public InputHandler(Document document){
        commands.put("View", ViewCommand(document));
        commands.put("Append", AppendCommand(document));
        commands.put("Write", WriteCommand(document));
        commands.put("Save", SaveCommand(document));
    }

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
 