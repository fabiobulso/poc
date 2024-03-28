package br.com.fabiodarosa.panvelauthorizer2.infrastructure;

import br.com.fabiodarosa.panvelauthorizer2.core.exports.infrastructure.InfrastructureUserOutbound;
import br.com.fabiodarosa.panvelauthorizer2.core.exports.infrastructure.dtos.UserDTO;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class UserInfrastructure implements InfrastructureUserOutbound {
    @Override
    public Mono<UserDTO> getUser(String userId) {
//        CHAMAR BANCO DE DADOS

        return Mono.just(new UserDTO("User 1"));
    }
}
