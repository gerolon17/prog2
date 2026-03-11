package EmpresaDomotica;

import EmpresaDomotica.Camara.CamaraBuilder;
import EmpresaDomotica.Luz.LuzBuilder;
import EmpresaDomotica.Termostato.TermostatoBuilder;

public class DisposititvoFactory {
    public Dispositivo crearDispositivo(String tipo){
        if(tipo.equalsIgnoreCase("Luz")){
            return new LuzBuilder().setEstado(Estado.APAGADO).setTipoLuz(TipoLuz.CALIDA).setUbicacion("Sala").setIntensidad(75).setColor("Blanco Cálido").build();
        }else if(tipo.equalsIgnoreCase("Luz1")){
            return new LuzBuilder().setEstado(Estado.ENCENDIDO).setTipoLuz(TipoLuz.FRIA).setUbicacion("Cocina").setIntensidad(60).setColor("Azul Frio").build();
        } else if (tipo.equalsIgnoreCase("Camara")) {
            return new CamaraBuilder().build();
        }else if(tipo.equalsIgnoreCase("Camara1")){

        } else if (tipo.equalsIgnoreCase("Termostato")) {
            return new TermostatoBuilder().build();
        }else if(tipo.equalsIgnoreCase("Termostato1")){

        }
        return null;
    }
}
