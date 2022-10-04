package co.edu.unisabana.parcialarquitectura;

public class AccessData {

    private final Conexion conexion;

    public AccessData(Conexion conexion) {
        this.conexion = conexion;
    }

    void getData() {
        conexion.getData();
    }
}
