package kg.megacom.authservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class NotSuchUser extends RuntimeException{
    public NotSuchUser(String message) {
        super(message);
    }
}
