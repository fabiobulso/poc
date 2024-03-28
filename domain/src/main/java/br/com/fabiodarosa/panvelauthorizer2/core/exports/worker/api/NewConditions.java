package br.com.fabiodarosa.panvelauthorizer2.core.exports.worker.api;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class NewConditions {

    private List<String> conditions;

}
