public abstract class BaseHandler implements Handler {
    private Handler siguiente;

    @Override
    public void setSiguiente(Handler h) {
        this.siguiente = h;
    }

    @Override
    public void Manejar(Producto producto) {
        if (siguiente != null) {
            siguiente.Manejar(producto);
        }
    }
}

