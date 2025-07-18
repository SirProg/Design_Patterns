package Strategy.strategias;

import Strategy.RouteStrategy;

public class WaterStrategy implements RouteStrategy{
    @Override
    public void distribuir() {
        System.out.println("Distribuyendo el producto por medio maritimo");
    }
    
}
