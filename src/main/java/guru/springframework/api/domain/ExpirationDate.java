package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExpirationDate {

    private final static long serialVersionUID = 4661228813349752965L;

    private String date;
    private Integer timezoneType;
    private String timezone;

}
