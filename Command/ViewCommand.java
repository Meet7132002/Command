package Command;

public class ViewCommand extends Command{
    private Document document;

    public ViewCommand(Document doc){
        super(doc);
    }

    public String execute(){
        document.view();
        return null;
    }
}
