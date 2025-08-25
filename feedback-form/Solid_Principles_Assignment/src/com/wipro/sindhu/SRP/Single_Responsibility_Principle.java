package com.wipro.sindhu.SRP;

public class Single_Responsibility_Principle {

    public static void main(String[] args) {
        Books myBook = new Books("Ghare Baire", "Rabindranath Tagore");

        Books_Printer printer = new Books_Printer();
        printer.print(myBook);

        Books_Saver saver = new Books_Saver();
        saver.save(myBook);
    }
}

// Data class - only handles book data
class Books {
    private String title_of_Book;
    private String author_of_Book;

    public Books(String title_of_Book, String author_of_Book) {
        this.title_of_Book = title_of_Book;
        this.author_of_Book = author_of_Book;
    }

    public String getTitle() {
        return title_of_Book;
    }

    public String getAuthor() {
        return author_of_Book;
    }
}

// Class for printing books (separate responsibility)
class Books_Printer {
    public void print(Books book) {
        System.out.println("Title_of_Book: " + book.getTitle() + ", Author_of_Book: " + book.getAuthor());
    }
}

// Class for saving books (separate responsibility)
class Books_Saver {
    public void save(Books books) {
        System.out.println("Saving '" + books.getTitle() + "' by " + books.getAuthor() + " to file...");
    }
}

