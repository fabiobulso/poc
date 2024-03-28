package br.com.fabiodarosa.panvelauthorizer2.domain.core.api.discountcodintion;

import lombok.Getter;

import java.util.List;

@Getter
public class DiscountConditionsInput {
    private String customerIdentifier;
    private List<DiscountConditionItemInput> items;
}
