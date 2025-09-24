import org.example.EmailValidator;

import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.Assert.*;
import org.junit.jupiter.params.ParameterizedTest;

public class EmailValidatorTest {
    @ParameterizedTest
    @CsvSource({
            "Test1234@.ru, true",
            "test1234 @.ru   , false",
            "test123   , false",
            "te@.sttest   , false",
            "TEST1234   , false",
            "TESTtest   , false",
            "   , false"

    })
    public void getInfo(String email, boolean item) {
        EmailValidator emailValidator = new EmailValidator();
        boolean test = emailValidator.isEmailValidator(email);
        assertEquals(item, test);
    }
}