package Oct.ex_141024.Task;

public class PrintMyBookI implements Book1 {

    @Override
    public void getDetails(String bookName, String author, int price) {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Book1 book1 = new PrintMyBookI();
        book1.getDetails("Harry Potter", "J.K. Rowling", 100);
        book1.getDetails("Power of positive Thinking", " ", 170);
    }
}

interface Book1{
    void getDetails(String bookName, String author, int price);
}


