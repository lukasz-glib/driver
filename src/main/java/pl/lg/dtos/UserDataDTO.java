package pl.lg.dtos;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class UserDataDTO {

    private Long id;
    @NotBlank
    private String username;
    @NotBlank @Email
    private String email;
    @NotBlank
    private String password;
    private String repassword;
    private Boolean active;
}
