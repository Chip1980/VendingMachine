import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MainTest {


    @Test
    public void firstTestBuyingSomething() {

        VendingMachine vm = new VendingMachine();

        DrinkResult result = vm.buy(DrinkChoice.Fanta, Coins.C100, Coins.C100);

        assertNotNull(result);
        Assert.assertEquals(DrinkChoice.Fanta, result.getDrink());
        Assert.assertEquals(50, result.getRestSum());
    }

    @Test
    public void secondTestBuyingSomething() {

        VendingMachine vm = new VendingMachine();

        DrinkResult result = vm.buy(DrinkChoice.Fanta, Coins.C100, Coins.C200);

        assertNotNull(result);
        Assert.assertEquals(DrinkChoice.Fanta, result.getDrink());
        Assert.assertEquals(150, result.getRestSum());
    }

}
