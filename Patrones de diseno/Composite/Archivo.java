package Composite;

public class Archivo implements IComponenteArchivo{
    private String nombre;
    private double tamanio;
    
    public Archivo(String nombre, double tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    @Override
    public void mostrarArchivo() {
        System.out.println("-" + nombre);
    }
}
