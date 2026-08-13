package Lab6_Work;

public class Lab6_1 {
    public static void main(String[] args) {
        CustomDate bDate = new CustomDate(15, "March", 2000);
        Person person = new Person("Somsri", "Sudsuay", 24, bDate);
        CustomDate openDate = new CustomDate(10, "January", 2023);

        SavingAccount savingAcc = new SavingAccount(1123, 20000, 4.5, person, openDate);
        Account targetAcc = new Account(1100, 5000);

        System.out.println("=== Test 6.1 SavingAccount ===");
        savingAcc.withdraw(2500);
        savingAcc.deposit(3000);
        savingAcc.transferMoney(targetAcc, 1000);

        System.out.println("Remaining Balance: " + savingAcc.getBalance() + " Baht");
        System.out.println("Monthly Interest: " + savingAcc.getMonthlyInterest() + " Baht");
    }
}
