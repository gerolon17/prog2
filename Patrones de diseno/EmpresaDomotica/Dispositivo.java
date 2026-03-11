package EmpresaDomotica;

public abstract class Dispositivo {
    public Estado estado;
    public String ubicacion;

    public Dispositivo(DispositivoBuilder dispositivoBuilder){
        this.estado = dispositivoBuilder.estado;
        this.ubicacion = dispositivoBuilder.ubicacion;
    }

    public static abstract class DispositivoBuilder {
        protected Estado estado;
        protected String ubicacion;

        public DispositivoBuilder setEstado(Estado estado){
            this.estado = estado;
            return this;
        }

        public DispositivoBuilder setUbicacion(String ubicacion){
            this.ubicacion = ubicacion;
            return this;
        }

        public abstract Dispositivo build();
    }
}
