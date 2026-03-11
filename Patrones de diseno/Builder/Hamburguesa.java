package Builder;

public class Hamburguesa {
    String pan;
    String carne;
    String queso;
    String tomate;
    String cebolla;
    String lechuga;
    String salsa;
    String pepinillos;
    String tocino;
    String huevo;
    String aguacate;
    String champinones;

    public Hamburguesa(String pan, String carne, String queso, String tomate, String cebolla, String lechuga,
            String salsa, String pepinillos, String tocino, String huevo, String aguacate, String champinones) {
        this.pan = pan;
        this.carne = carne;
        this.queso = queso;
        this.tomate = tomate;
        this.cebolla = cebolla;
        this.lechuga = lechuga;
        this.salsa = salsa;
        this.pepinillos = pepinillos;
        this.tocino = tocino;
        this.huevo = huevo;
        this.aguacate = aguacate;
        this.champinones = champinones;
    }

    public static ClienteBuilder builder(){
        return new ClienteBuilder();
    }

    public String getPan() {
        return pan;
    }
    public void setPan(String pan) {
        this.pan = pan;
    }
    public String getCarne() {
        return carne;
    }
    public void setCarne(String carne) {
        this.carne = carne;
    }
    public String getQueso() {
        return queso;
    }
    public void setQueso(String queso) {
        this.queso = queso;
    }
    public String getTomate() {
        return tomate;
    }
    public void setTomate(String tomate) {
        this.tomate = tomate;
    }
    public String getCebolla() {
        return cebolla;
    }
    public void setCebolla(String cebolla) {
        this.cebolla = cebolla;
    }
    public String getLechuga() {
        return lechuga;
    }
    public void setLechuga(String lechuga) {
        this.lechuga = lechuga;
    }
    public String getSalsa() {
        return salsa;
    }
    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }
    public String getPepinillos() {
        return pepinillos;
    }
    public void setPepinillos(String pepinillos) {
        this.pepinillos = pepinillos;
    }
    public String getTocino() {
        return tocino;
    }
    public void setTocino(String tocino) {
        this.tocino = tocino;
    }
    public String getHuevo() {
        return huevo;
    }
    public void setHuevo(String huevo) {
        this.huevo = huevo;
    }
    public String getAguacate() {
        return aguacate;
    }
    public void setAguacate(String aguacate) {
        this.aguacate = aguacate;
    }
    public String getChampinones() {
        return champinones;
    }
    public void setChampinones(String champinones) {
        this.champinones = champinones;
    }

    
}
