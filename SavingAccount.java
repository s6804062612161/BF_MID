package Lab6_Work;

public class SavingAccount extends Account {
    public SavingAccount(int id, double balance, double annualInterestRate, Person objPerson, CustomDate dateCreated) {
        super(id, balance, annualInterestRate, objPerson, dateCreated);
    }

    @Override
    public void transferMoney(Account acc1, double amount) {
        double totalDeduct = amount + 20;
        if (this.balance >= totalDeduct) {
            this.balance -= totalDeduct;
            acc1.deposit(amount);
            System.out.println("Transferred " + amount + " Baht successfully (Fee: 20 Baht).");
        } else {
            System.out.println("Transfer failed: Insufficient balance for fee.");
        }
    }
}
