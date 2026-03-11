package EmpresaDomotica;


public class Camara extends Dispositivo{
    private String resolucion;
    private boolean tieneAudio;
    private boolean tieneVisionNocturna;
    private boolean tieneDeteccionMovimiento;
    


private Camara(CamaraBuilder camaraBuilder){
    super(camaraBuilder);
    this.resolucion = camaraBuilder.resolucion;
    this.tieneAudio = camaraBuilder.tieneAudio;
    this.tieneVisionNocturna = camaraBuilder.tieneVisionNocturna;
    this.tieneDeteccionMovimiento = camaraBuilder.tieneDeteccionMovimiento;
}

public static class CamaraBuilder {
    private String resolucion;
    private boolean tieneAudio, tieneVisionNocturna, tieneDeteccionMovimiento;

    @Override
    public CamaraBuilder setEstado(Estado estado){
        super.setEstado(estado);
        return this;
    }

     @Override
    public LuzBuilder setEstado(Estado estado) {
    super.setEstado(estado);
    return this;
    }

    public CamaraBuilder setResolucion(String resolucion) {
        this.resolucion = resolucion;
        return this;
    }

    public CamaraBuilder setTieneAudio(boolean tieneAudio) {
        this.tieneAudio = tieneAudio;
        return this;
    }   

    public CamaraBuilder setTieneVisionNocturna(boolean tieneVisionNocturna){
        this.tieneVisionNocturna = tieneVisionNocturna;
        return this;
    }

    public CamaraBuilder setTieneDeteccionMovimiento(boolean tieneDeteccionMovimiento){
        this.tieneDeteccionMovimiento = tieneDeteccionMovimiento;
        return this;
    }

    public Camara build(){
        return new Camara(this);
    }
}

}