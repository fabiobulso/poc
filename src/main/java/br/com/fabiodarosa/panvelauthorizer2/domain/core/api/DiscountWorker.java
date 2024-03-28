package br.com.fabiodarosa.panvelauthorizer2.domain.core.api;

import br.com.fabiodarosa.panvelauthorizer2.domain.core.api.discountcodintion.DiscountCondition;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DiscountWorker {
    private String workerName;
    private TransactionWorker transactionWorker;
    private DiscountCondition discountCondition;
}
