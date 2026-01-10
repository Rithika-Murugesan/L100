class Book {
    title: string;

    constructor(title: string) {
        this.title = title;
    }
}

class Library {
    private name: string;
    private books: Book[]; // Aggregation

    constructor(name: string, books: Book[]) {
        this.name = name;
        this.books = books;
    }
    showBooks(): void {
        console.log("Library: " + this.name);
        this.books.forEach(book => console.log(book.title));
    }
}

// Execution
const b1 = new Book("Clean Code");
const b2 = new Book("Design Patterns");

let library: Library | null = new Library(
    "City Library",
    [b1, b2]
);
library.showBooks();
// Destroy library reference
library = null;

// Books still exist
console.log(b1.title + " still exists");
console.log(b2.title + " still exists");


