import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue = generateClients();
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            if (person.tickets > 0) {
                System.out.println(person.name + " " + person.surname + " прокатился на аттракционе");
                person.payTicket();
                if (person.tickets > 0) {
                    queue.offer(person);
                }
            } else {
                System.out.println("!!! У " + person.name + " " + person.surname + " нет билета !!!");
            }
        }
    }

    public static Queue<Person> generateClients() {
        Queue<Person> queue = new LinkedList<>();
        queue.offer(new Person("Иван", "Федоров", 1));
        queue.offer(new Person("Анна", "Дегтярева", 3));
        queue.offer(new Person("Федор", "Иванов", 2));
        queue.offer(new Person("Иосиф", "Джугашвили", 5));
        queue.offer(new Person("Наталья", "Краснова", 0));
        return queue;
    }

}
