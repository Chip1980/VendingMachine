import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    Map<DrinkChoice, Integer> state = new HashMap<>();

    public DrinkResult buy(DrinkChoice drink, Coins... c100) {
        DrinkResult drinkResult = new DrinkResult();
        drinkResult.setDrink(drink);
        return drinkResult;
    }
}
