package Home_Work.lesson1;

import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;

        // Вариант сгенерированный автоматически
        // return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);

        // Мой вариант
        // Можно использовать такой вариант? Если да, то в чем разница между моим и автоматически сгенерированным?
        return firstName.equals(author.firstName) && lastName.equals(author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Автор: " + firstName + " " + lastName;
    }
}
