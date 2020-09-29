import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    Map<DrinkChoice, Integer> state = new HashMap<>();

    public DrinkResult buy(DrinkChoice drink, Coins c100, Coins c1001) {
        return new DrinkResult();
    }
}
