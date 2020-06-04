package kg.megacom.authservice.exceptions;

public class AccountAlreadyExist extends RuntimeException {


    public AccountAlreadyExist(String message){
        super(message);
    }
}
