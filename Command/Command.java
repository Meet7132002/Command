package Command;

public abstract class Command {
    protected Document document;

    public Command(Document document){
        this.document=document;
    }

    public String execute(){
        return null;
        
    }
}
