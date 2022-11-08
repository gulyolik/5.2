import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void shouldCalculateBonus(int expected, long amount, boolean registered) {
        BonusService service = new BonusService();
        int actual = (int) service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
}
