package project0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import project0.entity.Account;
import project0.entity.Transaction;
import project0.repository.AccountRepository;
import project0.repository.JdbcAccountRepository;
import project0.repository.JdbcTransactionRepository;
import project0.repository.TransactionRepository;
import project0.service.TransactionService;
import project0.service.TransactionServiceImpl;

public class AccountTransactionApp {

	public static void main(String[] args) {

		AccountRepository accountRepository = new JdbcAccountRepository();
		TransactionService txrService = new TransactionServiceImpl(accountRepository);

		txrService.transfer(100.00, "2", "1");

	}
}