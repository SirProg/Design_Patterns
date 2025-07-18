public class CoberturaGarantiaHandler extends BaseHandler {
    @Override
    public void Manejar(Producto producto) {
        if (producto.getEnPeriodoGarantia() == true) {
            super.Manejar(producto);
        } else {
            System.out.println("El producto no está en periodo de garantía.");
        }
    }
    
}
