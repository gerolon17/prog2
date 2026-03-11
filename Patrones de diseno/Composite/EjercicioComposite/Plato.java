package Composite.EjercicioComposite;

public class Plato implements IComponenteArchivo{
    private String nombre;
    
    public Plato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarArchivo() {
        System.out.println("-" + nombre);
    }
}
