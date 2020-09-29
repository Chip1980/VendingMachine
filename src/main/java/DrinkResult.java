import java.util.ArrayList;

public class DrinkResult {

    private DrinkChoice drink;
    private ArrayList<Coins> rest;

    public ArrayList<Coins> getRest() {
        return rest;
    }

    public void setRest(ArrayList<Coins> rest) {
        this.rest = rest;
    }

    public DrinkChoice getDrink() {
        return drink;
    }

    public void setDrink(DrinkChoice drink) {
        this.drink = drink;
    }
}
