package br.com.fabiodarosa.panvelauthorizer2.core.exports.infrastructure;

import br.com.fabiodarosa.panvelauthorizer2.core.exports.infrastructure.dtos.UserDTO;
import reactor.core.publisher.Mono;

public interface InfrastructureUserOutbound {
    Mono<UserDTO> getUser(String userId);
}
