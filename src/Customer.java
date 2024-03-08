public class Customer {
    private String email;
    private String name;
    private double balance;

    public Customer(String name, String email, double balance) {
        this.email = email;
        this.name = name;
        this.balance = balance;
    }
    public Customer(String name, String email){
        this.name = name;
        this.email = email;
        this.balance = 0;
    }
    public void BuyBook(double x){
        if (this.balance < x) {
            throw new IllegalArgumentException("Bakiyeniz yetersiz!");
        }
        this.balance -= x;
        System.out.println("Kitap satın alındı.");
        System.out.println("Kalan bakiye = " + this.balance);
    }
    public void addBalance(double y){
        this.balance += y;
        System.out.println("Yeni bakiyeniz : " + this.balance);
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
