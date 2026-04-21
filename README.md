**Library Management System**
Project: OOP2 Project 1 Course: BSIT Section: G13 Activity: Class Diagram & Use-Case Diagram

Students:

Matthew Pasaol
Niquo Cempron Mosende
Kent Solario
Prince C. Cajocson
Description: Library Management System using OOP principles.

**Class Diagram**

classDiagram
    class Book {
        - bookID : String
        - title : String
        - author : String
        - ISBN : String
        - isAvailable : boolean
        + getBookInfo() String
        + checkAvailability() boolean
        + borrowBook() void
        + returnBook() void
    }

    class Member {
        - memberID : String
        - name : String
        - email : String
        - phoneNumber : String
        + registerMember() void
        + updateInfo() void
        + viewBorrowedBooks() List
        + borrowBook(Book) boolean
        + returnBook(Book) void
    }

    class Librarian {
        - employeeID : String
        - name : String
        - department : String
        + addBook(Book) void
        + removeBook(String) void
        + searchBook(String) Book
        + issueBook(Member, Book) void
        + acceptReturn(Member, Book) void
    }

    Member "1" --> "1..*" Book : borrows

    Notation: + = public, - = private. Arrows show associations/relationships.



   ** Use-Case Diagram**

   graph LR
    Member(["Member"])
    Librarian(["Librarian"])

    subgraph LibrarySystem["Library System"]
        UC1(["Search Book"])
        UC2(["Borrow Book"])
        UC3(["Return Book"])
        UC4(["View Account"])
        UC5(["Add Book"])
        UC6(["Remove Book"])
        UC7(["Issue Book"])
        UC8(["Generate Report"])
    end

    Member --- UC1
    Member --- UC2
    Member --- UC3
    Member --- UC4

    Librarian --- UC5
    Librarian --- UC6
    Librarian --- UC7
    Librarian --- UC8
    Librarian --- UC3
    Librarian --- UC4

    Notation: Stick figures = Actors | Ovals = Use Cases | Rectangle = System Boundary | Lines = Associations
