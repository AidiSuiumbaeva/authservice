package kg.megacom.authservice.services.impl;

import kg.megacom.authservice.dao.AccountRep;
import kg.megacom.authservice.exceptions.IncorrectPassword;
import kg.megacom.authservice.exceptions.NoSuchUser;
import kg.megacom.authservice.models.Account;
import kg.megacom.authservice.services.LoginService;
import kg.megacom.authservice.services.UserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

@Autowired
private AccountRep accountRep;

@Autowired
private UserSessionService userSessionService;
    @Override
    public String login(String login, String password) {
        Account account=accountRep.findByLogin(login);
        if(account==null){
throw new NoSuchUser("User is not found");
        }
        if(!account.getPassword().equals(password))
        {throw new IncorrectPassword("incorrect_" +
                "password");
        }

        String token=userSessionService.getToken();
        userSessionService.save(token,account);
            return token;
    }
}
