package com.company;

/**
 * A class describing the entity Subdivision.
 */
class Subdivision {

    /**
     * Subdivision ID
     */
    private final int id;

    /**
     * Subdivision name
     */
    private final String title;

    /**
     * Class Constructor
     * @param title Subdivision name
     * @param id_subd Subdivision ID
     */
    public Subdivision(String title, int id_subd)
    {
        this.title = title;
        id = id_subd;
    }

    /**
     * The method of obtaining the ID of the subdivision
     * @return Subdivision ID
     */
    public int getId() { return id; }

    /**
     * The method of obtaining the name of the subdivision
     * @return Subdivision name
     */
    public String getTitle() { return title; }
}

/**
 * A class containing information about a person
 */
public class Person {

    /**
     * Person ID
     */
    private final String id;

    /**
     * Person name
     */
    private final String name;

    /**
     * Person gender
     */
    private final String gender;

    /**
     * Person salary
     */
    private final String salary;

    /**
     * Person birthday
     */
    private final String birthDate;

    /**
     * Person subdivision
     */
    private final Subdivision subd;

    /**
     * Default Class Constructor
     */
    public Person() {
        id = "";
        name = "";
        gender = "";
        salary = "";
        birthDate = "";
        subd = new Subdivision("", 0);
    }

    /**
     * Class Constructor
     * @param id Person ID
     * @param name Person name
     * @param gender Person gender
     * @param salary Person salary
     * @param birthDate Person birthday
     * @param title Person subdivision name
     * @param id_subd Person subdivision id
     */
    Person(String id, String name, String gender, String salary, String birthDate, String title_subd, int id_subd)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.birthDate = birthDate;
        subd = new Subdivision(title_subd, id_subd);
    }

    /**
     * Override method toString()
     * @return string of person information
     */
    @Override
    public String toString() {
        return id + "; " +
                name + "; " +
                gender + "; " +
                salary + "; " +
                birthDate + "; " +
                subd.getTitle() + "; " +
                subd.getId();
    }
}
