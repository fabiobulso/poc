package br.com.fabiodarosa.panvelauthorizer2.domain.workers.lastpurchases;

import br.com.fabiodarosa.panvelauthorizer2.domain.core.api.DiscountWorker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LastPurchasesRegistry {
    @Bean
    public DiscountWorker lastPurchaseDiscountWorker() {
        return DiscountWorker.builder()
                .workerName("LAST_PURCHASE")
                .discountCondition((input, toEvaluate) -> List.of(""))
                .build();
    }

}
