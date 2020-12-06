package Oop;

public class Interfaces {
    public static void main(String[] args) {
        Printable book = new Book("Super-man", "Noname");
        Printable journal = new Journal("VOG");
        book.print();
        journal.print();
    }
}

interface Printable {
    void print();
}


class Book implements Printable {
    String name;
    String author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void print() {
        System.out.printf("Book: %s, Author: %s\n", name, author);
    }
}

class Journal implements Printable {
    String name;

    Journal(String name) {
        this.name = name;
    }

    public void print() {
        System.out.printf("Journal: %s\n", name);
    }
}
