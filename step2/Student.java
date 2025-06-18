package Aston.step2;

import java.time.LocalDate;
import java.util.List;

public class Student {

    private String name;
    private LocalDate birthDate;
    private List<Book> books;

    public Student(String name, LocalDate birthDate,List<Book> books){
        this.name = name;
        this.birthDate = birthDate;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Student{"
                +"name = " + name + ", "
                +"birthdate = " + birthDate
                +"}";
    }
}
