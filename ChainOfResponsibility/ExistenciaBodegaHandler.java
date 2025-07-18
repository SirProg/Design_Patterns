public class ExistenciaBodegaHandler extends BaseHandler {
    @Override
    public void Manejar(Producto producto) {
        if (producto.getExisteEnBodega()==true) {
            super.Manejar(producto);
        } else {
            System.out.println("El producto no está disponible en bodega.");
        }
    }
    
}


