package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
public class Billing implements Serializable {

    private final static long serialVersionUID = 6577338081290507077L;

    private Set<Card> cards;
}
