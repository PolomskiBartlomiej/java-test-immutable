import java.util.ArrayList;
import java.util.List;

class MutablePerson3 {

    private final int id;
    private final String name;
    private final String lastName;
    private final List<Email> emails;

    public MutablePerson3(int id, String name, String lastName, List<Email> emails) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.emails = new ArrayList<>(emails);
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
