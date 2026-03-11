package DTO;

public class MapperEstudianteDTO {
    public static EstudianteDTO toDTO(Estudiante estudiante) {
        return new EstudianteDTO(
            estudiante.getNombre(),
            estudiante.getApellido(),
            estudiante.getGenero(),
            estudiante.getEmail(),
            estudiante.getRh(),
            estudiante.getNivelIngles(),
            estudiante.getEstatura(),
            estudiante.getEstado(),
            estudiante.getPeso(),
            estudiante.getEtnia(),
            estudiante.getAlergia(),
            estudiante.getForaneo()
        );
    }
}
