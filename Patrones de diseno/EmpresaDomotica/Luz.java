package EmpresaDomotica;

public class Luz extends Dispositivo{
    public TipoLuz tipoLuz;
    public int intensidad;
    public String color;

    public Luz(LuzBuilder luzBuilder){
        super(luzBuilder);
        this.tipoLuz = luzBuilder.tipoLuz;
        this.intensidad = luzBuilder.intensidad;
        this.color = luzBuilder.color;
    }

    public static class LuzBuilder extends Dispositivo.DispositivoBuilder{
       private TipoLuz tipoLuz;
       private int intensidad;
       private String color;

       @Override
    public LuzBuilder setEstado(Estado estado) {
    super.setEstado(estado);
    return this;
    }

    @Override
    public LuzBuilder setUbicacion(String ubicacion) {
        super.setUbicacion(ubicacion);
        return this;
    }

       public LuzBuilder setTipoLuz(TipoLuz tipoLuz){
        this.tipoLuz = tipoLuz;
        return this;
       }

       public LuzBuilder setIntensidad(int intensidad){
        this.intensidad = intensidad;
        return this;
       }

       public LuzBuilder setColor(String color){
        this.color = color;
        return this;
       }

       public Luz build(){
        return new Luz(this);
       }
    }
}
