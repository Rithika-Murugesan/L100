using System;
using System.Collections.Generic;

class Book
{
    public string Title;

    public Book(string title)
    {
        Title = title;
    }
}

class Library
{
    private string name;
    private List<Book> books; // Aggregation

    public Library(string name, List<Book> books)
    {
        this.name = name;
        this.books = books;
    }

    public void ShowBooks()
    {
        Console.WriteLine("Library: " + name);
        foreach (var book in books)
        {
            Console.WriteLine(book.Title);
        }
    }
}

class Program
{
    static void Main()
    {
        Book b1 = new Book("Clean Code");
        Book b2 = new Book("Design Patterns");

        Library library = new Library(
            "City Library",
            new List<Book> { b1, b2 }
        );

        library.ShowBooks();

        // Destroy library
        library = null;

        // Books still exist
        Console.WriteLine(b1.Title + " still exists");
        Console.WriteLine(b2.Title + " still exists");
    }
}
