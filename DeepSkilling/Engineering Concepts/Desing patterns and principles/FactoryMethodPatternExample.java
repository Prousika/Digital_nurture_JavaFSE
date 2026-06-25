interface Document{
    void create();
}

class WordDocument implements Document{
    public void create(){
        System.out.println("Word Document Created");
    }
}

class PdfDocument implements Document{
    public void create(){
        System.out.println("Pdf Document Created");
    }
}

class ExcelDocument implements Document{
    public void create(){
        System.out.println("Excel Document Created");
    }
}

abstract class DocumentFactory{
    abstract Document createDocument();
}

class WordFactory extends DocumentFactory{
    public Document createDocument(){
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory{
    public Document createDocument(){
        return new PdfDocument();
    }
}

class ExcelFactory extends DocumentFactory{
    public Document createDocument(){
        return new ExcelDocument();
    }
}

//test class
public class FactoryMethodPatternExample {
    public static void main(String[] args){

        DocumentFactory wordFactory = new WordFactory();
        Document word = wordFactory.createDocument();
        word.create();

        DocumentFactory pdfFactory = new PdfFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.create();

        DocumentFactory excelFactory = new ExcelFactory();
        Document excel = excelFactory.createDocument();
        excel.create();

    }
}

/*
output:
Word Document Created
Pdf Document Created
Excel Document Created
*/  




