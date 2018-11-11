import org.junit.Test;

import static org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable;

public class ImmutablePersonTest {

    @Test
    public void immutable_test() {
        assertImmutable(ImmutablePerson.class);
    }
}