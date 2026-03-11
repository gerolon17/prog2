package Factory;

public class Main {
    public static void main(String[] args) {
        Animal perro = AnimalFactory.getAnimal("perro");
        perro.speak();

        Animal gato = AnimalFactory.getAnimal("gato");
        gato.speak();
    }
}