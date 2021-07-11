package project0.repository;

import project0.entity.Account;

public interface AccountRepository {

	Account load(String accNumber);

	void update(Account account);
}
