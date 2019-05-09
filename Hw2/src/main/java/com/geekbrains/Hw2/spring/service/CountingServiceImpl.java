package com.geekbrains.Hw2.spring.service;


import com.geekbrains.Hw2.spring.dao.CountingDAO;
import com.geekbrains.Hw2.spring.domain.Counting;
import java.util.Set;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;


@Service(value = "paymentService")
public class CountingServiceImpl implements CountingService {

    @Resource(name = "paymentDAO")
    private CountingDAO dao;

    public void addCounting(Counting counting) {
        // debit money logic
        dao.saveCounting(counting);
    }

    public Set<Counting> getCountings() {
        return dao.getCountings();
    }

    @Override

    public Counting get(long id) {
        return dao.get(id);
    }
}
