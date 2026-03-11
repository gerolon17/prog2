package DTO;

public class EstudianteDTO {
    public String nombre;
    public String apellido;
    public String genero;
    public String email;
    public String rh;
    public String nivelIngles;
    public String estatura;
    public String estado;
    public String peso;
    public String etnia;
    public String alergia;
    public String foraneo;

    public EstudianteDTO(String nombre, String apellido, String genero, String email, String rh, String nivelIngles,
            String estatura, String estado, String peso, String etnia, String alergia, String foraneo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.email = email;
        this.rh = rh;
        this.nivelIngles = nivelIngles;
        this.estatura = estatura;
        this.estado = estado;
        this.peso = peso;
        this.etnia = etnia;
        this.alergia = alergia;
        this.foraneo = foraneo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getNivelIngles() {
        return nivelIngles;
    }

    public void setNivelIngles(String nivelIngles) {
        this.nivelIngles = nivelIngles;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getForaneo() {
        return foraneo;
    }

    public void setForaneo(String foraneo) {
        this.foraneo = foraneo;
    }

    
    
}