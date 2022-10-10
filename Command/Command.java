package Command;
/**
 * Parent class for commands
 * @authors Meet Patel, Shea Rappold, Joe Zelinsky, and Jacob Davidson
 */
public abstract class Command {
    protected Document document;

    public Command(Document document){
        this.document=document;
    }

    public String execute(){
        return null;   
    }
}
