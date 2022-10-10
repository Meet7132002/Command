package Command;

public class ViewCommand extends Command{
    public ViewCommand(Document doc){
        super(doc);
    }

    public String execute(){
        document.view();
        return null;
    }
}
