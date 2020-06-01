package kg.megacom.authservice.dao;

import kg.megacom.authservice.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.xml.transform.sax.SAXTransformerFactory;

@Repository
public interface AccountRep extends JpaRepository< Account,Long> {
    Account findByLogin(String login);
}
