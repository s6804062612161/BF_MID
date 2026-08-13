
/*
uml class diagram
+--------------------------------------------------+
|                     Account                      |
+--------------------------------------------------+
| - id: int                                        |
| - balance: double                                |
| - annualInterestRate: double                     |
| - dateCreated: Date                              |
+--------------------------------------------------+
| + Account()                                      |
| + Account(id: int, balance: double)              |
| + getId(): int                                   |
| + setId(id: int): void                           |
| + getBalance(): double                           |
| + setBalance(balance: double): void              |
| + getAnnualInterestRate(): double                |
| + setAnnualInterestRate(rate: double): void      |
| + getDateCreated(): Date                         |
| + getMonthlyInterestRate(): double               |
| + getMonthlyInterest(): double                   |
| + withdraw(amount: double): void                 |
| + deposit(amount: double): void                  |
+--------------------------------------------------+
*/

import java.util.Date;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // ถอนเงิน
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    // ฝากเงิน
    public void deposit(double amount) {
        this.balance += amount;
    }
}

public class Lab6_5 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);

        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("ID : " + account.getId());
        System.out.println("Balance : " + account.getBalance());
        System.out.println("MonthlyInterestRate : " + (account.getMonthlyInterestRate() * 100) + " %");
        System.out.println("MonthlyInterest : " + account.getMonthlyInterest());
        System.out.println("DateCreated : " + account.getDateCreated());
    }
}

