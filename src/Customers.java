/**
 * Класс посетителя.
 * @version   05 Nov 2018
 * @author    Shakhov Pavel
 */

public final class Customers {
    /** Предельный рабочий возраст для М.*/
    public static final int RETIRED_MALE_AGE = 65;
    /** Предельный рабочий возраст для Ж.*/
    public static final int RETIRED_FEMALE_AGE = 63;

    /** Имя посетителя.*/
    private String name;
    /** Пол посетителя.*/
    private char sex;
    /** Возраст посетителя.*/
    private int age;

    /** Геттер имени посетителя.
     *  @return */
    public String getName() {
        return name;
    }

    /** Сеттер имени посетителя.
     * @param n .*/
    public void setName(final String n) {
        this.name = name;
    }

    /** Геттер пола посетителя.
     * @return */
    public char getSex() {
        return sex;
    }

    /** Сеттер пола посетителя.
     * @param s .*/
    public void setSex(final char s) {
        this.sex = sex;
    }

    /** Геттер возраста посетителя.
     * @return */
    public int getAge() {
        return age;
    }

    /** Сеттер пола посетителя.
     * @param a .*/
    public void setAge(final int a) {
        this.age = age;
    }

    /** Сеттер пола посетителя.
     * @param n  .
     * @param a .
     * @param s . */
    public Customers(final String n, final char s, final int a) {
        this.name = n;
        this.sex = s;
        this.age = a;
    }

    /** Вовзращает пенсионный
     * возраст для конкретного пола.
     * @return */
    public int getRetiredAge() {
        if (sex == 'm') {
            return RETIRED_MALE_AGE;
        } else if (sex == 'f') {
            return RETIRED_FEMALE_AGE;
        }
        throw new IllegalArgumentException("Incorrect sex or its register!");
    }
}