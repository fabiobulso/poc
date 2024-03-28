package br.com.fabiodarosa.panvelauthorizer2.contract;

import br.com.fabiodarosa.panvelauthorizer2.core.exports.inbound.UserInboundApi;
import br.com.fabiodarosa.panvelauthorizer2.core.exports.inbound.output.UserOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping
@RequiredArgsConstructor
public class UserController {

    private final UserInboundApi userInboundApi;

    @GetMapping("/{user}")
    public Mono<UserOutput> getUser(@PathVariable String user) {
        return userInboundApi.getUser(user);
    }
}
