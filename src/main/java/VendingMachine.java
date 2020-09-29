import java.util.*;

public class VendingMachine {

    Map<DrinkChoice, Integer> state = new HashMap<>();
    Map<Coins, Integer> coins=new HashMap<>();

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
        TreeSet<Coins> coins = new TreeSet<Coins>((o1, o2) -> Integer.compare(o2.value,o1.value));
        coins.addAll(Arrays.asList(Coins.values()));

        List<Coins> restCoins=new ArrayList<>();
        for (Coins coin : coins) {
            while (diff >= coin.value) {
                diff -= coin.value;
                restCoins.add(coin);
            }
        }

        return restCoins;
    }
}
