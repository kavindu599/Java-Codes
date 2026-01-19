public class Document {
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void displayDocument() {
        System.out.println("Title : " + title);
        System.out.println("Content : " + content);
    }

    public String getTitle() {
        return title;
    }
}

class Printer {
    public void printDocument(Document doc){
        System.out.println("Printing document : " +doc.getTitle());
        doc.displayDocument();
    }
}

class PrinterApp {
    public static void main (String [] args){
        Document doc = new Document("Lab Report", "This is the final lab report for SE1020.");

        Printer printer = new Printer();

        printer.printDocument(doc);
    }
}
