var Book = /** @class */ (function () {
    function Book(title) {
        this.title = title;
    }
    return Book;
}());
var Library = /** @class */ (function () {
    function Library(name, books) {
        this.name = name;
        this.books = books;
    }
    Library.prototype.showBooks = function () {
        console.log("Library: " + this.name);
        this.books.forEach(function (book) { return console.log(book.title); });
    };
    return Library;
}());
// Execution
var b1 = new Book("Clean Code");
var b2 = new Book("Design Patterns");
var library = new Library("City Library", [b1, b2]);
library.showBooks();
// Destroy library reference
library = null;
// Books still exist
console.log(b1.title + " still exists");
console.log(b2.title + " still exists");
