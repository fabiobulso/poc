module app.domain {
    requires lombok;
    requires reactor.core;
    requires spring.context;

    exports br.com.fabiodarosa.panvelauthorizer2.core.exports.inbound to app.contract;
    exports br.com.fabiodarosa.panvelauthorizer2.core.exports.inbound.output to app.contract;

    exports br.com.fabiodarosa.panvelauthorizer2.core.exports.infrastructure to app.infrastructure;
    exports br.com.fabiodarosa.panvelauthorizer2.core.exports.infrastructure.dtos to app.infrastructure;

}
