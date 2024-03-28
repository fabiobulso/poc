package br.com.fabiodarosa.panvelauthorizer2.core.exports.worker.api;

import lombok.Builder;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Builder
@Getter
@Service
public class DiscountWorker {

    public void print() {
        System.out.println("OI");
    }

}
