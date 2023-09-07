import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonRepository {
    private Map<String, Person> persons = new HashMap<>();

    public Person findById(String id ){
        return persons.get(id);
    }

    public Person savePerson(Person person) {
        persons.put(person.id(), person);
        return person;
    }
}
