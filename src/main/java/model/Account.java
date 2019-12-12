package model;

import java.math.BigDecimal;
import java.util.Date;

public class Account {
    private String accountNo;
    private BigDecimal balance;
    private Date lastPaidOn;

    public Account(String accountNo, BigDecimal balance, Date lastPaidOn) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.lastPaidOn = lastPaidOn;
    }

    public Account() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAccountNo(){
        return accountNo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Date getLastPaidOn() {
        return lastPaidOn;
    }

    public void setAccountNo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setBalance(BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setLastPaidOn(java.sql.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}