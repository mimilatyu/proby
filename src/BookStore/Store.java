package BookStore;

import java.io.IOException;

public class Store {
    public static void main (String[] args) throws IOException {
        Book[] bookList = new Book[99];

        Book book1 = new Book();
        book1.name = "Holy Bible";
        book1.date = 1000;
        book1.price = 200;
        addBook(bookList, book1);

        Book book2 = new Book();
        book2.name = "Koran";
        book2.date = 1001;
        book1.price = 201;
        addBook(bookList, book2);

        Book book3 = new Book();
        book3.name = "Tora";
        book3.date = 900;
        book3.price = 10000;
        addBook(bookList, book3);

        printAllBooks(bookList);

    }

    public static boolean checkBook(Book[] bookList, Book book) {
        for (Book item: bookList) {
            if (item !=null && item.name.equals(book.name) && item.date == book.date) {
                System.out.println("Данная книга есть в базе");
                return true;
            }
        }
        System.out.println("Данной книги нет в базе");
        return false;
    }

    public static void addBook (Book[] bookList, Book book) {
        if (!checkBook(bookList, book)) {
            for (int i = 0; i<bookList.length; i++) {
                if(bookList[i] == null) {
                    bookList[i] = book;
                    System.out.println("Книга добавлена");
                    break;
                }
                if(i==bookList.length-1){
                    System.out.println("Картотека переполнена");
                }
            }
        }
    }

    public static void printAllBooks(Book[] bookList){
        for(int i=0; i<bookList.length; i++) {
                System.out.printf("книга №%d: название: \"%s\", год издания: %dг., цена - %dusd \n",
                        i+1, bookList[i].name, bookList[i].date, bookList[i].price);
            }
        }
    }



