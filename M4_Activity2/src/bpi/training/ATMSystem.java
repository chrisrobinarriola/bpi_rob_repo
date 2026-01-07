package bpi.training;

public class ATMSystem {

	// Account balances
	static double[] accounts = {10000, 15000, 20000};

	public static void processWithdrawal(String accountIndex, String amountInput) {
		try {
			int index = Integer.parseInt(accountIndex);
			double balance = accounts[index];
			double amount = Double.parseDouble(amountInput);
		
			System.out.println("Current balance: P" + balance);
			System.out.println("Withdrawal: P" + amount);
		
			if (amount > balance) {
				System.out.println("Insufficient funds! Cannot withdraw P" + amount);
			} else {
				double newBalance = balance - amount;
				accounts[index] = newBalance;
				System.out.println("New balance: P " + newBalance);
				System.out.println("Withdrawal successful!");
			}
		
			} catch (NumberFormatException e) {
				System.out.println("Error: Invalid input!");
				System.out.println("Please enter valid numbers.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Error: Account not found!");
				System.out.println("Invalid account index.");
			} catch (Exception e) {
				System.out.println("Transaction failed");
		}
	}

	public static void main(String[] args) {

		System.out.println("=== ATM Withdrawal System ===");
	
		System.out.println();
		System.out.println("--- Test 1: Valid Withdrawal ---");
		System.out.println("Account=1, Amount=5000");
		processWithdrawal("1", "5000");
	
		System.out.println();
		System.out.println("--- Test 2: Invalid Account Index ---");
		System.out.println("Account=abc, Amount=5000");
		processWithdrawal("abc", "5000");
	
		System.out.println();
		System.out.println("--- Test 3: Account Not Found ---");
		System.out.println("Account=10, Amount=5000");
		processWithdrawal("10", "5000");
	
		System.out.println();
		System.out.println("--- Test 4: Insufficient Funds ---");
		System.out.println("Account=1, Amount=20000");
		processWithdrawal("1", "20000");
	
		System.out.println();
		System.out.println("=== All tests completed! ===");
	}
}