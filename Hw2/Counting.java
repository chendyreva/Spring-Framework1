 package com.geekbrains.nikcode.spring.domain;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author nik
 */
public class Payment {

    private long id;
    private BigDecimal amount;
    private long payerId;
    private long recipientId;

    public Payment() {
    }

    public Payment(BigDecimal amount, long payerId, long recipientId) {
        this.amount = amount;
        this.payerId = payerId;
        this.recipientId = recipientId;
    }

    public Payment(long id, BigDecimal amount, long payerId, long recipientId) {
        this.id = id;
        this.amount = amount;
        this.payerId = payerId;
        this.recipientId = recipientId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPayerId() {
        return payerId;
    }

    public void setPayerId(long payerId) {
        this.payerId = payerId;
    }

    public long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(long recipientId) {
        this.recipientId = recipientId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Payment other = (Payment) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.amount, other.amount)) {
            return false;
        }
        if (this.payerId != other.payerId) {
            return false;
        }
        if (this.recipientId != other.recipientId) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 61 * hash + Objects.hashCode(this.amount);
        hash = 61 * hash + (int) (this.payerId ^ (this.payerId >>> 32));
        hash = 61 * hash + (int) (this.recipientId ^ (this.recipientId >>> 32));
        return hash;
    }
}