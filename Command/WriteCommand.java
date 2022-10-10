package Command;

import java.util.Scanner;
/**
 * Overrides existing lines in the document and replaces them with a new input
 */
public class WriteCommand extends Command {
    private Scanner in=new Scanner(System.in);

    public WriteCommand(Document doc){
        super(doc);
    }

    public String execute(){
        String print=document.write(in.nextLine());
        return print;
    }
}
