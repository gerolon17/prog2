package Singleton;

public class ConexionBD {
    private static ConexionBD instance;

    private ConexionBD() {
        System.out.println("Conexión a la base de datos establecida.");
    }

    public static ConexionBD getInstance() {
        if (instance == null) {
            instance = new ConexionBD();
        }
        return instance;
    }
    
}
