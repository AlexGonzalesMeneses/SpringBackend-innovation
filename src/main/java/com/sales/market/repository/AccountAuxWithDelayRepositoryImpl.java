package com.sales.market.repository;

import com.sales.market.model.AccountAux;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

public interface AccountAuxWithDelayRepositoryImpl extends AccountAuxRepository{
    default AccountAux getByIdWithDelay(Long id, Long delay) {
        AccountAux accountAux = getById(id);
        try {
            TimeUnit.SECONDS.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return accountAux;
    }
}
