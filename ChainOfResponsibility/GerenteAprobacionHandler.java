public class GerenteAprobacionHandler extends BaseHandler {
    private boolean decision;
    @Override
    public void Manejar(Producto producto) {
        if (decision == true) {
            super.Manejar(producto);
        } else {
            System.out.println("El gerente ha rechazado la solicitud de cambio.");
        }
    }
}


