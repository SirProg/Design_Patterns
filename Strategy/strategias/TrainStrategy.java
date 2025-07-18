package Strategy.strategias;

import Strategy.RouteStrategy;

public class TrainStrategy implements RouteStrategy{
    @Override
    public void distribuir() {
        System.out.println("Distribuyendo el producto por medio de Tren");
    }
    
}
