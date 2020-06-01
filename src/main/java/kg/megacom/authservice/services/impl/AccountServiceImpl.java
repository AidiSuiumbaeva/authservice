package kg.megacom.authservice.services.impl;

import kg.megacom.authservice.dao.AccountRep;
import kg.megacom.authservice.models.Account;
import kg.megacom.authservice.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRep accountRep;
    @Override
    public Account save(Account account) {
        return accountRep.save(account);
    }




}
