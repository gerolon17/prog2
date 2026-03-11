package Factory;

public class AnimalFactory {
    public static Animal getAnimal(String type){
        if("perro".equalsIgnoreCase(type)){
            return new Perro();
        }else if("gato".equalsIgnoreCase(type)){
            return new Gato();
        }
        return null;
    }
}
