package Command;

import java.util.Scanner;
/**
 * Overrides existing lines in the document and replaces them with a new input
 * @authors Meet Patel, Shea Rappold, Joe Zelinsky, and Jacob Davidson
 */
public class WriteCommand extends Command {
    private Scanner in=new Scanner(System.in);

    public WriteCommand(Document doc){
        super(doc);
    }

    public String execute(){
        System.out.println("Enter text:");
        String input=in.nextLine();
        String print=document.write(input);
        return print;
    }
}
