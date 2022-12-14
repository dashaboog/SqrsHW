import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/parameteres.csv")

    public void calcSqrLimits(int lowerLimit, int higherLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcSqrs(lowerLimit, higherLimit);
        Assertions.assertEquals(expected, actual);
    }
}


