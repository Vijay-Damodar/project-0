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

public class AccountTransactionApp {

	public static void main(String[] args) {
		AccountRepository ar = new JdbcAccountRepository();
		TransactionRepository tr = new JdbcTransactionRepository();
		Transaction transaction = new Transaction(1, 500, false, 1, 2);
		
		tr.insert(transaction);
		List<Account> accounts = new ArrayList<>();
		accounts = ar.getAccounts();
		
		
//		Collections.sort(accounts, (o1,o2) -> Double.compare(o2.getBalance(), o1.getBalance()));
//		
//		for (Account account2 : accounts) {
//			System.out.println(account2);
//		}
	}
}
