package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.ZonedDateTime;

@Getter
@Setter
public class Card implements Serializable {

    private final static long serialVersionUID = 6203456183354582742L;

    private String type;
    private String number;
    private ExpirationDate expirationDate;
    private String iban;
    private String swift;
}
