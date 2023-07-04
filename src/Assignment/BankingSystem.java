package Assignment;

import java.util.Scanner;

import Assignment.Transaction;
import Assignment.UnsupportedTransactionException;

public class BankingSystem {

	public static void main(String[] args) {
		 Transaction txn = new Transaction();
	        Scanner scan = new Scanner(System.in);
	        String input = scan.nextLine();
	        scan.close();
	        txn.execute(input);
	        
	    }
	}
	class Transaction{

	    void execute(String transactionType){

	        String expression = transactionType;      
	        switch(expression){
	            case "Credit": System.out.println("Credit");
	            break;
	            case "Debit": System.out.println("Debit");
	            break;
	            case "Balance Inquiry": System.out.println("Balance Inquiry");
	            break;
	            case "Pin Change": System.out.println("Pin Change");
	            break;
	            default: try {
	                throw new UnsupportedTransactionException();
	            } catch (Exception e) {
	        
	                System.out.println(e.getMessage());
	            }
	        }
	    }
	}

	class UnsupportedTransactionException extends Exception{
	    
	    @Override
	    public String getMessage(){
	        return "Unsupported Transaction Exception";
	    }
	  

	}


