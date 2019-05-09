package com.geekbrains.Hw2.spring.domain;
import java.math.BigDecimal;
import java.util.Objects;

    public class Counting {

        private long id;
        private BigDecimal amount;
        private long humanId;
        private long parentId;

        public Counting() {
        }

        public Counting(BigDecimal amount, long humanId, long parentId) {
            this.amount = amount;
            this.humanId = humanId;
            this.parentId = parentId;
        }

        public Counting(long id, BigDecimal amount, long humanId, long parentId) {
            this.id = id;
            this.amount = amount;
            this.humanId = humanId;
            this.parentId = parentId;
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

        public long getHumanId() {
            return humanId;
        }

        public void setHumanId(long humanId) {
            this.humanId = humanId;
        }

        public long getParentId() {
            return parentId;
        }

        public void setParentId(long parentId) {
            this.parentId = parentId;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Counting other = (Counting) obj;
            if (this.id != other.id) {
                return false;
            }
            if (!Objects.equals(this.amount, other.amount)) {
                return false;
            }
            if (this.humanId != other.humanId) {
                return false;
            }
            if (this.parentId != other.parentId) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 61 * hash + (int) (this.id ^ (this.id >>> 32));
            hash = 61 * hash + Objects.hashCode(this.amount);
            hash = 61 * hash + (int) (this.humanId ^ (this.humanId >>> 32));
            hash = 61 * hash + (int) (this.parentId ^ (this.parentId >>> 32));
            return hash;
        }
    }

