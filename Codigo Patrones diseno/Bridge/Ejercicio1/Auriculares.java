public class Auriculares implements Dispositivo {
       @Override
    public void encender() {
        System.out.println("AURICULARES: Conectados. Sonido solo para ti.");
    }
    // ... Implementaciones omitidas por brevedad ...
    @Override
    public void apagar() { System.out.println("AURICULARES: Desconectados"); }
    @Override
    public void ajustarVolumen(int nivel) {
        System.out.println("AURICULARES: Subiendo volumen al oído a " + nivel);
    }
}
