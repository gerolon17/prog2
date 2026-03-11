public class Bocina implements Dispositivo {
    @Override
    public void encender() {
        System.out.println("BOCINA: Encendida. ¡Sube el volumen!");
    }
  
    @Override
    public void apagar() { 
        System.out.println("BOCINA: Apagada");
    }
    @Override
    public void ajustarVolumen(int nivel) {
        System.out.println("BOCINA: Volumen ajustado a " + nivel);
    }
}
