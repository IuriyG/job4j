package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 120);
        Book book2 = new Book("Head First Java", 708);
        Book book3 = new Book("Core Java", 866);
        Book book4 = new Book("Thinking in Java", 1320);

        Book[] prod = new Book[4];

        prod[0] = book1;
        prod[1] = book2;
        prod[2] = book3;
        prod[3] = book4;

        for (int index = 0; index < prod.length; index++) {
            Book bk = prod[index];
            System.out.println(bk.getName() + " - " + bk.getPages() + " pages");
        }
        System.out.println();
        prod[0] = book4;
        prod[3] = book1;

        for (int index = 0; index < prod.length; index++) {
            Book bk = prod[index];
            System.out.println(bk.getName() + " - " + bk.getPages() + " pages");
        }
        System.out.println();

        for (Book b : prod) {
            if (b.equals(book1)) {
                System.out.println(b.getName() + " - " + b.getPages() + " pages");
            }
        }
    }
}
