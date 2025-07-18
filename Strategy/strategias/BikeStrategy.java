package Strategy.strategias;

import Strategy.RouteStrategy;

public class BikeStrategy implements RouteStrategy{
    @Override
    public void distribuir() {
        System.out.println("Distribuyendo el producto por medio de bicicleta");
    }
}
