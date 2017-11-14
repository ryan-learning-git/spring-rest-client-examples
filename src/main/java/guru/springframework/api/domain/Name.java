package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Name implements Serializable {

    private final static long serialVersionUID = 420620315591775395L;

    private String title;
    private String first;
    private String last;

}
