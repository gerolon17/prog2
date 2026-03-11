public abstract class Reproductor {
    protected Dispositivo dispositivo;

    public Reproductor(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void encender() {
        dispositivo.encender();
    }

    public void apagar() {
        dispositivo.apagar();
    }

    public void ajustarVolumen(int nivel){
        dispositivo.ajustarVolumen(nivel);
    }

    abstract void reproducirCancion(String nombreCancion);
}

