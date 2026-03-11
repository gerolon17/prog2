package EmpresaDomotica;

public class Termostato{
    public double temperaturaActual;
    public double temperaturaDeseada;
    public boolean modoAhorroEnergia;

    public Termostato(TermostatoBuilder termostatoBuilder){
        this.temperaturaActual = termostatoBuilder.temperaturaActual;
        this.temperaturaDeseada = termostatoBuilder.temperaturaDeseada;
        this.modoAhorroEnergia = termostatoBuilder.modoAhorroEnergia;
    }

    public static class TermostatoBuilder {
        private double temperaturaActual;
        private double temperaturaDeseada;
        private boolean modoAhorroEnergia;

        public TermostatoBuilder setTemperaturaActual(double temperaturaActual){
            this.temperaturaActual = temperaturaActual;
            return this;
        }

        public TermostatoBuilder setTemperaturaDeseada(double temperaturaDeseada){
            this.temperaturaDeseada = temperaturaDeseada;
            return this;
        }

        public TermostatoBuilder setModoAhorroEnergia(boolean modoAhorroEnergia){
            this.modoAhorroEnergia = modoAhorroEnergia;
            return this;
        }

        public Termostato build(){
            return new Termostato(this);
        }
    }
}
