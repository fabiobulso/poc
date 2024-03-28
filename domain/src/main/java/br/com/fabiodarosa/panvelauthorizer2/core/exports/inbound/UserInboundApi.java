package br.com.fabiodarosa.panvelauthorizer2.core.exports.inbound;

import br.com.fabiodarosa.panvelauthorizer2.core.exports.inbound.output.UserOutput;
import reactor.core.publisher.Mono;

public interface UserInboundApi {
    Mono<UserOutput> getUser(String userId);

}
