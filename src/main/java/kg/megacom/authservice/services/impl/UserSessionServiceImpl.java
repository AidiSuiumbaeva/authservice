package kg.megacom.authservice.services.impl;

import kg.megacom.authservice.dao.UserSessionRep;
import kg.megacom.authservice.models.Account;
import kg.megacom.authservice.models.SessionsUser;
import kg.megacom.authservice.services.UserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.UUID;

@Service
public class UserSessionServiceImpl implements UserSessionService {

   @Autowired
   private UserSessionRep userSessionRep;
    @Override
    public String getToken() {
        return UUID.randomUUID().toString();
    }

    @Override
    public void save(String token, Account account) {
        SessionsUser sessionsUser=new SessionsUser();
        sessionsUser.setAccount(account);
        sessionsUser.setToken(token);
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.MINUTE,5);
        sessionsUser.setExpireDate(calendar.getTime());
userSessionRep.save(sessionsUser);
    }
}
