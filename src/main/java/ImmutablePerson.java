import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

final class ImmutablePerson {

    private final int id;
    private final String name;
    private final String lastName;
    private final List<Email> emails;

    public ImmutablePerson(int id,
                           String name,
                           String lastName,
                           List<Email> emails) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.emails = unmodifiableList(new LinkedList<>(emails));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Email> getEmails() {
        return emails;
    }
}
