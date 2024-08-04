package academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio;
import java.lang.String;
import java.lang.Integer;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;

import java.net.ProtocolFamily;
import java.util.Objects;

@Value
@Builder
@Getter
public final class Producer {
    private Integer id;
    private String name;

}
