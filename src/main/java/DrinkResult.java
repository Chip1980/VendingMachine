import java.util.List;

public class DrinkResult {

    private DrinkChoice drink;
    private List<Coins> rest;

    public List<Coins> getRest() {
        return rest;
    }

    public void setRest(List<Coins> rest) {
        this.rest = rest;
    }

    public DrinkChoice getDrink() {
        return drink;
    }

    public void setDrink(DrinkChoice drink) {
        this.drink = drink;
    }

    public int getRestSum() {
        return rest.stream().map(coins -> coins.value).reduce(0, Integer::sum);
    }
}
