package bpi.training;

public class BankAccount {
	
	public static void main(String[] args) {
		System.out.println("=== Bank Account Name Display ===");
		System.out.println();
		testCase("ACC-001");
		System.out.println();
		testCase("ACC-999");
		System.out.println();
		System.out.println("=== Program Completed Successfully! ===");
	}
	
	public static String getAccountName(String accountNumber) {
		if(accountNumber.equals("ACC-001")) {
			return "Juan Dela Cruz";
		} else if(accountNumber.equals("ACC-002")) {
			return "Maria Santos";
		} else {
			return null;
		}
	}
	
	public static void testCase(String accountNumber) {
		System.out.println("Looking up account: " + accountNumber);
		
		try {
			String name = getAccountName(accountNumber);
			String upperName = name.toUpperCase();
			System.out.println("Account Holder: " + upperName);
		} catch (NullPointerException e) {
			System.out.println("Error: Account not found!!");
		}
	}
}
