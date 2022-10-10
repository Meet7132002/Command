package Command;
/**
 * Views the document
 */
public class ViewCommand extends Command{
    public ViewCommand(Document doc){
        super(doc);
    }

    public String execute(){
        String print=document.view();
        return print;
    }
}
