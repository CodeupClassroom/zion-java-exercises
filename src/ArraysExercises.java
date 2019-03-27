import java.util.Arrays;
import oop.Person;

public class ArraysExercises {

    static Person[] addPerson(Person[] oldPeople, Person newPerson) {
        Person[] newPeople;
//      newPeople = new Person[oldPeople.length+1];
        newPeople = Arrays.copyOf(oldPeople, oldPeople.length+1);

        newPeople[newPeople.length - 1] = newPerson;

        return newPeople;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers)); //[I@610455d6

        Person[] people = new Person[3];
        people[0] = new Person("Sally");
        people[1] = new Person("Susan");
        people[2] = new Person("Bill");

        for (Person person : people) {
            System.out.println(person.name);
        }

        System.out.println();
        Person[] morePeople = addPerson(people, new Person("Wall-e"));
        for (Person person : morePeople) {
            System.out.println(person.name);
        }
    }
}
