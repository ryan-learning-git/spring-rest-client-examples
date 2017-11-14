package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Billing {
    private Set<Card> cards;
}
