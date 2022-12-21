package Lecture_02.Ex006.Document;

public class TextDocument {

    StringBuilder sb;
    public TextDocument() {
        sb = new StringBuilder();
    }

    public TextDocument(String data) {
        this();
        addAllText(data);        
    }

    public void addAllText(String text){
        sb.append(text + "\n");
    }

    public void addAllLines(String[] lines){
        for (String line : lines) {
            addAllText(line);
            //sb.append(line);
        }
    }

    // public void addAllText(String ... data){
    //     for (String line : data) {
    //         sb.append(line);
    //         //addAllText(line);
    //     }
    // }
    
    public String getData(){
        return sb.toString();
    }

}
