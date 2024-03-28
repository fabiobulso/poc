package br.com.fabiodarosa.panvelauthorizer2.core.exports.inbound.output;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class UserOutput {
    private String name;
}
