package br.com.fabiodarosa.panvelauthorizer2.core.domain;

import br.com.fabiodarosa.panvelauthorizer2.core.domain.mappers.UserMapper;
import br.com.fabiodarosa.panvelauthorizer2.core.exports.inbound.UserInboundApi;
import br.com.fabiodarosa.panvelauthorizer2.core.exports.inbound.output.UserOutput;
import br.com.fabiodarosa.panvelauthorizer2.core.exports.infrastructure.InfrastructureUserOutbound;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
public class UserService implements UserInboundApi {

    private final InfrastructureUserOutbound userOutbound;

    @Override
    public Mono<UserOutput> getUser(String userId) {
        return userOutbound.getUser(userId).map(UserMapper::mapUserToOutput);
    }
}
