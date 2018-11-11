import org.junit.Test;
import org.mutabilitydetector.unittesting.MutabilityAssertionError;

import static org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable;

public class MutablePersonTest {

    @Test(expected = MutabilityAssertionError.class)
    public void immutable_test() {
        assertImmutable(MutablePerson.class);
    }
}