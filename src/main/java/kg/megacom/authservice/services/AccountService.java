package kg.megacom.authservice.services;

import kg.megacom.authservice.models.Account;

public interface AccountService {
    Account save(String login, String password);



}
