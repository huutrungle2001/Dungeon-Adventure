#include <bits/stdc++.h>
using namespace std;

class Book {
   private:
    string name;
    int quantity;

   public:
    Book() {
        name = " ";
        quantity = 0;
    }

    Book(string name, int quantity) {
        this->name = name;
        this->quantity = quantity;
    }

    void setName(string name) {
        this->name = name;
    }

    void setQuantity(int quantity) {
        this->quantity = quantity;
    }

    string getName() {
        return name;
    }

    int getQuantity() {
        return quantity;
    }
};

void deleteBook(Book *books, int n, int position) {
    for (int i = position; i < n - 1; i++) {
        books[i] = books[i + 1];
    }
    n--;
}

int main() {
    int n = 5;
    Book *book = new Book[n];
    book[0] = Book("C++", 10);
    book[1] = Book("Java", 20);
    book[2] = Book("Python", 30);
    book[3] = Book("C", 40);
    book[4] = Book("C#", 50);

    deleteBook(book, n, 2);

    for (int i = 0; i < n - 1; i++) {
        cout << book[i].getName() << " " << book[i].getQuantity() << endl;
    }
}