package Prototype;

public class Documento implements Clonable {
    private String content;

    public Documento(String content) {
        this.content = content;
    }

    public void show(){
        System.out.println(content);
    }

    @Override
    public Documento clone() {
        try {
            return (Documento) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
