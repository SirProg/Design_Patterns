public class Producto {
    private int precio;
    private boolean enPeriodoGarantia;
    private String tipoFallo;
    private boolean existeEnBodega;

    public Producto(int precio, boolean enPeriodoGarantia, String tipoFallo, boolean existeEnBodega) {
        this.precio = precio;
        this.enPeriodoGarantia = enPeriodoGarantia;
        this.tipoFallo = tipoFallo;
        this.existeEnBodega = existeEnBodega;
    }
    public int getPrecio() {
        return precio;
    }

    public boolean getEnPeriodoGarantia() {
        return enPeriodoGarantia;
    }

    public String getTipoFallo() {
        return tipoFallo;
    }

    public boolean getExisteEnBodega() {
        return existeEnBodega;
    }

    public void setPrecio(int p) {
        this.precio = p;
    }

    public void setEnPeriodoGarantia(boolean pg) {
        this.enPeriodoGarantia = pg;
    }

    public void setTipoFallo(String tf) {
        this.tipoFallo = tf;
    }

    public void setExisteEnBodega(boolean e) {
        this.existeEnBodega = e;
    }
}
