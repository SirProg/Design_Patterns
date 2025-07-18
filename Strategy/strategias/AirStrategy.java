package Strategy.strategias;

import Strategy.RouteStrategy;

public class AirStrategy implements RouteStrategy{
    @Override
    public void distribuir(/*Producto producto */) {
        System.out.println("Distribuyendo el producto por medio aereo");
    }
    
}
