public class BookStore {
    public static void main(String[] args) {

        Book books[] = {
               new Book("Clean Code","Rober C. Martin", 2008,600),
               new Book("Effective Java", "Joshua Bloch", 2017, 1200),
        };
        System.out.println("\nYeni kitaplar başarıyla eklendi.");
        Customer customers[] = {
                new Customer("Eren", "ahmeterengursoy@gmail.com", 0)
        };
        customers[0].addBalance(100);


        System.out.println("\n Müşteriler Başarıyla Eklendi!");
        double balance= 0;
        String email = "ahmeterengursoy@gmail.com";
        Customer foundCustomer = null;
        String bookName = "Clean Code";
        Book foundBook = null;

        for (Customer c : customers){
            if (c.getEmail().equals(email)){
                foundCustomer = c;
                break;
            }
        }
        if (foundCustomer == null) throw new IllegalArgumentException("Müşteri Bulunamadı");

        for (Book b : books){
            if (b.getName().equals(bookName)){
                foundBook = b;
                break;
            }
        }
        if (foundBook == null) throw new IllegalArgumentException("Kitap Bulunamadı");
        try {
            foundCustomer.BuyBook(foundBook.getPrice());
            balance += foundBook.getPrice();
            System.out.println("\n Kitap Başarıyla Satın Alındı");
        }
        catch (IllegalArgumentException e){
            System.out.println("\n" + e.getMessage());
        }

        System.out.println("Kırtasiye Bakiye : " + balance);
        System.out.println("Müşteri Bakiye : " + foundCustomer.getBalance());

    }
}