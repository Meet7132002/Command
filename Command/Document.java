package Command;

import java.util.ArrayList;

public class Document {
    private String fileName;
    private ArrayList<String> lines;
    public Document(String fileName) {
        this.fileName = fileName;
        lines = FileManipulator.readFile(fileName);
    }
    public String view() {
        String data = border() + "\n\n";
        int count = 0;
        int longest = LongestLine();
        while(count < lines.size()) {
            int numSpaces = longest - lines.get(count).length();
            String space = spaceMaker(numSpaces);
            data += "|      " + lines.get(count) + space + "|\n";
            count++;
        }
        data += border() + "\n";
        return data;
    }
    public String append(String line) {
        lines.add(line);
        return "The line has been appended to the document";
    }
    public String write(String line) {
        lines = new ArrayList<String>();
        lines.add(line);
        return "The line was written to the file";
    }
    public String save() {
        FileManipulator.writeFile(fileName, lines);
        return "The file has been saved.";
    }

    //creates the correctly formatted upper and lower boarder
    private String border() {
        String borders = "";
        int count = 0;
        while(count<(LongestLine()+7)) {
            borders+="_";
        }
        return borders;
    }

    //finds the longest line in the array and adds 6
    private int LongestLine() {
        int longest = 0;
        int count = 0;
        while(count < lines.size()) {
            if(lines.get(count).length() > longest) {
                longest = lines.get(count).length();
            }
        }
        return (longest + 6);
    }
    //numSpaces takes in the required spaces to be printed as an integer
    private String spaceMaker(int numSpaces) {
        int count = 0;
        String space = "";
        while(count < numSpaces) {
            space+= " ";
            count++;
        }
        return space;
    }
}