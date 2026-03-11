public class Adapter implements LectorDatos {
    private LectorXML lectorXML;

    public Adapter(LectorXML lectorXML) {
        this.lectorXML = lectorXML;
    }

    @Override
    public void LeerDatos(String nombreDeRuta){
        System.out.println("Adaptador: Traduciendo la llamada al método de la librería XML...");
        LectorXML.leerArchivoXML(nombreDeRuta);
    }
}
