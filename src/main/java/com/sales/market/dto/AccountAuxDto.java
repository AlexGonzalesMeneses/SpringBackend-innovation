/**
 * @author: Alex Gonzales
 */

package com.sales.market.dto;

import com.sales.market.model.AccountAux;

import java.math.BigDecimal;

public class AccountAuxDto extends DtoBase<AccountAux>{
    private BigDecimal totalDebit;
    private BigDecimal totalCredit;
    private BigDecimal balance;

    public BigDecimal getTotalDebit() {
        return totalDebit;
    }

    public void setTotalDebit(BigDecimal totalDebit) {
        this.totalDebit = totalDebit;
    }

    public BigDecimal getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(BigDecimal totalCredit) {
        this.totalCredit = totalCredit;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
