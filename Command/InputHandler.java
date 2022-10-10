package Command;

import java.util.HashMap;

import javax.swing.text.Document;

public class InputHandler {
    
    private HashMap<String, Command> commands= new HashMap<>();

    public Document InputHandler(Document document){
        commands.put("View", (Command) document);
        commands.put("Append", (Command) document);
        commands.put("Write", (Command) document);
        commands.put("Save", (Command) document);
        return document;
    }

    public void inputEntered(String data){

    }
}
