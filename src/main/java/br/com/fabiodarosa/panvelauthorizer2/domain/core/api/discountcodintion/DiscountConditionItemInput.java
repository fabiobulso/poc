package br.com.fabiodarosa.panvelauthorizer2.domain.core.api.discountcodintion;

import lombok.Getter;

import java.math.BigDecimal;

@Getter

public class DiscountConditionItemInput {
    private String itemCode;
    private BigDecimal grossPrice;
    private BigDecimal netPrice;
}
