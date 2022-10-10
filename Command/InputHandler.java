package Command;

import java.util.HashMap;
import javax.swing.text.Document;

public class InputHandler {
    
    private HashMap<String, Command> commands;

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
 