import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachine {

    Map<DrinkChoice, Integer> state = new HashMap<>();

    public DrinkResult buy(DrinkChoice drink, Coins... coin) {
        DrinkResult drinkResult = new DrinkResult();
        drinkResult.setDrink(drink);
        drinkResult.setRest(calculateRest(coin));
        return drinkResult;
    }

    private List<Coins> calculateRest(Coins[] coin) {
        
    }
}
