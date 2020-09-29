import java.util.*;

public class VendingMachine {

    Map<DrinkChoice, Integer> state = new HashMap<>();

    public DrinkResult buy(DrinkChoice drink, Coins... coin) {
        DrinkResult drinkResult = new DrinkResult();
        drinkResult.setDrink(drink);
        drinkResult.setRest(calculateRest(coin, drink.cost));
        return drinkResult;
    }

    private List<Coins> calculateRest(Coins[] coin, int drinkValue) {
        int coinSum = Arrays.stream(coin).map(coins -> coins.value).reduce(0, Integer::sum);
        if(coinSum < drinkValue) {
            throw new NeedMoreMoneyException();
        }
        int diff = coinSum - drinkValue;
        return calculateRestCoins(diff);
    }

    private List<Coins> calculateRestCoins(int diff) {
        new TreeSet<Coins>(Coins.values());
        while(diff > 0) {

        }
    }
}
