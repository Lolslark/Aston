package Aston.step2;

import java.time.LocalDate;
import java.util.*;

public class Main {
    static Random random = new Random();
    static List<Book> books = new ArrayList<>();
    static {
        books.add(new Book("The Schopenhauer Cure", "Irvin Yalom", 384, 2005));
        books.add(new Book("A Time to live and a time to Die", "Erich Remark", 447, 1954));
        books.add(new Book("Roadside picnic", "Strugatsky, Arkady and Boris", 256, 1971));
        books.add(new Book("We", "Evgeniy Zamyatin", 224, 1920));
        books.add(new Book("Howard Lovecraft", "The Call of Cthulhu", 480, 1926));
        books.add(new Book("Slaughterhouse-Five", "Kurt Vonnegut", 275, 1969));
        books.add(new Book("The Master and Margarita", "Mikhail Bulgakov", 384, 1967));
        books.add(new Book("Flowers for Algernon", "Daniel Keyes", 311, 1966));
        books.add(new Book("The Left Hand of Darkness", "Ursula K. Le Guin", 304, 1969));
        books.add(new Book("The Unbearable Lightness of Being", "Milan Kundera", 314, 1984));
        books.add(new Book("Neuromancer", "William Gibson", 271, 1984));
        books.add(new Book("The Stranger", "Albert Camus", 123, 1942));
        books.add(new Book("One Hundred Years of Solitude", "Gabriel García Márquez", 417, 1967));
        books.add(new Book("Dune", "Frank Herbert", 412, 1965));
        books.add(new Book("The Brothers Karamazov", "Fyodor Dostoevsky", 796, 1880));
        books.add(new Book("Brave New World", "Aldous Huxley", 288, 1932));
        books.add(new Book("The Shadow of the Wind", "Carlos Ruiz Zafón", 487, 2001));
        books.add(new Book("The Name of the Rose", "Umberto Eco", 536, 1980));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 277, 1951));
        books.add(new Book("The Plague", "Albert Camus", 308, 1947));
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Danila Obrazumov", LocalDate.of(1998, 3, 19), getBooks()));
        students.add(new Student("Ivan Petrov", LocalDate.of(1999, 5, 14), getBooks()));
        students.add(new Student("Ekaterina Smirnova", LocalDate.of(2000, 2, 23), getBooks()));
        students.add(new Student("Dmitry Volkov", LocalDate.of(1998, 11, 7), getBooks()));
        students.add(new Student("Anna Kozlova", LocalDate.of(2001, 8, 30), getBooks()));

        students.stream()
                .peek(System.out::println)
                .map(Student::getBooks)
                .flatMap(Collection::stream)
                .sorted((book1, book2) -> book1.getPages() - book2.getPages())
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Book not found."));
    }

    public static List<Book> getBooks() {
        List<Book> result = new ArrayList<>();
        for (int i = 0; i <= random.nextInt(10) + 5; i++){
            result.add(books.get(random.nextInt(books.size())));
        }
        return result;
    }
}
