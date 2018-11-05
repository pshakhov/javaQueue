/**
 * Реализовать класса
 * Customer (посетитель).
 *
 * @version 1.0 04 Nov 2018
 * @author Pavel Shakhov
 * @param
 */

public class Customer implements Comparable<Customer> {
    /** Имя посетителя.*/
    private static String firstName;
    /** Фамилия посетителя.*/
    private static String lastName;
    /** Возраст посетителя.*/
    private static int age;
    /** Пол посетителя.*/
    private static String sex;

    /** Максимальный рабочий
     * возраст для женщин.*/
    private static final int TOP_F_AGE = 60;
    /** Максимальный рабочий
     * возраст для мужчин.*/
    private static final int TOP_M_AGE = 65;

    /** Класс посетителя.
     * @param age .
     * @param firstName .
     * @param lastName .
     * @param sex . */
    public Customer(final int age, final String lastName,
                    final String firstName, final String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    /** Геттер для возраста.
     * @return */
    public int getAge() {
        return age;
    }

    /** Перегрузка метода compareTo.*/
    /** @param c .
     * @return */
    public int compareTo(final Customer c) {
        if ((sex == "M") && (c.age - TOP_M_AGE > 0)) {
            //return (c.age - 65);
            return 1;
        } else if ((sex == "M") && (c.age - TOP_M_AGE < 0)) {
            return -1;
        } else if ((sex == "F") && (c.age - TOP_F_AGE > 0)) {
                return 1;
        } else if ((sex == "F") && (c.age - TOP_F_AGE < 0)) {
            //return (c.age - 60);
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    /** Вывод данных посетителей в строку.*/
    public String toString() {
        return "{"
                + "Last name = '" + lastName + '\''
                + ", first name = " + firstName
                + ", age = '" + age + '\''
                + '}';
    }
}