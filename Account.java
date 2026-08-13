package Lab6_Work;

class CustomDate {
    private int day;
    private String month;
    private int year;

    public CustomDate(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

class Person {
    private String name;
    private String surname;
    private int age;
    private CustomDate bDate;

    public Person(String name, String surname, int age, CustomDate bDate) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.bDate = bDate;
    }
}

public class Account {
    protected int id;
    protected double balance;
    protected double annualInterestRate;
    protected Person objPerson;
    protected CustomDate dateCreated;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account(int id, double balance, double annualInterestRate, Person objPerson, CustomDate dateCreated) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.objPerson = objPerson;
        this.dateCreated = dateCreated;
    }

    public double getBalance() {
        return balance;
    }

    public double getMonthlyInterest() {
        return balance * ((annualInterestRate / 100) / 12);
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void transferMoney(Account acc1, double amount) {
        if (this.balance >= amount) {
            this.withdraw(amount);
            acc1.deposit(amount);
        }
    }
}