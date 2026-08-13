package Lab6_Work;

public class Lab6_2 {
    public static void main(String[] args) {
        CustomDate bDate = new CustomDate(20, "August", 1998);
        Person person = new Person("Somchai", "Rukdee", 26, bDate);
        CustomDate openDate = new CustomDate(1, "January", 2023);

        // Create FixAccount ID: 1124, Balance: 20000, Interest: 7%
        FixAccount fixAcc = new FixAccount(1124, 20000, 7.0, person, openDate);
        Account targetAcc = new Account(1100, 5000);

        System.out.println("=== Test 6.2 FixAccount ===");
        
        // Try to withdraw (Pass current year as 2025 -> 2025 - 2023 = 2 years (>1 year))
        fixAcc.withdraw(2500, 2025);
        
        // Deposit 3000 Baht
        fixAcc.deposit(3000);
        
        // Try to transfer (Should alert that transfer is not allowed)
        fixAcc.transferMoney(targetAcc, 1000);

        // Display remaining balance and monthly interest
        System.out.println("Remaining Balance: " + fixAcc.getBalance() + " Baht");
        System.out.println("Monthly Interest: " + fixAcc.getMonthlyInterest() + " Baht");
    }
}
