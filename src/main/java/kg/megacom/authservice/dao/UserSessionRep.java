package kg.megacom.authservice.dao;

import kg.megacom.authservice.models.SessionsUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

@Repository
public interface UserSessionRep extends JpaRepository <SessionsUser,Long>{
}
