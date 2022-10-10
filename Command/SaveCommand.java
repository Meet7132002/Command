package Command;
/**
 * Saves the document
 * @authors Meet Patel, Shea Rappold, Joe Zelinsky, and Jacob Davidson
 */
public class SaveCommand extends Command {
    public SaveCommand(Document doc){
        super(doc);
    }

    public String execute(){
        String print = document.save();
        return print;
    }
}