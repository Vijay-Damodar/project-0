package project0.service;

import java.time.LocalDateTime;

import org.apache.log4j.Logger;

import project0.entity.Account;
import project0.entity.Transaction;
import project0.entity.TransactionType;
import project0.repository.AccountRepository;

public class TransactionServiceImpl implements TransactionService {
	private static Logger logger = Logger.getLogger("txr-system");

	private AccountRepository accountRepository;

	public TransactionServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	public void transfer(double amount, String fromAcc, String toAcc) {

		logger.info("txr intiated...");

		Account fromAccount = accountRepository.load(fromAcc);

		if (fromAccount == null) {
			logger.error("account not found " + fromAcc);
			throw new AccountNotFoundException(fromAcc);
		}

		Account toAccount = accountRepository.load(toAcc);

		if (toAccount == null) {
			logger.error("account not found " + toAcc);
			throw new AccountNotFoundException(toAcc);
		}

		if (fromAccount.getBalance() < amount) {
			logger.error("no enough balance " + fromAccount.getBalance());
			throw new AccountBalanceException(fromAccount.getBalance());
		}

		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);

		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);

		Transaction debitTransaction = new Transaction(amount, TransactionType.DEBIT);
		debitTransaction.setAccount(fromAccount);

		Transaction creditTransaction = new Transaction(amount, TransactionType.CREDIT);
		creditTransaction.setAccount(toAccount);

		// TransactionRepository.save(debitTransaction)
		// TransactionRepository.save(creditTransaction)

		logger.info("txr success...");

	}

}
