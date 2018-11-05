 /**
 * Реализовать очередь на почту,
 * учитывать возраст покупателей,
 * если пенсионер,
 * обслуживать без очереди.
 *
 * @version 1.0 04 Nov 2018
 * @author Pavel Shakhov
 * @param
 */
 import java.util.*;

/** Основной/главный класс программы.*/
public final class CustomersPriorityQueue {

    /**Создаем конструктор.
     */
    private CustomersPriorityQueue() { };

    /** Возраст посетителя 1.*/
    private static final int HP_AGE = 16;
    /** Возраст посетителя 2.*/
    private static final int SH_AGE = 80;
    /** Возраст посетителя 3.*/
    private static final int AD_AGE = 115;

    /** Возраст посетителя 4.*/
    private static final int GH_AGE = 17;
    /** Возраст посетителя 5.*/
    private static final int MM_AGE = 66;
    /** Возраст посетителя 6.*/
    private static final int HR_AGE = 95;

    /** Добавление и сортировка
     * посетителей в очередь.*/
    /**@param args .
     *@throws Exception .*/
    public static void main(final String[] args) {

        PriorityQueue<Customer> customers = new PriorityQueue<Customer>();

        customers.add(new Customer(HP_AGE, "Potter", "Harry", "M"));
        customers.add(new Customer(SH_AGE, "Slughorn", "Horace", "M"));
        customers.add(new Customer(AD_AGE, "Albus", "Dumbledore", "M"));

        customers.add(new Customer(GH_AGE, "Granger", "Hermione", "F"));
        customers.add(new Customer(MM_AGE, "McGonagall", "Minerva", "F"));
        customers.add(new Customer(HR_AGE, "Hooch", "Rolanda", "F"));

        System.out.println(
                "Очередь при ее наполнении:");
        for (Customer c:  customers) {
            System.out.println(c);
        }

        System.out.println("\nИзвлечение"
               + " из очереди с сортировкой:");
        while (!customers.isEmpty()) {
            System.out.println(customers.remove());
        }
    }
}