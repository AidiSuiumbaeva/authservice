package kg.megacom.authservice.controllers;

import io.swagger.annotations.Api;
import kg.megacom.authservice.models.Account;
import kg.megacom.authservice.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/account")
@Api(value = " Management",description = "Методы для управления аккаунтом")
public class AccountCTRL {
    @Autowired
    private AccountService service;

    @PostMapping(name = "/save")
    public Account save(@RequestBody Account account){
        return service.save(account);
    }



}
