package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Job implements Serializable {

    private final static long serialVersionUID = -4985150429002262656L;

    private String title;
    private String company;
}
