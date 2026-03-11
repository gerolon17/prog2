package EmpresaDomotica;

import java.util.ArrayList;
import java.util.List;

public class SistemaAdmin {
    private static SistemaAdmin instancia;
    List<Camara> listaCamaras = new ArrayList<>();
    List<Luz> listaLuces = new ArrayList<>();
    List<Termostato> listaTermostatos = new ArrayList<>();
    
    public SistemaAdmin(List<Camara> listaCamaras, List<Luz> listaLuces, List<Termostato> listaTermostatos) {
        this.listaCamaras = listaCamaras;
        this.listaLuces = listaLuces;
        this.listaTermostatos = listaTermostatos;
    }

    public SistemaAdmin getInstancia() {
        if(instancia == null){
            instancia = new SistemaAdmin(listaCamaras, listaLuces, listaTermostatos);
            return instancia;
        }else{
            return instancia;
        }
    }

    public List<Camara> getListaCamaras() {
        return listaCamaras;
    }

    public void setListaCamaras(List<Camara> listaCamaras) {
        this.listaCamaras = listaCamaras;
    }

    public List<Luz> getListaLuces() {
        return listaLuces;
    }

    public void setListaLuces(List<Luz> listaLuces) {
        this.listaLuces = listaLuces;
    }

    public List<Termostato> getListaTermostatos() {
        return listaTermostatos;
    }

    public void setListaTermostatos(List<Termostato> listaTermostatos) {
        this.listaTermostatos = listaTermostatos;
    }

    public void agregarCamara(Camara camara) {
        listaCamaras.add(camara);
    }

    public void agregarLuz(Luz luz) {
        listaLuces.add(luz);
    }

    public void agregarTermostato(Termostato termostato) {
        listaTermostatos.add(termostato);
    }
}
