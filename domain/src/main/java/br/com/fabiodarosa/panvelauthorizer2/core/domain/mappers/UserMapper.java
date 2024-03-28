package br.com.fabiodarosa.panvelauthorizer2.core.domain.mappers;

import br.com.fabiodarosa.panvelauthorizer2.core.exports.inbound.output.UserOutput;
import br.com.fabiodarosa.panvelauthorizer2.core.exports.infrastructure.dtos.UserDTO;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserMapper {

    public static UserOutput mapUserToOutput(UserDTO userDTO) {
        return UserOutput.builder()
                .name(userDTO.getName())
                .build();
    }


}
