package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class Card {
    private String type;
    private String number;
    private ZonedDateTime date;
    private String iban;
    private String swift;
}
