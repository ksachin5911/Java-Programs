package com.company;

class library {
    String[] books ;
    int no_of_books;
    library()
    {
        this.no_of_books = 0;
        this.books = new String[100];
    }
    public void add_book(String book)
    {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added.");
    }
    public void show_Available_book()
    {
        System.out.println("Available books: ");
        for(String book : this.books)
        {
            if(book == null)
            {
                continue;
            }
            System.out.println("* " + book);
        }
    }
    public void issue_book(String book)
    {
        for(int i=0;i<this.books.length;i++)
        {
            if(this.books[i].equals(book))
            {
                System.out.println(book + " book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book doesn't exist");
    }
    public void return_book(String book)
    {
        add_book(book);
    }
}
public class a90Online_Library {
    public static void main(String[] args) {
        library pantnagar = new library();
        pantnagar.add_book("The Ripleys");
        pantnagar.add_book("Peter Pen");
        pantnagar.add_book("Gulliver Travels");
        pantnagar.add_book("Data Structures");

        pantnagar.issue_book("Peter Pen");
        pantnagar.show_Available_book();
        pantnagar.return_book("Peter Pan");
        pantnagar.show_Available_book();
    }
}
