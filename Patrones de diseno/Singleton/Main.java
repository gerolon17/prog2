package Singleton;

public class Main {
    public static void main(String[] args){
        ConexionBD c1 = ConexionBD.getInstance();
        ConexionBD c2 = ConexionBD.getInstance();

        System.out.println(c1==c2);
    }
}
