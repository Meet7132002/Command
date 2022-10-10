package Command;

import java.util.Scanner;
/**
 * Adds a line to the existing document
 * @authors Meet Patel, Shea Rappold, Joe Zelinsky, and Jacob Davidson
 */
public class AppendCommand extends Command {
    private Scanner in=new Scanner(System.in);

    public AppendCommand(Document doc){
        super(doc);
    }

    public String execute(){
        String print=document.append(in.nextLine());
        return print;
    }
}
