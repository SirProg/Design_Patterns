public class Cliente {
    public static void main(String[] args) {
        ProductoCollection coleccion = new ProductoCollection();
        coleccion.agregarProducto(new Producto(1, "Iphone 100", "disponible", "Guayaquil"));
        coleccion.agregarProducto(new Producto(2, "Iphone 50", "reparando", "Quito"));

        Iterator iterator = coleccion.mostrarProductos();

        while (iterator.hasMore()) {
            Producto p = iterator.getNext();
            System.out.println(p);
        }
    }
}
