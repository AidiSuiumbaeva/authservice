package kg.megacom.authservice.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "user_sessions")
public class SessionsUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date expireDate;
    private String token;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
