import java.util.ArrayList;
import java.util.List;

public class ProductoCollection implements ProductoIteratorInterface {
    private List<Producto> productos;

    public ProductoCollection() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public Iterator mostrarProductos() {
        return new ProductoIterator(productos);
    }
}
