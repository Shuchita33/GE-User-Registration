import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterisedTestcases {

    User user = new User();

    @ParameterizedTest
    @CsvSource({
        "abc@g.com, true",
        "abc-100@g.com, true",
        "abc.100@gmail.com, true",
        "abc111@abc.com, true",
        "abc-100@abc.co.in, true",
        "abc.100@abc.com.in, true",
        "abc@1.com, true",
        "abc@gmail.com.com, true",
        "abc+100@gmail.com, true",
        "abc, false",
        "abc@.com.my, false",
        "abc123@g.a, false",
        "abc123@.com, false",
        "abc123@.com.com, false",
        ".abc@abc.com, false",
        "abc((*@gmail.com, false",
        "abc@%*.com, false",
        "abc..2002@gmail.com, false",
        "abc.@gmail.com, false",
        "abc@abc@gmail.com, false",
        "abc@gmail.com.11, false",
        "abc@gmail.com.ai, false"
    })
    public void test(String email, boolean expectedResult) {
        assertEquals(expectedResult, user.validateEmail(email));
    }
}
