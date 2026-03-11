package Builder;

public class ClienteBuilder {
    public String pan;
    public String carne;
    public String queso;
    public String tomate;
    public String cebolla;
    public String lechuga;
    public String salsa;
    public String pepinillos;
    public String tocino;
    public String huevo;
    public String aguacate;
    public String champinones;

    public ClienteBuilder pan(String pan) {
        this.pan = pan;
        return this;
    }

    public ClienteBuilder carne(String carne) {
        this.carne = carne;
        return this;
    }

    public ClienteBuilder queso(String queso) {
        this.queso = queso;
        return this;
    }

    public ClienteBuilder tomate(String tomate){
        this.tomate = tomate;
        return this;
    }

    public ClienteBuilder cebolla(String cebolla){
        this.cebolla = cebolla;
        return this;
    }

    public ClienteBuilder lechuga(String lechuga){
        this.lechuga = lechuga;
        return this;
    }

    public ClienteBuilder salsa(String salsa){
        this.salsa = salsa;
        return this;
    }

    public ClienteBuilder pepinillos(String pepinillos){
        this.pepinillos = pepinillos;
        return this;
    }

    public ClienteBuilder tocino(String tocino){
        this.tocino = tocino;
        return this;
    }

    public ClienteBuilder huevo(String huevo){
        this.huevo = huevo;
        return this;
    }

    public ClienteBuilder aguacate(String aguacate){
        this.aguacate = aguacate;
        return this;
    }

    public ClienteBuilder champinones(String champinones){
        this.champinones = champinones;
        return this;
    }

    public Hamburguesa build(){
        return new Hamburguesa(pan, carne, queso, tomate, cebolla, lechuga, salsa, pepinillos, tocino, huevo, aguacate, champinones);
    }
}
