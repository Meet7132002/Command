package Command;

import java.util.ArrayList;

public class Document {
    private String fileName;
    private ArrayList<String> lines= new ArrayList<>();

    public Document(String fileName){
        this.fileName=fileName;
    }

    public String view(){
        return "";
    }

    public String append(String line){
        lines.add(line);
        return "The line has been appended to the document";
    }

    public String write(String line){
        lines = new ArrayList<String>();
        lines.add(line);
        return "The line was written to the file";
    }

    public String save(){
        FileManipulator.writeFile(fileName, lines);
        return "The file has been saved.";
    }

}
