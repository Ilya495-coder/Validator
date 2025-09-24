import org.example.EmailValidator;

import org.example.UserValidator;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.Assert.*;
import org.junit.jupiter.params.ParameterizedTest;

public class UserValidatorTest {
    UserValidator UserValidator = new UserValidator();
    @ParameterizedTest
    @CsvSource({
            "privet, true",
            "prive, true",
            "pri ve, false",
            " , false",
            "priveprivepriveprive, true",
            "privepriveprivepriv, true",
            "privet123, true",
            "o12345, true",
            "o1234_5, true",
            "1234_5, false",
            "u234}{5, false",
            "привет5, false",
            "pppp, false",
            "priveprivepriveprivet, false",
    })
    public void printInfo(String login, boolean actual){

        boolean expqcted = UserValidator.getUsername(login);
        assertEquals(actual,expqcted);

    }
    @ParameterizedTest
    @CsvSource({
            "privet1e, true",
            "priveeee1ee, true",
            "pri ve, false",
            " , false",
            "privYp4rivepriveprive, true",
            "1234_5, false",
            "u234}{5, false",
            "привет5, false",
            "pppp, false",
            "priveprivepriveprivet, false"
    })
    public void printInfoPassword(String pussword, boolean actual){
        boolean expqcted = UserValidator.getUsername(pussword);
        assertEquals(actual, expqcted);
    }
}
