package Command;

import java.util.ArrayList;
/** 
 * A file for a user to modify and view
 * @authors Meet Patel, Shea Rappold, Joe Zelinsky, and Jacob Davidson
 */
public class Document {
    private String fileName;
    private ArrayList<String> lines;
    public Document(String fileName) {
        this.fileName = fileName;
        lines = FileManipulator.readFile(fileName);
    }
    /**
     * Views the document
     * @return the current state of the document
     */
    public String view() {
        String data = border() + "\n\n";
        int count = 0;
        int longest = Longest();
        while(count < lines.size()) {
            int numSpaces = longest - lines.get(count).length();
            String space = Space(numSpaces);
            data += "|      " + lines.get(count) + space + "|\n";
            count++;
        }
        data += border() + "\n";
        return data;
    }
    /**
     * Adds a line to the document containing changes inputted by the user
     * @param line
     * @return confirmation that the line has been added to the file
     */
    public String append(String line) {
        lines.add(line);
        return "The line has been appended to the document";
    }
    /**
     * Clears out existing lines from the document and adds a new one inputted by the user
     * @param line
     * @return confirmation that the line was written
     */
    public String write(String line) {
        lines = new ArrayList<String>();
        lines.add(line);
        return "The line was written to the file";
    }
    /**
     * Writes the file based upon changes made by the user using the file manipulator
     * @return Confirmation that the file was saved or notify the user that there was an error
     */
    public String save() {
        FileManipulator.writeFile(fileName, lines);
        return "The file has been saved.";
    }

    //creates the upper and lower border
    private String border() {
        String borders = "";
        int count = 0;
        while(count<(Longest()+7)) {
            borders+="_";
        }
        return borders;
    }

    //finds the longest line in the array and adds 6
    private int Longest() {
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
    private String Space(int numSpaces) {
        int count = 0;
        String space = "";
        while(count < numSpaces) {
            space+= " ";
            count++;
        }
        return space;
    }
}
