package Command;
/**
 * Saves the document
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