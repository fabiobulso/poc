package br.com.fabiodarosa.panvelauthorizer2.domain.core.api.discountcodintion;

import java.util.List;

@FunctionalInterface
public interface DiscountCondition {

    List<String> getDiscountConditions(DiscountConditionsInput input, DiscountConditionItemInput toEvaluate);
}
