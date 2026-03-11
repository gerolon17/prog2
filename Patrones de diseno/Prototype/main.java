package Prototype;

public class main {
    public static void main(String[] args) {
        Documento doc1 = new Documento("Este es el documento original.");
        doc1.show();

        Documento doc2 = doc1.clone();
        doc2.show();
    }
}
