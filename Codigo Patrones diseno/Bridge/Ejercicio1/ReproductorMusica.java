public class ReproductorMusica extends Reproductor {
    public ReproductorMusica(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    void reproducirCancion(String nombreCancion) {
        System.out.println("REPRODUCTOR DE MUSICA: Reproduciendo canción: " + nombreCancion);
        dispositivo.ajustarVolumen(50);
    }
    
}
