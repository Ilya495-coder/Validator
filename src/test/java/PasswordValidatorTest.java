import org.example.PasswordValidator;

import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.Assert.*;
import org.junit.jupiter.params.ParameterizedTest;

public class PasswordValidatorTest {
    @ParameterizedTest
    @CsvSource({
            "Test1234, true",
             "test1234   , false",
            "test123   , false",
            "testtest   , false",
            "TEST1234   , false",
            "TESTtest   , false",
            "   , false"

    })
    public void getInfo(String password, boolean item){
        PasswordValidator passwordValidator = new PasswordValidator();
        boolean test = passwordValidator.isPasswordValidator(password);
        assertEquals(item,test);
    }




}
