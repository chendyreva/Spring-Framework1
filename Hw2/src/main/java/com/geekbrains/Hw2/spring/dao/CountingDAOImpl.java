package com.geekbrains.Hw2.spring.dao;

import com.geekbrains.Hw2.spring.domain.Counting;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Repository;



@Repository(value = "countingDAO")
public class CountingDAOImpl implements CountingDAO {

    private AtomicLong idSequence = new AtomicLong(1L);
    private CopyOnWriteArraySet&lt;Payment&gt; storage = new CopyOnWriteArraySet<Counting>() {
        {
            add(new Counting(idSequence.getAndIncrement(), new BigDecimal(100L), 1L, 2L));
            add(new Counting(idSequence.getAndIncrement(), new BigDecimal(200L), 1L, 3L));
        }
    };

    public void saveCounting(Counting counting) {
        // generate id
        counting.setId(idSequence.getAndIncrement());
        storage.add(counting);
    }

    public Set<Counting> getCountings() {
        return new HashSet<Counting>(storage);
    }



    public Counting get(long id) {
        for (Counting payment : storage) {
            if (payment.getId() == id) {
                return payment;
            }
        }
        return null; // nothing found
    }
}
