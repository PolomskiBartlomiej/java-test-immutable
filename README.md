# java-test-immutable
Preference: https://github.com/MutabilityDetector/MutabilityDetector

# description
This project show easy test immutability object using the Mutability Decetor

**depedency**
```
<dependency>
    <groupId>org.mutabilitydetector</groupId>
    <artifactId>MutabilityDetector</artifactId>
    <version>0.6</version>
    <scope>test</scope>
</dependency>
```

# example

Using in Test method:
```
import static org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable;

public class ImmutableTest {

    @Test
    public void immutable_test() {
        assertImmutable(ImmutablePerson.class);
    }
}
```

