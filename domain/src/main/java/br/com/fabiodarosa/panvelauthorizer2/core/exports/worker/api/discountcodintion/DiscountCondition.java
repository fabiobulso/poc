package br.com.fabiodarosa.panvelauthorizer2.core.exports.worker.api.discountcodintion;

import java.util.List;

@FunctionalInterface
public interface DiscountCondition {

    List<String> getDiscountConditions(DiscountConditionsInput input, DiscountConditionItemInput toEvaluate);
}
