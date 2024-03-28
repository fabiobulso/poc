package br.com.fabiodarosa.panvelauthorizer2.domain.core.api;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class NewConditions {

    private List<String> conditions;

}
