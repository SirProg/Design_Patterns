package Strategy.strategias;

import Strategy.RouteStrategy;

public class AutoStrategy implements RouteStrategy{
    @Override
    public void distribuir() {
        System.out.println("Distribuyendo el producto por medio de automovil");
    }
    
}
