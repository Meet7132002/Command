package Command;
/**
 * Views the document
 */
public class ViewCommand extends Command{
    private Document document;

    public ViewCommand(Document doc){
        super(doc);
    }

    public String execute(){
        String print=document.view();
        return print;
    }
}
