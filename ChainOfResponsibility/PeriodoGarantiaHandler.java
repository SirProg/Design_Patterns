public class PeriodoGarantiaHandler extends BaseHandler {
    @Override
    public void Manejar(Producto producto) {
        if (producto.getTipoFallo().equals("Hardware")) {
            super.Manejar(producto);
        }
        else {
            System.out.println("El fallo no está cubierto por la garantía.");
        }
    }
}


