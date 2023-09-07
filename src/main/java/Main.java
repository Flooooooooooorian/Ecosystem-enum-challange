public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("1", "Florian", Weekday.FRIDAY);
        PersonRepository repo = new PersonRepository();

        repo.savePerson(p1);

        Person result = repo.findById("1");

        if (result != null) {
            System.out.println(result.favoriteDay());
        }
    }

    public static String week(Weekday weekday) {
        if (weekday == Weekday.MONDAY ||
                weekday == Weekday.TUESDAY ||
                weekday == Weekday.WEDNESDAY ||
                weekday == Weekday.THURSDAY ||
                weekday == Weekday.FRIDAY ) {
            return weekday.toString();
        }
        return "Wochenende";
    }
}
