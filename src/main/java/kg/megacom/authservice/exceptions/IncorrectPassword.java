package kg.megacom.authservice.exceptions;

import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
public class IncorrectPassword extends RuntimeException{
    public IncorrectPassword(String message) {
        super(message);
    }
}
