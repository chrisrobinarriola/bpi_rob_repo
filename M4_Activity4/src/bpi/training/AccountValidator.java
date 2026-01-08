package bpi.training;

public class AccountValidator {
	public static void main(String[] args) { 
        //10-DIGITS
        try { 
            validateAccountNumber("1234567890"); 
        } catch (Exception e) { 
            System.out.println("Error: " + e.getMessage()); 
        } 

        //SHORT
        try { 
            validateAccountNumber("123"); 
        } catch (Exception e) { 
            System.out.println("Error: " + e.getMessage()); 
        } 

        //NULL
        try { 
            validateAccountNumber(null); 
        } catch (Exception e) { 
            System.out.println("Error: " + e.getMessage()); 
        } 
    } 
	
    public static void validateAccountNumber(String accountNumber) throws Exception { 
        if (accountNumber == null) { 
            throw new NullPointerException("Cannot be null"); 
        } 

        if (accountNumber.length() != 10) { 
            throw new Exception("Must be 10 digits"); 
        } 
        System.out.println("Valid account: " + accountNumber); 
    } 
} 
