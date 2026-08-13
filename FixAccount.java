package Lab6_Work;

public class FixAccount extends Account {
    public FixAccount(int id, double balance, double annualInterestRate, Person objPerson, CustomDate dateCreated) {
        super(id, balance, annualInterestRate, objPerson, dateCreated);
    }

    // Checking withdraw condition (Year difference > 1)
    public void withdraw(double amount, int currentYear) {
        if (currentYear - this.dateCreated.getYear() > 1) {
            super.withdraw(amount);
            System.out.println("Withdraw " + amount + " Baht successful.");
        } else {
            System.out.println("Cannot withdraw: Account must be opened for more than 1 year.");
        }
    }

    // Override transferMoney to prevent transferring
    @Override
    public void transferMoney(Account acc1, double amount) {
        System.out.println("Cannot transfer money: FixAccount does not support transfers.");
    }
}
