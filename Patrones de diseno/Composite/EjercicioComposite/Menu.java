package Composite.EjercicioComposite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IComponenteArchivo{
    private String nombre;
    private List<IComponenteArchivo> componentes;
    
    public Menu(String nombre) {
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
    }
    
    public void agregarComponente(IComponenteArchivo componente) {
        componentes.add(componente);
    }
    
    @Override
    public void mostrarArchivo() {
        System.out.println(nombre + ":");
        for (IComponenteArchivo componente : componentes) {
            componente.mostrarArchivo();
        }
    }
    
}
