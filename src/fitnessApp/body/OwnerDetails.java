package fitnessApp.body;

import java.time.LocalDate;

/**
 * @author Alexander Iablonski
 * */
public class OwnerDetails {
    private String name;
    private String surname;
    private LocalDate yearOfBirth;

    public OwnerDetails(String name, String surname, LocalDate yearOfBirth) {
        setName(name);
        setSurname(surname);
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String name) {
        if (name == null || name.length() < 2) {
            throw new IllegalArgumentException("Значение name от 2 символов");
        }
        this.name = name;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.length() < 3) {
            throw new IllegalArgumentException("Значение surname от 3 символов");
        }
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "OwnerDetails{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}

