package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Location implements Serializable {

    private final static long serialVersionUID = -3532048267747973846L;

    private String street;
    private String city;
    private String state;
    private String postcode;
}
