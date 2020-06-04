package kg.megacom.authservice.services.impl;

import kg.megacom.authservice.dao.AccountRep;
import kg.megacom.authservice.exceptions.AccountAlreadyExist;
import kg.megacom.authservice.models.Account;
import kg.megacom.authservice.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRep accountRep;
    @Override
    public Account save(String login, String password ){
        Account account=accountRep.findByLogin(login);
        if(account!=null){
            throw new AccountAlreadyExist("Account already exist");
        }
        account= new Account();
        account.setLogin(login);
        account.setPassword(password);
        account.setActive(true);
        account=accountRep.save(account);
        return account;

    }




}
