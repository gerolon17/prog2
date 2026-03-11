package Factory;

public class Perro implements Animal {
    @Override
    public void speak() {
        System.out.println("El perro dice: ¡Guau, guau!");
    }
    
}
