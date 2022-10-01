package me.plantngo.backend.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class RegistrationDTO {

    @NonNull
    String username;

    @NonNull
    String email;

    @NonNull
    String password;

    @NonNull
    Character userType;

    String company;
}
