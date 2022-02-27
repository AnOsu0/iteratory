package example1;

import java.util.*;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Anna", "Nowak", 27);
        Person person2 = new Person("Michał", "Bobek", 23);
        Person person3 = new Person("Marian", "Kowalski", 45);
        Person person4 = new Person("Karolina", "Załubska", 12);
        Person person5 = new Person("Leszek", "Stary", 67);

        Map<String, Person> people = new TreeMap<>();
        people.put(person1.getLastName(), person1);
        people.put(person2.getLastName(), person2);
        people.put(person3.getLastName(), person3);
        people.put(person4.getLastName(), person4);
        people.put(person5.getLastName(), person5);

        Set<String> keys = people.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(people.get(key));
        }
    }
}
