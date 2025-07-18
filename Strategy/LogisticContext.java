package Strategy;

public class LogisticContext {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy){
        this.strategy = strategy;
    }

    public void ejecutarAccion(/*Producto producto */){
        strategy.distribuir(/*producto */);
    }
}
