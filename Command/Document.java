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
        return "";
    }

    public String write(String line){
        return "";
    }

    public String save(){
        return "";
    }
}
