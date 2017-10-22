public class Person implements Comparable<Person> {

    String name;
    String surname;

    @Override
    public int compareTo(Person o) {
        int nameCmp = this.name.compareTo(o.name);
        if (nameCmp == 0) {
            return this.surname.compareTo(o.surname);
        }
        return nameCmp;
    }
}
