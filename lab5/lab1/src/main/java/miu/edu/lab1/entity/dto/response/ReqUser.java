package miu.edu.lab1.entity.dto.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ReqUser {
    private long id;
    private String name;
}
