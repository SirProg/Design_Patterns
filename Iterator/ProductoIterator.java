import java.util.List;

public class ProductoIterator implements Iterator {
     private List<Producto> productos;
    private int posicion = 0;

    public ProductoIterator(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public boolean hasMore() {
        return posicion < productos.size();
    }

    @Override
    public Producto getNext() {
        return productos.get(posicion++);
    }
}
