import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class MainTest {


    @Test
    public void firstTestBuyingSomething() {

        VendingMachine vm = new VendingMachine();

        DrinkResult result = vm.buy(DrinkChoice.Fanta, Coins.C100, Coins.C100);

        assertNotNull(result);
    }

}
