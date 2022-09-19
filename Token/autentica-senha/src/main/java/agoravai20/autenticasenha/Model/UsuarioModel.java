package agoravai20.autenticasenha.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UsuarioModel {
    private Integer id;
    @Column(unique = true)
    private String login;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

}
