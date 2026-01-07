package bpi.training;

public class ATMTransaction {

	public static void checkBalance(String accountNumber, double balance) {
		try {
			System.out.println("Processing balance inquiry...");
			 
			Integer.parseInt(accountNumber);
			
			char accountType = accountNumber.charAt(0);
			
			if (accountType == '1') {
				System.out.println("Account Type: Savings");
			} else if (accountType == '2') {
				System.out.println("Account Type: Checking");
			} else {
				System.out.println("Account Type: Unknown");
			}
			
			System.out.println("Account Number: " + accountNumber);
			System.out.println("Current Balance: P" + balance);
			System.out.println("Balance inquiry successful!");
			
		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid account number format");
			System.out.println("Account numbers must be numeric.");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error: Account number is empty or invalid.");
		} finally {
			System.out.println("\n=== RECEIPT ===");
			System.out.println("Transaction Date: December 3, 2025");
			System.out.println("Transaction Type: Balance Inquiry");
			System.out.println("ATM Location: Main Branch");
			System.out.println("Thank you for banking with us!");
			System.out.println("====================\n");
		}
	}
	
	public static void main(String[] args) {
	
		// VALID SAVINGS SUCCESS
		System.out.println("--- Test 1 - Valid Savings Account ---");
		checkBalance("100123456", 15000.00);
		
		// VALID CHECKING SUCCESS
		System.out.println("--- Test 2 - Valid Checking Account ---");
		checkBalance("200987654", 25000.00);
		
		// NUMBER FORMAT EXCEPTION
		System.out.println("--- Test 3 - Invalid Account Number Format ---");
		checkBalance("ABC12345", 15000.00);
		
		// STRING INDEX OUT OF BOUNDS EXCEPTION
		System.out.println("--- Test 4 - Empty Account number ---");
		checkBalance("", 15000.00);
		}
}

