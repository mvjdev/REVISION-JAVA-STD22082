package assertion;

import org.example.Assertion;
import org.example.Evaluator;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertionTest {
    @Test
    void affirmation_assetion(){
        var assertion = new Assertion(
                "Le ciel est rouge"
        );
        var evaluator = new Evaluator();
        Boolean result = evaluator.evaluate(assertion);
        assertEquals(false,result);
    }
}
