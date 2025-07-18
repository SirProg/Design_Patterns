public class Producto {
    private int id;
    private String nombre;
    private String estado;
    private String tienda;

    public Producto(int id, String nombre, String estado, String tienda) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.tienda = tienda;
    }

    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", estado=" + estado + ", tienda=" + tienda + "]";
    }
    
}
