package project0.service;

public class AccountNotFoundException extends RuntimeException {

	public AccountNotFoundException(String accNum) {
		super(accNum);
	}

}
