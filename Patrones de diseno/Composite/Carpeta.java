package Composite;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements IComponenteArchivo{
    private String nombre;
    private double tamanio;
    private List<IComponenteArchivo> hijos = new ArrayList<>();

    Carpeta(String nombre, double tamanio, List<IComponenteArchivo> hijos) {
        this.nombre = nombre;
        this.tamanio = 0;
        this.hijos = hijos;
    }

    public void agregarArhivo(IComponenteArchivo archivo){
        hijos.add(archivo);
    }

    @Override
    public void mostrarArchivo() {
        System.out.println("+" + nombre);
        for(IComponenteArchivo hijo : hijos){
            hijo.mostrarArchivo();
        }
    }
}
